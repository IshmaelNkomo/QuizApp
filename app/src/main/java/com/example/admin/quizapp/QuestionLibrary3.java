package com.example.admin.quizapp;

/**
 * Created by Admin on 6/7/2017.
 */

public class QuestionLibrary3 {

    // array of questions
    private String textQuestions [] = {
            "1. Who is Miss South Africa 2017?",
            "2. How old is Beyonce Knowles?",
            "3. What is Cassper Nyovest real name?",
            "4. She was born in Langa Township died on 09 May 2004?.",
            "5. Who named their Second Studio album after thier age ? "
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {" Adè van Heerden", "Boipelo Mabe", "Demi-Leigh Nel-Peters", "Pearl Thusi"},
            {"35", "31", "29", "28"},
            {"Themba Mthembu", "Tshepo Phoolo", "Refiloe Phoolo", "Thuto Phoolo"},
            {"Miriam Makeba", "Brenda Fassie", "Busi Mhlongo", "Ruth Mompati"},
            {"Beyonce","Toni Braxton","Whitney Houston","Adele"}
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {"Demi-Leigh Nel-Peters", "35", "Refiloe Phoolo", "Brenda Fassie","Adele"};

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
