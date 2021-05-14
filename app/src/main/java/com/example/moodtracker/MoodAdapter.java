package com.example.moodtracker;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class MoodAdapter extends RecyclerView.Adapter<MoodAdapter.ViewHolder> {

    private List<MoodItem> moodItems;
    private Context context;

    MoodAdapter(List<MoodItem> moodItems, Context context){
        this.moodItems = moodItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.mood_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MoodAdapter.ViewHolder holder, int position) {
        MoodItem moodItem = moodItems.get(position);
        holder.textViewHead.setText(moodItem.getHead());
        holder.textViewDesc.setText((moodItem.getDesc()));
    }

    @Override
    public int getItemCount() {
        return moodItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView textViewHead;
        TextView textViewDesc;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewDesc = itemView.findViewById(R.id.textViewDesc);
            textViewHead = itemView.findViewById(R.id.textViewHead);
        }
    }


}
