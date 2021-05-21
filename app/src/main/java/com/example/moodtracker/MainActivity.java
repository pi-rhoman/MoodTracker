package com.example.moodtracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.GridLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private List<MoodItem> moodItems;
    private int numMoods = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // create the recyclerview
        recyclerView = findViewById(R.id.Moods);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, numMoods){
            @Override
            public boolean canScrollVertically(){
                // prevent overscroll animation when dragged
                return false;
            }
        });
        moodItems = new ArrayList<>();
        moodItems.add(new MoodItem(R.drawable.very_happy_face, 4));
        moodItems.add(new MoodItem(R.drawable.happy_face, 3));
        moodItems.add(new MoodItem(R.drawable.neutral_face, 2));
        moodItems.add(new MoodItem(R.drawable.unhappy_face, 1));
        moodItems.add(new MoodItem(R.drawable.very_unhappy_face, 0));


        adapter = new MoodAdapter(moodItems, this, new MoodSelector(this));
        recyclerView.setAdapter(adapter);
    }



}
