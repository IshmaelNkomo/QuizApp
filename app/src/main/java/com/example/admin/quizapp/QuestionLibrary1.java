package com.example.admin.quizapp;

/**
 * Created by Admin on 6/7/2017.
 */

public class QuestionLibrary1 {

    // array of questions
    private String textQuestions [] = {
            "1. Java was initially named?",
            "2. Where in America is Google based?",
            "3. What does the term IoT stand for?",
            "4. Who is Jonathan Ive?.",
            "5. Who is the founder of SpaceX"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"Oak", "Java Script", "C++", "Ajax"},
            {"New York", "California", "Silicon Valley", "Las Vegas"},
            {"Internet of Things", "Internet of Tech", "Independent operating Tech", "Internet of Tech"},
            {"chief design officer Apple Inc", "Steve Jobs's Son", "The Founder of Facebook", "Android Developer"},
            {"Palmer Luckey","Bill Gates","Mark Zuckerberg News","Elon Mask"}
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {"Oak", "Silicon Valley", "Internet of Things", "chief design officer Apple Inc","Elon Mask"};

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
