package com.quarterlife.horizontalitemscrollwithrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ItemIconAdapter extends RecyclerView.Adapter<ItemIconAdapter.ViewHolder> {
    private List<ItemIconModel> icon_list;
    private Context context;

    public ItemIconAdapter(List<ItemIconModel> icon_list, Context context) {
        this.icon_list = icon_list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_icon,parent,false);

        int parentWidth = parent.getWidth(); // 獲取螢幕寬度
        ViewHolder viewHolder = new ViewHolder(view); // 建立 viewHolder
        ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
        layoutParams.width =  (parentWidth / 8); // 設定一行只顯示 8 個項目

//        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView icon_title;
        private ImageView icon_img;
        private LinearLayout icon_container;

        public ViewHolder(View itemView) {
            super(itemView);
            icon_img = itemView.findViewById(R.id.iconImage);
            icon_title = itemView.findViewById(R.id.iconTitle);
            icon_container = itemView.findViewById(R.id.iconContainer);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        // set data
        holder.icon_title.setText(icon_list.get(position).getTitle());
        holder.icon_img.setImageResource(icon_list.get(position).getImage());

        // set OnClickListener
        holder.icon_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "click : " + position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return icon_list.size();
    }
}
