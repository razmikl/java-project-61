package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

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
            String yourAnswer = Engine.yourAnswer();

            if (Engine.answerEquals(PrimeGame.isPrime(randomNumber), yourAnswer)) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                Engine.wrongAnswer(yourAnswer);
                Engine.correctAnswers(PrimeGame.isPrime(randomNumber));
                break;
            }
        }
        if (correctAnswersCount == roundsCount) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }
    }
    public static String isPrime(int number) {
        if (number <= 1) {
            return "no";
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return "no";
                }
            }
        }
        return "yes";
    }
}
