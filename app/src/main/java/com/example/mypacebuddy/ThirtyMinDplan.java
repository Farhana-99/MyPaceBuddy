package com.example.mypacebuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.widget.TextView;

public class ThirtyMinDplan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirty_min_dplan);

        TargetHelper2 targetHelper2 = new TargetHelper2(this);
        SQLiteDatabase database = targetHelper2.getReadableDatabase();

        Cursor cursor = database.rawQuery("SELECT TYPE, GENDER, STEP_LEAST, STEP_MAX FROM THIRTY_MINUTES_DIABETIC_PLAN", new String[]{});
        if (cursor != null)
        {
            cursor.moveToFirst();
        }

        StringBuilder builder = new StringBuilder();

        do {
            String type = cursor.getString(0);
            String gender = cursor.getString(1);
            int step_least =cursor.getInt(2);
            int step_max = cursor.getInt(3);

            builder.append("TYPE - "+ type+ "GENDER - "+gender+"STEP_LEAST - "+step_least+"STEP_MAX"+step_max);
        }while (cursor.moveToNext());

        TextView textView2 = findViewById(R.id.text30);
        textView2.setText(builder.toString());


    }
}
