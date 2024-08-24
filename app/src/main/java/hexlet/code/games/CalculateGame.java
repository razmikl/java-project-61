package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class CalculateGame {

    public static void start() {

        Cli.greetUser();
        System.out.println("What is the result of the expression?");
        Engine.answersLogic(String.valueOf(correctAnswer(Engine.getRandomNumber1(), Engine.getRandomNumber2())));
    }

    public static void calculateQuestion(int num1, int num2) {
        System.out.print("Question: " + num1 + " + " + num2);
    }
    public static int correctAnswer(int num1, int num2) {
        return num1 + num2;
    }
}
