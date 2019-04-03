package text.qiao.com.rerfitrxjavastudy.view.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import text.qiao.com.rerfitrxjavastudy.R;
import text.qiao.com.rerfitrxjavastudy.model.entity.caipu.CaiPuQuan;
import text.qiao.com.rerfitrxjavastudy.view.adapter.jiekou.DJOnClickLister;

/**
 * @project：RerfitRxJavaStudy
 * @fileName MainAdapter
 * @author：乔少聪
 * @date：2019/1/2 9:25
 * @describe：
 */

public class CaiPuListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContext;
    private List<CaiPuQuan.ResultBean.ListBean> listBeanList;
    private DJOnClickLister mDJOnClickLister;

    public void setmDJOnClickLister(DJOnClickLister mDJOnClickLister) {
        this.mDJOnClickLister = mDJOnClickLister;
    }

    public CaiPuListAdapter(Context mContext, List<CaiPuQuan.ResultBean.ListBean> listBeanList) {
        this.mContext = mContext;
        this.listBeanList = listBeanList;
    }

    public void setLeiBiebeanList(List<CaiPuQuan.ResultBean.ListBean> listBeanList) {
        this.listBeanList = listBeanList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.recycle_item_wzcitylayout, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {

        if (holder instanceof ItemViewHolder) {
            ItemViewHolder itemViewHolder = (ItemViewHolder) holder;


                    if (listBeanList.get(position) != null) {
                        itemViewHolder.setData(listBeanList.get(position).getName());
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
        if (listBeanList != null&&listBeanList.size()>0) {
            return listBeanList.size();
        }
        return 0;
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {

        TextView tv_main_item;

        public ItemViewHolder(View itemView) {
            super(itemView);

            tv_main_item = itemView.findViewById(R.id.tv_main_item);
        }

        public void setData(String leiBiebean) {
            tv_main_item.setText(leiBiebean);
        }
    }
}
