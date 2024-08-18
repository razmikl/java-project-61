package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Cli;

public class GcdGame {
    public static void gcdGame() {

        Cli.greetUser();
        int gcdNumber;
        byte correctAnswersCount = 0;

        System.out.println("Find the greatest common divisor of given numbers.");

        while (correctAnswersCount < 3) {
            int multiplyNumber = ((int) (Math.random() * 10 + 1)) + 1;
            int randomNumber = ((int) (Math.random() * 10 + 1)) * multiplyNumber;
            int randomNumber2 = ((int) (Math.random() * 10 + 1)) * multiplyNumber;

            if (randomNumber % randomNumber2 == 0) {
                gcdNumber = randomNumber2;
            } else if (randomNumber2 % randomNumber == 0) {
                gcdNumber = randomNumber;
            } else {
                gcdNumber = App.findGCD(randomNumber, randomNumber2);
            }
            System.out.print("Question: " + randomNumber + " " + randomNumber2);
            String yourAnswer = App.yourAnswer();

            if (yourAnswer.equals(String.valueOf(gcdNumber))) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                App.wrongAnswer(yourAnswer);
                App.correctAnswers(String.valueOf(gcdNumber));
                break;
            }
        }
        if (correctAnswersCount == 3) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }


    }
}
