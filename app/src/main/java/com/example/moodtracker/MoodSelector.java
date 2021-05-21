package com.example.moodtracker;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.util.Log;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Calendar;
import java.util.Date;

import static androidx.core.content.ContextCompat.checkSelfPermission;

public class MoodSelector {
    private Context context;
    public MoodSelector(Context context){
        this.context = context;
    }
    public void onMoodSelected(int mood){
        long currentTime = System.currentTimeMillis();
        try {
            File folder = new File(context.getExternalFilesDir(null) + "/MoodTracker");
            if(!folder.exists()){
                boolean success = folder.mkdirs();
            }

            boolean success = new File(folder.toString() + "/stuff.csv").createNewFile();
            Log.d("MoodSelector", Boolean.toString(success));
        } catch (IOException e) {
            e.printStackTrace();
        }
//        try {
//            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(context.openFileOutput("config.txt", Context.MODE_PRIVATE));
//            outputStreamWriter.write("Content");
//            outputStreamWriter.close();
//        }
//        catch (IOException e) {
//            Log.e("Exception", "File write failed: " + e.toString());
//        }
//
//            // Todo: record mood and timestamp in separate file
//            // todo: Exit the application
//        try {
//            InputStream inputStream = context.openFileInput("config.txt");
//
//            if ( inputStream != null ) {
//                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
//                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//                String receiveString = "";
//                StringBuilder stringBuilder = new StringBuilder();
//
//                while ( (receiveString = bufferedReader.readLine()) != null ) {
//                    stringBuilder.append("\n").append(receiveString);
//                }
//
//                inputStream.close();
//                Log.d("MoodSelector", stringBuilder.toString());
//            }
//        }
//        catch (FileNotFoundException e) {
//            Log.e("login activity", "File not found: " + e.toString());
//        } catch (IOException e) {
//            Log.e("login activity", "Can not read file: " + e.toString());
//        }

    }
}
