package com.cwh.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class question2 extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private Button btnDisplay;

    @Override
    public void onBackPressed() {

        return;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        Intent i2 = getIntent();
        int score = i2.getIntExtra(MainActivity.SCORE,0);
        TextView scr = findViewById(R.id.score);
        scr.setText("Score:" + Integer.toString(score));
    }

    public void btnClick2(View view)
    {
        Intent correctAnsIntent = new Intent(this,question3.class);
        Intent wrongAnsIntent = new Intent(this,wrongans.class);
        radioGroup = findViewById(R.id.rg2);
        int selectedId = radioGroup.getCheckedRadioButtonId();
        // find the radiobutton by returned id
        radioButton = findViewById(selectedId);
        String ans=radioButton.getText().toString();

        if(ans.equals("Toyota Corolla"))
        {
            MainActivity.score+=1;
            correctAnsIntent.putExtra(MainActivity.SCORE,MainActivity.score);
            startActivity(correctAnsIntent);
        }
        else{
            wrongAnsIntent.putExtra(MainActivity.SCORE,MainActivity.score);
            startActivity(wrongAnsIntent);
        }

    }
}