package com.example.mypacebuddy;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TargetHelper extends SQLiteOpenHelper {

    private static final String dbname = "SetTarget";
    private static final int version = 1;


    public TargetHelper (Context context){
        super(context, dbname, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "CREATE TABLE TEN_MINUTES_JOG (_phase INTEGER PRIMARY KEY AUTOINCREMENT, TIME TEXT, STEPS_LEAST INTEGER, STEP_MAX INTEGER)";
        sqLiteDatabase.execSQL(sql);
        insertData("Daily", 3000, 4000, sqLiteDatabase);
        insertData("Five Days per Week", 8900, 9000, sqLiteDatabase);
        insertData("Every Two Weeks", 9150, 10150, sqLiteDatabase);

    }

    private  void insertData(String time, int step_least, int step_max, SQLiteDatabase database){
        ContentValues values = new ContentValues();
        values.put("TIME", time);
        values.put("STEP_LEAST", step_least);
        values.put("STEP_MAX", step_max);
        database.insert("TEN_MINUTES_JOG", null, values);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
