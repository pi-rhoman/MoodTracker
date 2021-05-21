package com.example.moodtracker;

class MoodItem {

    private int image;
    private int intRepresentation;

    MoodItem(int image, int intRepresentation){

        this.image = image;
        this.intRepresentation = intRepresentation;
    }

    public int getImage(){
        return image;
    }

    public int getIntRepresentation(){
        return this.intRepresentation;
    }
}
