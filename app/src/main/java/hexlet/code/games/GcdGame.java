package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class GcdGame {
    public static void gcdGame() {

        Cli.greetUser();
        int gcdNumber;
        byte correctAnswersCount = 0;
        final int multiplyOnTen = 10;
        final byte roundsCount = 3;

        System.out.println("Find the greatest common divisor of given numbers.");

        while (correctAnswersCount < roundsCount) {
            int multiplyNumber = ((int) (Math.random() * multiplyOnTen + 1)) + 1;
            int randomNumber = ((int) (Math.random() * multiplyOnTen + 1)) * multiplyNumber;
            int randomNumber2 = ((int) (Math.random() * multiplyOnTen + 1)) * multiplyNumber;

            if (randomNumber % randomNumber2 == 0) {
                gcdNumber = randomNumber2;
            } else if (randomNumber2 % randomNumber == 0) {
                gcdNumber = randomNumber;
            } else {
                gcdNumber = GcdGame.findGCD(randomNumber, randomNumber2);
            }
            System.out.print("Question: " + randomNumber + " " + randomNumber2);
            String yourAnswer = Engine.yourAnswer();

            if (yourAnswer.equals(String.valueOf(gcdNumber))) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                Engine.wrongAnswer(yourAnswer);
                Engine.correctAnswers(String.valueOf(gcdNumber));
                break;
            }
        }
        if (correctAnswersCount == roundsCount) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }


    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
