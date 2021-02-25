package com.cos.instagramex;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TopItemAdapter extends RecyclerView.Adapter<TopItemAdapter.MyViewHolder> {

    private final List<String> toplist;

    public TopItemAdapter(List<String> toplist) {
        this.toplist = toplist;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater =
                (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.top_item,parent,false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.setItem(toplist.get(position));
    }

    @Override
    public int getItemCount() {
        return toplist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tvStoty;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvStoty = itemView.findViewById(R.id.tv_story);
        }

    public void setItem(String text){
        tvStoty.setText(text);
    }

    }

}
