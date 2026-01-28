package org.gradletestproject;

import org.application.Game;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{
            Map<String, String> questionMap = game.getQuestionMap();
            for (String question: questionMap.keySet()){
                System.out.println(question);
                String answer = reader.readLine();

                game.checkAnswer(question, answer);

                System.out.println("The score is: " + game.getScore());
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}