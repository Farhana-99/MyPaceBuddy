package com.example.mypacebuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    private Button btHomeCount;
    private Button btCall;
    private Button btTarget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btHomeCount = (Button) findViewById(R.id.buttonCount);
        btHomeCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomeActivity();
            }
        });

        btCall = (Button) findViewById(R.id.buttonCall);
        btCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCallActivity();
            }
        });

        btTarget = (Button) findViewById(R.id.buttonTarget);
        btTarget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSetTargetActivity();
            }
        });
    }
    public void openHomeActivity(){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void openCallActivity(){
        Intent intent = new Intent(this, CallActivity.class);
        startActivity(intent);
    }

    public void openSetTargetActivity(){
        Intent intent = new Intent(this, SetTargetActivity.class);
        startActivity(intent);
    }
}
