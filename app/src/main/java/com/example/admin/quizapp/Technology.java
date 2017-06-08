package com.example.admin.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Technology extends AppCompatActivity {

    QuestionLibrary1 mQuestionLibrary = new QuestionLibrary1();

    private TextView mScoreView;   // view for current total score
    private TextView mQuestionView;  //current question to answer
//    private TextView finalPercentage; // Showing final score in percentages

    private RadioButton rbnRadio1,rbnRadio2,rbnRadio3,rbnRadio4;

    private String mAnswer;
    private int mQuestionNumber = 0;

    int total = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technology);

        // setup screen for the first question with four alternative to answer
        mScoreView = (TextView)findViewById(R.id.score1);
        mQuestionView = (TextView)findViewById(R.id.question1);
//        finalPercentage =(TextView)findViewById(R.id.finalScore);
        rbnRadio1 =(RadioButton)findViewById(R.id.tech1);
        rbnRadio2 =(RadioButton)findViewById(R.id.tech2);
        rbnRadio3 = (RadioButton)findViewById(R.id.tech3);
        rbnRadio4 = (RadioButton)findViewById(R.id.tech4);


        updateQuestions();
        updateScore(MainActivity.mScore);
    }
    public void updateQuestions(){

        // check if we are not outside array bounds for questions

        if(mQuestionNumber<mQuestionLibrary.getLength()){

            // set the text for new question, and new 4 alternative to answer on four buttons
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            rbnRadio1.setText(mQuestionLibrary.getChoice(mQuestionNumber,1));
            rbnRadio1.setChecked(false);
            rbnRadio2.setText(mQuestionLibrary.getChoice(mQuestionNumber,2));
            rbnRadio2.setChecked(false);
            rbnRadio3.setText(mQuestionLibrary.getChoice(mQuestionNumber,3));
            rbnRadio3.setChecked(false);
            rbnRadio4.setText(mQuestionLibrary.getChoice(mQuestionNumber,4));
            rbnRadio4.setChecked(false);
            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }
        else {

            Toast.makeText(Technology.this, "It was the last question!", Toast.LENGTH_SHORT);
            Intent intent = new Intent(Technology.this, FinalScore.class);
            intent.putExtra("score", MainActivity.mScore); // pass the current score to the second screen
            startActivity(intent);

        }
    }

    // show current total score for the user
    private void updateScore(int point) {
        mScoreView.setText("" + MainActivity.mScore+"/"+mQuestionLibrary.getLength());
    }

    public void onClick(View view) {
        //all logic for all answers buttons in one method
        Button answer = (Button) view;
        // if the answer is correct, increase the score
        if (answer.getText() == mAnswer){
            MainActivity.mScore = MainActivity.mScore + 1;
            Toast.makeText(Technology.this, "Correct!", Toast.LENGTH_SHORT);
        }else
            Toast.makeText(Technology.this, "Wrong!", Toast.LENGTH_SHORT);
        // show current total score for the user
        updateScore(MainActivity.mScore);
        // once user answer the question, we move on to the next one, if any
        updateQuestions();
    }


}
