package com.cwh.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static String SCORE="com.cwh.MultiActivity.SCORE";
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private Button btnDisplay;

    public static int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void btnClick(View view)
    {
        Intent correctAnsIntent = new Intent(this,question1.class);
        startActivity(correctAnsIntent);


    }
}