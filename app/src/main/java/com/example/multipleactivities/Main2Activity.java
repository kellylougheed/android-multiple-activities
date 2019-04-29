package com.example.multipleactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {

    ImageView img;
    Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        img = (ImageView) findViewById(R.id.imageView);

        int randNum = rand.nextInt(2);

        if (randNum == 0) {
            img.setImageResource(R.drawable.cat2);
        } else {
            img.setImageResource(R.drawable.cat1);
        }


    }
}
