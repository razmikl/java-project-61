package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Cli;

public class PrimeGame {
    public static void primeGame() {

        Cli.greetUser();
        byte correctAnswersCount = 0;
        final byte roundsCount = 3;
        final int multiplyOnHundred = 100;
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        while (correctAnswersCount < roundsCount) {
            int randomNumber = (int) (Math.random() * multiplyOnHundred + 1);

            System.out.print("Question: " + randomNumber);
            String yourAnswer = App.yourAnswer();

            if (App.isPrime(randomNumber).equals(yourAnswer)) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                App.wrongAnswer(yourAnswer);
                App.correctAnswers(App.isPrime(randomNumber));
                break;
            }
        }
        if (correctAnswersCount == roundsCount) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }
    }
}
