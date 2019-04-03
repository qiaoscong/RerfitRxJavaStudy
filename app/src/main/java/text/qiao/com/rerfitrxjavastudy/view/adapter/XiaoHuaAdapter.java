package text.qiao.com.rerfitrxjavastudy.view.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import text.qiao.com.rerfitrxjavastudy.R;
import text.qiao.com.rerfitrxjavastudy.model.entity.XiaoHua;
import text.qiao.com.rerfitrxjavastudy.model.entity.main.LeiBiebean;
import text.qiao.com.rerfitrxjavastudy.view.adapter.jiekou.DJOnClickLister;

/**
 * @project：RerfitRxJavaStudy
 * @fileName MainAdapter
 * @author：乔少聪
 * @date：2019/1/2 9:25
 * @describe：
 */

public class XiaoHuaAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContext;
    private List<XiaoHua.ResultBean.DataBean> leiBiebeanList = new ArrayList<>();
    private DJOnClickLister mDJOnClickLister;

    public void setmDJOnClickLister(DJOnClickLister mDJOnClickLister) {
        this.mDJOnClickLister = mDJOnClickLister;
    }

    public XiaoHuaAdapter(Context mContext, List<XiaoHua.ResultBean.DataBean> leiBiebeanList) {
        this.mContext = mContext;
        this.leiBiebeanList = leiBiebeanList;
    }

    public void setLeiBiebeanList(List<XiaoHua.ResultBean.DataBean> leiBiebeanList) {
        this.leiBiebeanList = leiBiebeanList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.recycle_item_xiaohualayout, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {

        if (holder instanceof ItemViewHolder) {
            ItemViewHolder itemViewHolder = (ItemViewHolder) holder;
            if (leiBiebeanList.get(position) != null) {
                itemViewHolder.setData(leiBiebeanList.get(position));
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
        if (leiBiebeanList != null && leiBiebeanList.size() > 0) {
            return leiBiebeanList.size();
        }
        return 0;
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {

        TextView tv_main_item;

        public ItemViewHolder(View itemView) {
            super(itemView);

            tv_main_item = itemView.findViewById(R.id.tv_main_item);
        }

        public void setData(XiaoHua.ResultBean.DataBean leiBiebean) {
            tv_main_item.setText(leiBiebean.getContent());
        }
    }
}
