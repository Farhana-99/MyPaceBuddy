package com.example.mypacebuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

public class TenMinJog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ten_min_jog);

        TargetHelper targetHelper = new TargetHelper(this);
        SQLiteDatabase database = targetHelper.getReadableDatabase();

        Cursor cursor = database.rawQuery("SELECT TYPE, STEP_LEAST, STEP_MAX FROM TEN_MINUTES_JOG", new String[]{});
        if (cursor != null)
        {
            cursor.moveToFirst();
        }

        StringBuilder builder = new StringBuilder();

        do {
            String type = cursor.getString(0);
            int step_least =cursor.getInt(1);
            int step_max = cursor.getInt(2);

            builder.append("TYPE - "+ type+ "STEP_LEAST - "+step_least+"STEP_MAX"+step_max);
        }while (cursor.moveToNext());

        TextView textView = findViewById(R.id.text10);
        textView.setText(builder.toString());

    }
}
