package com.example.mypacebuddy;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TargetHelper2 extends SQLiteOpenHelper {

    private static final String dbname2 = "SetTarget2";
    private static final int version = 1;

    public TargetHelper2 (Context context){
        super(context, dbname2, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql2 = "CREATE TABLE THIRTY_MINUTES_DIABETIC_PLAN (_NO INTEGER PRIMARY KEY AUTOINCREMENT, TYPE TEXT, GENDER TEXT, STEPS_LEAST INTEGER, STEP_MAX INTEGER)";
        sqLiteDatabase.execSQL(sql2);

        insertData("Type-1", "Male", 4000, 10150, sqLiteDatabase);
        insertData("Type-1", "Female", 3000, 10000, sqLiteDatabase);
        insertData("Type-2", "Male", 5000, 10180, sqLiteDatabase);
        insertData("Type-2", "Female", 4000, 10120, sqLiteDatabase);


    }

    private void insertData(String type, String gender, int step_least, int step_max, SQLiteDatabase database){
        ContentValues values = new ContentValues();
        values.put("Type", type);
        values.put("GENDER", gender);
        values.put("STEPS_LEAST", step_least);
        values.put("STEPS_MAX", step_max);
        database.insert("THIRTY_MINUTES_DIABETIC_PLAN", null, values);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
