package com.example.admin.quizapp;

/**
 * Created by Admin on 6/2/2017.
 */

public class QuestionLibrary {

    // array of questions
    private String textQuestions [] = {
            "1. Who is South African Minister of Tourism?",
            "2. Which year was Mandela sentenced to life imprisonment?",
            "3. Who is the current leader of Democratic Alliance (South Africa)?",
            "4. Who is the president of South Africa?.",
            "5. Who is the Deputy President of South Africa"
    };
    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"Ayanda Dlodlo", "Fikile Mbalula", "Faith Muthambi", "Thokozile Xasa"},
            {"1994", "1961", "1964", "2013"},
            {"Mmusi Maimane", " Helen Zille", "Patricia de Lille", "Tony Leon"},
            {"Thabo Mbeki", "Nelson Mandela", "Jacob Zuma", "Cyrial Ramaphosa"},
            {"Kgalema Motlanthe","Cyrial Ramaphosa","Nkosazana Dlamini-zuma","Mosebenzi Zwane"}
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {"Thokozile Xasa", "1964", "Mmusi Maimane", "Jacob Zuma","Cyrial Ramaphosa"};

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
