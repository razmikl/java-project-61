package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class EvenGame {
    public static void start() {

        Cli.greetUser();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Engine.answersLogic();
    }
    public static void evenQuestion(int randomNumber) {
        System.out.print("Question: " + randomNumber);
    }
    public static void correctAnswer(int randomNumber) {
        if (randomNumber % 2 == 0) {
            Engine.setCorrectAnswer("yes");
        } else {
            Engine.setCorrectAnswer("no");
        }
    }
}
