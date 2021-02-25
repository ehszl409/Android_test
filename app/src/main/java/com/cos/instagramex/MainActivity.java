package com.cos.instagramex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity2";
    private RecyclerView rvMainList;
    private RecyclerView rvTopList;
    private TopItemAdapter topItemAdapter;
    private MainItemAdapter mainItemAdapter;
    private TextView tvTest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topInit();
        rvMainList = findViewById(R.id.rv_main_list);

        List<Post> posts = new ArrayList<>();
        posts.add(new Post(1, "apple_korea", "8 HOURS AGO",R.drawable.apple_logo));
        posts.add(new Post(2, "postmalone_insta", "3 HOURS AGO",R.drawable.main_img));
        posts.add(new Post(3, "jennie", "4 HOURS AGO",R.drawable.main_img2));

        mainItemAdapter = new MainItemAdapter(posts);

        LinearLayoutManager manager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rvMainList.setLayoutManager(manager);
        rvMainList.setAdapter(mainItemAdapter);
    }

    public void topInit() {
        rvTopList = findViewById(R.id.rv_top_list);

        List<String> topList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            topList.add("Story");
        }

        topItemAdapter = new TopItemAdapter(topList);

        LinearLayoutManager manager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        rvTopList.setLayoutManager(manager);
        rvTopList.setAdapter(topItemAdapter);
    }
}