package com.example.android.moviequizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    static int totalPoints;
    RadioButton questionOneAnswerThree;
    RadioButton questionTwoAnswerOne;
    CheckBox questionThreeAnswerTrue;
    CheckBox questionFourAnswerTrue;
    EditText questionFiveEditText;
    CheckBox questionSixAnswerOne;
    CheckBox questionSixAnswerFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionOneAnswerThree = findViewById(R.id.questionOneAnswerThree_radio);
        questionTwoAnswerOne = findViewById(R.id.questionTwoAnswerOne_radio);
        questionThreeAnswerTrue = findViewById(R.id.questionThreeAnswerTrue_checkbox);
        questionFourAnswerTrue = findViewById(R.id.questionFourAnswerTrue_checkbox);
        questionFiveEditText = findViewById(R.id.questionFive_editText);
        questionSixAnswerOne = findViewById(R.id.questionSixAnswerOne_checkbox);
        questionSixAnswerFour = findViewById(R.id.questionSixAnswerFour_checkbox);
    }

    public void submitAnswers(View v) {
        if(questionOneAnswerThree.isChecked()) {
            totalPoints += 1;
        }
        if(questionTwoAnswerOne.isChecked()) {
            totalPoints += 1;
        }
        if(questionThreeAnswerTrue.isChecked()) {
            totalPoints += 1;
        }
        if(questionFourAnswerTrue.isChecked()) {
            totalPoints += 1;
        }
        String questionFiveString = questionFiveEditText.toString();
        if(questionFiveString.equals("Gotham")) {
            totalPoints += 1;
        }
        if((questionSixAnswerOne.isChecked()) && (questionSixAnswerFour.isChecked())) {
            totalPoints += 1;
        }

        
    }

    public void resetAnswers(View v) {
        totalPoints = 0;
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
