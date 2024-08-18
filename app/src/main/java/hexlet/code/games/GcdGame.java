package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Cli;

public class GcdGame {
    public static void gcdGame() {

        Cli.greetUser();
        int qcdNumber;
        byte correctAnswersCount = 0;

        System.out.println("Find the greatest common divisor of given numbers.");

        while (correctAnswersCount < 3) {
            int multiplyNumber = ((int) (Math.random() * 10 + 1)) + 1;
            int randomNumber = ((int) (Math.random() * 10 + 1)) * multiplyNumber;
            int randomNumber2 = ((int) (Math.random() * 10 + 1)) * multiplyNumber;

            if (randomNumber % randomNumber2 == 0) {
                qcdNumber = randomNumber2;
            } else if (randomNumber2 % randomNumber == 0) {
                qcdNumber = randomNumber;
            } else {
                qcdNumber = App.findGCD(randomNumber, randomNumber2);
            }
            System.out.print("Question: " + randomNumber + " " + randomNumber2);
            String yourAnswer = App.yourAnswer();

            if (yourAnswer.equals(String.valueOf(qcdNumber))) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                App.wrongAnswer(yourAnswer);
                System.out.println("Correct answer was '" + qcdNumber + "'.");
                System.out.println("Let's try again, " + Cli.userName + "!");
                break;
            }
        }
        if (correctAnswersCount == 3) {
            System.out.println("Congratulations, " + Cli.userName + "!");
        }


    }
}
