package org.application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// This is a new game

public class Game {

    private int score;
    private Map<String, String> questionMap;

    public Game(){
        questions();
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public Map<String, String> getQuestionMap() {
        return questionMap;
    }

    public Map<String, String> questions(){
        this.questionMap = new HashMap<>();

        questionMap.put("What is the chemical letter for Oxygen?", "O");
        questionMap.put("What is a water molecule made of?", "H2O");
        questionMap.put("What happens when two techtonic plates colide?", "Mountains, EarthQuake");

        return questionMap;
    }

    public void updateScore(){
        int score = this.getScore();
        score += 1;
        this.setScore(score);
    }

    public void checkAnswer(String question, String userAnswer){
        Map<String, String> questionMap = this.getQuestionMap();

        String correctAnswer = questionMap.get(question);
        correctAnswer = correctAnswer.toUpperCase();

        if(correctAnswer.equals(userAnswer)){
            updateScore();
        }
    }
}
