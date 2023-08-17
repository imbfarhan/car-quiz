package com.cwh.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class quizcomplete extends AppCompatActivity {

    @Override
    public void onBackPressed() {

        return;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizcomplete);
        Intent i1 = getIntent();
        int score = i1.getIntExtra(MainActivity.SCORE,0);
        TextView scr = findViewById(R.id.finalscore);
        scr.setText("Final Score:" + Integer.toString(score));
    }

}