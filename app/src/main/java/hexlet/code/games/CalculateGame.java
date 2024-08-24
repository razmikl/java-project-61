package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class CalculateGame {

    public static void start() {

        Cli.greetUser();
        System.out.println("What is the result of the expression?");
        Engine.answersLogic();
    }

    public static void calculateQuestion(int num1, int num2) {
        System.out.print("Question: " + num1 + " + " + num2);
    }
    public static void correctAnswer(int num1, int num2) {
        Engine.correctAnswer = String.valueOf(num1 + num2);
    }
}
