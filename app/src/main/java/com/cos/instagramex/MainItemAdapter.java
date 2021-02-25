package com.cos.instagramex;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainItemAdapter extends RecyclerView.Adapter<MainItemAdapter.MyViewHolder> {

   private final List<Post> posts;

    public MainItemAdapter(List<Post> posts) {
        this.posts = posts;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater =
                (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.main_item,parent,false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.setItem(posts.get(position));
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tvMainUsername;
        private TextView tvMainUsername2;
        private TextView tvMainTime;
        private ImageView ivMainImg;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvMainUsername = itemView.findViewById(R.id.tv_main_username);
            tvMainUsername2 = itemView.findViewById(R.id.tv_main_username2);
            tvMainTime = itemView.findViewById(R.id.tv_main_time);
            ivMainImg = itemView.findViewById(R.id.iv_main_img);
        }

    public void setItem(Post post){
            tvMainUsername.setText(post.getUsername());
            tvMainUsername2.setText(post.getUsername());
            tvMainTime.setText(post.getTime());
            ivMainImg.setImageResource(post.getImg());
    }

    }

}
