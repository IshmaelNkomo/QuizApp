package com.example.admin.quizapp;

/**
 * Created by Admin on 6/7/2017.
 */

public class QuestionLibrary2 {


    // array of questions
    private String textQuestions [] = {
            "1. The Roman Emperor who popularised Christianity?",
            "2. Who split the red sea?",
            "3. Who killed Abel in the bible?",
            "4. In Which continent is the City of Jerusalem?.",
            "5. Who is equivalent to Jesus in Islam? "
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"Julius Caesar", "Nero", "Constantine", "Scipio Africanus"},
            {"Noah", "Joseph", "King James", "Moses"},
            {"Kane", "Goliath", "Solomon", "King Pharaoh"},
            {"Asia", "Africa", "America", "Europe"},
            {"Ismail","Prophet Muhammad","Yusuf","Elijah Muhammad"}
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {"Constantine", "Moses", "Kane", "Asia","Prophet Muhammad"};

    // method returns number of questions
    public int getLength(){
        return textQuestions.length;
    }
    // method returns question from array textQuestions[] based on array index
    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }
    // method return a single multiple choice item for question based on array index,
    // based on number of multiple choice item in the list - 1, 2, 3 or 4 as an argument
    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }
    //  method returns correct answer for the question based on array index
    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }


}
