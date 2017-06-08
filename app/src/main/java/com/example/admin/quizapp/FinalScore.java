package com.example.admin.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FinalScore extends AppCompatActivity {

    private Button btnTry,btnQuit;
    private TextView txtPer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_score);

        double h = 5;
        double score = MainActivity.mScore;
        double d = score/h;
        double perc = d*100;

        txtPer =(TextView)findViewById(R.id.finalScore);

        txtPer.setText(""+(int) perc+"%");

        MainActivity.mScore=0;

    }
    public void tryAgain(View v){

        btnTry =(Button)findViewById(R.id.btnFinal);
        Intent goBack = new Intent(FinalScore.this,MainActivity.class);
        startActivity(goBack);
    }
    public void onClick(View view){

        btnQuit = (Button)findViewById(R.id.quitApp);

//        finish();
//        System.exit(1);

        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }
}
