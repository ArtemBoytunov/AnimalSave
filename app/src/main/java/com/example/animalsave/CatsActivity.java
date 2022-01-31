package com.example.animalsave;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CatsActivity extends AppCompatActivity {
    private Button CallButton,CallButton1,CallButton2,CallButton3,CallButton4,CallButton5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cats);

        CallButton = (Button) findViewById(R.id.call);
        CallButton1 = (Button) findViewById(R.id.call1);
        CallButton3= (Button) findViewById(R.id.call3);
        CallButton4= (Button) findViewById(R.id.call4);
        CallButton5= (Button) findViewById(R.id.call5);


        CallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(CatsActivity.this, SendActivity.class);
                startActivity(intent);
            }
        });

        CallButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(CatsActivity.this, SendActivity.class);
                startActivity(intent);
            }
        });

        CallButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(CatsActivity.this, SendActivity.class);
                startActivity(intent);
            }
        });

        CallButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(CatsActivity.this, SendActivity.class);
                startActivity(intent);
            }
        });

        CallButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(CatsActivity.this, SendActivity.class);
                startActivity(intent);
            }
        });

    }
}