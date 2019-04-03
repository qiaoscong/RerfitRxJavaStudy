package text.qiao.com.rerfitrxjavastudy.view.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import text.qiao.com.rerfitrxjavastudy.R;
import text.qiao.com.rerfitrxjavastudy.model.entity.XinWen;
import text.qiao.com.rerfitrxjavastudy.model.entity.main.LeiBiebean;
import text.qiao.com.rerfitrxjavastudy.view.adapter.jiekou.DJOnClickLister;

/**
 * @project：RerfitRxJavaStudy
 * @fileName MainAdapter
 * @author：乔少聪
 * @date：2019/1/2 9:25
 * @describe：
 */

public class XinWenAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContext;
    private  List<XinWen.ResultBean.DataBean> dataBeanList;
    private DJOnClickLister mDJOnClickLister;

    public void setmDJOnClickLister(DJOnClickLister mDJOnClickLister) {
        this.mDJOnClickLister = mDJOnClickLister;
    }

    public XinWenAdapter(Context mContext, List<XinWen.ResultBean.DataBean> dataBeanList, DJOnClickLister mDJOnClickLister) {
        this.mContext = mContext;
        this.dataBeanList = dataBeanList;
        this.mDJOnClickLister = mDJOnClickLister;
    }

    public void setDataBeanList(List<XinWen.ResultBean.DataBean> dataBeanList) {
        this.dataBeanList = dataBeanList;
    }

    public XinWenAdapter(Context mContext, List<LeiBiebean> leiBiebeanList) {
        this.mContext = mContext;

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.recycle_item_xinwenlayout, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {

        if (holder instanceof ItemViewHolder) {
            ItemViewHolder itemViewHolder = (ItemViewHolder) holder;
            if (dataBeanList.get(position) != null) {
                itemViewHolder.setData(dataBeanList.get(position));
            }
            itemViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mDJOnClickLister != null) {
                        mDJOnClickLister.DianJi(v, position);
                    }
                }
            });

        }
    }

    @Override
    public int getItemCount() {
        if (dataBeanList != null && dataBeanList.size() > 0) {
            return dataBeanList.size();
        }
        return 0;
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        RecyclerView recycle_image;
        TextView tv_title;
         ImageItemAdapter mImageItemAdapter;
        public ItemViewHolder(View itemView) {
            super(itemView);
            recycle_image = itemView.findViewById(R.id.recycle_image);
            tv_title = itemView.findViewById(R.id.tv_title);
        }

        public void setData(XinWen.ResultBean.DataBean leiBiebean) {

            List<String> stringList =new ArrayList<>();
            if(!TextUtils.isEmpty(leiBiebean.getThumbnail_pic_s())){
                stringList.add(leiBiebean.getThumbnail_pic_s());
            }
            if(!TextUtils.isEmpty(leiBiebean.getThumbnail_pic_s02())){
                stringList.add(leiBiebean.getThumbnail_pic_s02());
            }
            if(!TextUtils.isEmpty(leiBiebean.getThumbnail_pic_s03())){
                stringList.add(leiBiebean.getThumbnail_pic_s03());
            }
            mImageItemAdapter=new ImageItemAdapter(mContext,stringList);
            recycle_image.setLayoutManager(new GridLayoutManager(mContext,3));
            recycle_image.setAdapter(mImageItemAdapter);
            tv_title.setText(leiBiebean.getTitle());
        }
    }
}
