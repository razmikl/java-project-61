package hexlet.code.games;

import hexlet.code.App;

public class PrimeGame {
    public static void primeGame() {

        byte correctAnswersCount = 0;
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        while (correctAnswersCount < 3) {
            int randomNumber = (int) (Math.random() * 100 + 1);

            System.out.println("Question: " + randomNumber);
            String yourAnswer = App.yourAnswer();

            if (App.isPrime(randomNumber).equals(yourAnswer)) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                System.out.print("'" + yourAnswer + "'" + " is wrong answer ;(. "
                        +
                        "Correct answer was '" + App.isPrime(randomNumber) + "'.");
                System.out.println("Let's try again, " + App.userName + "!");
                break;
            }
        }
        if (correctAnswersCount == 3) {
            System.out.println("Congratulations, " + App.userName + "!");
        }
    }
}
