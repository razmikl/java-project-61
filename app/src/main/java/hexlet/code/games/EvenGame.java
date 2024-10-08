package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class EvenGame {
    public static void start() {
        String[][] evenGameArray = new String[Engine.ROUNDS_LENGTH][Engine.ROUNDS_LENGTH];

        for (int i = 0; i < evenGameArray.length; i++) {
            int evenGameRandomNumber = Util.randomNumberOnHundred();
            evenGameArray[i][0] = EvenGame.evenQuestion(evenGameRandomNumber);
            evenGameArray[i][1] = EvenGame.correctAnswer(evenGameRandomNumber);
        }
        evenGameArray[0][2] = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.answersLogic(evenGameArray);
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
