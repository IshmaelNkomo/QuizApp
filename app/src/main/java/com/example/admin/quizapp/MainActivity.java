package com.example.admin.quizapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public ImageButton btnPolitics, btnTech,btnChurch,btnCelebrity;
    public RadioButton rbnDlodlo;
    public static int mScore = 0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

//   Method for ImageButton Politics
    public void politics(View v){

        btnPolitics = (ImageButton)findViewById(R.id.btnPolitics);
        Intent politic = new Intent(MainActivity.this,Politics.class);
        startActivity(politic);
    }
//   Method for ImageButton Technology
    public void tech(View v){

        btnTech = (ImageButton)findViewById(R.id.btnTech);
        Intent technology = new Intent(MainActivity.this,Technology.class);
        startActivity(technology);

    }
//    Method for ImageButton Religion
    public void religion(View V){

        btnChurch =(ImageButton)findViewById(R.id.btnChurch);
        Intent church = new Intent(MainActivity.this,Church.class);
        startActivity(church);
    }
//    Method for ImageButton Celebrity
    public void celebrities(View v){

        btnCelebrity = (ImageButton)findViewById(R.id.btnCelebrity);
        Intent celeb = new Intent(MainActivity.this,Celebrity.class);
        startActivity(celeb);
    }


}
