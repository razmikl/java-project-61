package hexlet.code.games;

import hexlet.code.Engine;

public class CalculateGame {

    public static void start() {

        Engine.answersLogic();
    }

    public static String calculateQuestion(int num1, int num2) {
        return "Question: " + num1 + " + " + num2;
    }
    public static String correctAnswer(int num1, int num2) {
        return String.valueOf(num1 + num2);
    }
}