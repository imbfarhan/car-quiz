package com.cwh.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class wrongans extends AppCompatActivity {

    @Override
    public void onBackPressed() {

        return;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrongans);
        Intent i1 = getIntent();
        int score = i1.getIntExtra(MainActivity.SCORE,0);
        TextView scr = findViewById(R.id.finalscore);
        scr.setText("Final Score:" + Integer.toString(score));


    }

    public void restartQuiz(View view)
    {
        MainActivity.score=0;
        Intent mainintent = new Intent(this,MainActivity.class);
        startActivity(mainintent);
    }

    public void exitApp(View view)
    {
        Intent startMain = new Intent(Intent.ACTION_MAIN);
        startMain.addCategory(Intent.CATEGORY_HOME);
        startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(startMain);
    }

}