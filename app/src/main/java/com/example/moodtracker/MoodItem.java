package com.example.moodtracker;

class MoodItem {
    private String head;
    private String desc;

    MoodItem( String head, String desc){
        this.head = head;
        this.desc = desc;
    }

    String getHead(){
        return head;
    }

    String getDesc(){
        return desc;
    }
}
