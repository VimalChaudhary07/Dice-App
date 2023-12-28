package com.example.diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private Random rng = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice = findViewById(R.id.imageView);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }

    private void rollDice() {
        int randomNumber = rng.nextInt(6) + 1;

        switch (randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.dice_six_faces_one);
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice_six_faces_two);
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice_six_faces_three);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice_six_faces_four);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice_six_faces_five);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice_six_faces_six);
                break;
        }
    }
}