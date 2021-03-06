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
import text.qiao.com.rerfitrxjavastudy.model.entity.main.LeiBiebean;
import text.qiao.com.rerfitrxjavastudy.util.GlideCacheUtil;
import text.qiao.com.rerfitrxjavastudy.view.adapter.jiekou.DJOnClickLister;

/**
 * @project：RerfitRxJavaStudy
 * @fileName MainAdapter
 * @author：乔少聪
 * @date：2019/1/2 9:25
 * @describe：
 */

public class ImageItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContext;
    private List<String> leiBiebeanList = new ArrayList<>();
    private DJOnClickLister mDJOnClickLister;

    public void setmDJOnClickLister(DJOnClickLister mDJOnClickLister) {
        this.mDJOnClickLister = mDJOnClickLister;
    }

    public ImageItemAdapter(Context mContext, List<String> leiBiebeanList) {
        this.mContext = mContext;
        this.leiBiebeanList = leiBiebeanList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.recycle_item_imagelayout, parent, false);
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
        ImageView iv_main_item;


        public ItemViewHolder(View itemView) {
            super(itemView);
            iv_main_item = itemView.findViewById(R.id.iv_main_item);

        }

        public void setData(String leiBiebean) {
            GlideCacheUtil.getInstance().loadImageView(leiBiebean, iv_main_item);


        }
    }
}
