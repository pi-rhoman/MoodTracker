package com.example.moodtracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private List<MoodItem> moodItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create the recyclerview
        recyclerView = findViewById(R.id.Moods);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        moodItems = new ArrayList<>();
        for(int i = 0; i <=10; i++){
            MoodItem moodItem = new MoodItem(
                    "heading" + (i+1),
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
            );
            moodItems.add(moodItem);
        }

        adapter = new MoodAdapter(moodItems, this);
        recyclerView.setAdapter(adapter);
    }


}
