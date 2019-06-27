package com.cust.custopi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.Manifest;

public class Welcome extends AppCompatActivity {
    public static Button btncancel ,btncont ;

    @Override
    public void onBackPressed() {

        Welcome.super.onBackPressed();

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        btncont = (Button)findViewById(R.id.btncon);
        btncancel = (Button)findViewById(R.id.btncancel);

        btncont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(".Homepage");
                startActivity(intent);

            }
        });

        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Welcome.super.onBackPressed();

            }
        });

    }
}
