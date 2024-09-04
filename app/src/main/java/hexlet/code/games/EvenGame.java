package hexlet.code.games;

import hexlet.code.Engine;

public class EvenGame {
    public static void start() {

        Engine.answersLogic();
    }
    public static String evenQuestion(int randomNumber) {
        return "Question: " + randomNumber;
    }
    public static String correctAnswer(int randomNumber) {
        if (randomNumber % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}
