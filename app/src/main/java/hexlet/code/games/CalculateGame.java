package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class CalculateGame {

    public static void start() {
        final byte arrayLength = 3;
        String[][] array = new String[3][3];

        for (int i = 0; i < array.length; i++) {
            int randomNumber1 = Util.randomNumberOnHundred();
            int randomNumber2 = Util.randomNumberOnHundred();
            array[i][0] = CalculateGame.calculateQuestion(randomNumber1, randomNumber2);
            array[i][1] = CalculateGame.correctAnswer(randomNumber1, randomNumber2);
        }
        array[0][2] = "What is the result of the expression?";
        Engine.answersLogic(array);
    }

    public static String calculateQuestion(int num1, int num2) {
        return "Question: " + num1 + " + " + num2;
    }
    public static String correctAnswer(int num1, int num2) {
        return String.valueOf(num1 + num2);
    }
}
