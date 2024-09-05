package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GcdGame {
    public static void start() {
        final byte arrayLength = 3;
        String[][] array = new String[arrayLength][arrayLength];

        for (int i = 0; i < array.length; i++) {
            int randomNumber3 = Util.randomNumberOnTen();
            int randomNumber4 = Util.randomNumberOnTen();
            int multiplyNumber = Util.randomNumberOnTen();
            array[i][0] = GcdGame.gcdQuestion(randomNumber3 * multiplyNumber, randomNumber4 * multiplyNumber);
            array[i][1] = GcdGame.getGCDNumber(randomNumber3 * multiplyNumber, randomNumber4 * multiplyNumber);
        }
        array[0][2] = "Find the greatest common divisor of given numbers.";
        Engine.answersLogic(array);
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static String getGCDNumber(int randomNumber, int randomNumber2) {
        int gcdNumber;

        if (randomNumber % randomNumber2 == 0) {
            gcdNumber = randomNumber2;
        } else if (randomNumber2 % randomNumber == 0) {
            gcdNumber = randomNumber;
        } else {
            gcdNumber = GcdGame.findGCD(randomNumber, randomNumber2);
        }
        return String.valueOf(gcdNumber);
    }
    public static String gcdQuestion(int num1, int num2) {
        return "Question: " + num1 + " " + num2;
    }
}
