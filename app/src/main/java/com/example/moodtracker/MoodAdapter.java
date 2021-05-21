package com.example.moodtracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.function.Function;


public class MoodAdapter extends RecyclerView.Adapter<MoodAdapter.ViewHolder> {

    private List<MoodItem> moodItems;
    private Context context;
    private MoodSelector selector;


    MoodAdapter(List<MoodItem> moodItems, Context context, MoodSelector selector){
        this.moodItems = moodItems;
        this.context = context;
        this.selector = selector;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.mood_item, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MoodAdapter.ViewHolder holder, final int position) {
        MoodItem moodItem = moodItems.get(position);
        // set the correct image
        holder.imageButtonSelect.setImageResource(moodItem.getImage());
        // set the correct on click listener
        holder.imageButtonSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MoodAdapter.this.selector.onMoodSelected(moodItems.get(position).getIntRepresentation());
            }
        });
    }

    @Override
    public int getItemCount() {
        return moodItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        ImageButton imageButtonSelect;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageButtonSelect =  itemView.findViewById(R.id.select);
        }
    }


}
