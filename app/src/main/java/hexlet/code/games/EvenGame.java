package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class EvenGame {
    public static void start() {
        String[][] array = new String[Engine.ROUNDS_LENGTH][Engine.ROUNDS_LENGTH];
        for (int i = 0; i < array.length; i++) {
            int randomNumber1 = Util.randomNumberOnHundred();
            array[i][0] = EvenGame.evenQuestion(randomNumber1);
            array[i][1] = EvenGame.correctAnswer(randomNumber1);
        }
        array[0][2] = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.answersLogic(array);
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
