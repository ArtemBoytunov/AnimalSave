package com.example.animalsave;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Menu extends AppCompatActivity {
    private Button Cat, Dog, btnCharity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Cat = (Button) findViewById(R.id.imageCat);
        Dog = (Button) findViewById(R.id.imageDog);
        btnCharity = (Button) findViewById(R.id.charity);

        Cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, CatsActivity.class);
                startActivity(intent);
            }
        });

        Dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, DogsActivity.class);
                startActivity(intent);
            }
        });

        btnCharity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, CharityActivity.class);
                startActivity(intent);
            }
        });
    }




}