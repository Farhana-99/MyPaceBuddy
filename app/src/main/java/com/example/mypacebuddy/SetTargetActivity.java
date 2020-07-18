package com.example.mypacebuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SetTargetActivity extends AppCompatActivity {
    Button btTen;
    Button btThirty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_target);

        btTen = (Button) findViewById(R.id.tenMin);
        btTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTenMinJog();
            }
        });

        btThirty = (Button) findViewById(R.id.thirtyMin);
        btThirty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openThirtyMinDplan();
            }
        });

    }

    public void openTenMinJog(){
        Intent intent = new Intent(this, TenMinJog.class);
        startActivity(intent);
    }

    public void openThirtyMinDplan(){
        Intent intent = new Intent(this, ThirtyMinDplan.class);
        startActivity(intent);
    }
}
