package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class GcdGame {
    public static void start() {

        Cli.greetUser();
        System.out.println("Find the greatest common divisor of given numbers.");
        Engine.answersLogic();
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void getGCDNumber(int randomNumber, int randomNumber2) {
        int gcdNumber;

        if (randomNumber % randomNumber2 == 0) {
            gcdNumber = randomNumber2;
        } else if (randomNumber2 % randomNumber == 0) {
            gcdNumber = randomNumber;
        } else {
            gcdNumber = GcdGame.findGCD(randomNumber, randomNumber2);
        }
        Engine.setCorrectAnswer(String.valueOf(gcdNumber));
    }
    public static void gcdQuestion(int num1, int num2) {
        System.out.print("Question: " + num1 + " " + num2);
    }
}
