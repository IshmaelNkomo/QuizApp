package com.example.admin.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mScoreView;   // view for current total score
    private TextView mQuestionView;  //current question to answer

    private RadioButton rbnRadio1,rbnRadio2,rbnRadio3,rbnRadio4;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // setup screen for the first question with four alternative to answer
//        mScoreView = (TextView)findViewById(R.id.score);
//        mQuestionView = (TextView)findViewById(R.id.question);
//        rbnRadio1 = (RadioButton) findViewById(R.id.Minister_Dlodlo);
//        rbnRadio2 = (RadioButton) findViewById(R.id.Minister_Mbalula);
//        rbnRadio3 = (RadioButton) findViewById(R.id.Minister_Muthambi);
//        rbnRadio4 = (RadioButton) findViewById(R.id.Minister_Xasa);
//        updateQuestion();
    }

//    private void updateQuestion(){
//        // check if we are not outside array bounds for questions
//        if(mQuestionNumber<mQuestionLibrary.getLength() ){
//            // set the text for new question, and new 4 alternative to answer on four buttons
//            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
//            rbnRadio1.setText(mQuestionLibrary.getChoice(mQuestionNumber, 1));
//            rbnRadio2.setText(mQuestionLibrary.getChoice(mQuestionNumber, 2));
//            rbnRadio3.setText(mQuestionLibrary.getChoice(mQuestionNumber, 3));
//            rbnRadio4.setText(mQuestionLibrary.getChoice(mQuestionNumber,4));
//            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
//            mQuestionNumber++;
//        }
//        else {
//            Toast.makeText(Main2Activity.this, "It was the last question!", Toast.LENGTH_SHORT).show();
////            Intent intent = new Intent(Main2Activity.this, HighestScoreActivity.class);
////            intent.putExtra("score", mScore); // pass the current score to the second screen
////            startActivity(intent);
//        }
//    }

}
