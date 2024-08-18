package hexlet.code.games;

import hexlet.code.App;

public class PrimeGame {
    public static void primeGame() {

        byte correctAnswersCount = 0;
        String correctAnswer = "";

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        while (correctAnswersCount < 3) {
            int randomNumber = (int) (Math.random() * 100 + 1);
            if (!App.isPrime(randomNumber)) {
                correctAnswer = "no";
            } else {
                correctAnswer = "yes";
            }

            System.out.println("Question: " + randomNumber);
            String yourAnswer = App.yourAnswer();


            if (!(App.isPrime(randomNumber)) && (yourAnswer.equals("no"))) {
                correctAnswer = "no";
                System.out.println("Correct!");
                correctAnswersCount++;
            } else if (App.isPrime(randomNumber) && (yourAnswer.equals("yes"))) {
                correctAnswer = "yes";
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                System.out.print("'" + yourAnswer + "'" + " is wrong answer ;(. ");
                System.out.println("Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + App.userName + "!");
                break;
            }
        }
        if (correctAnswersCount == 3) {
            System.out.println("Congratulations, " + App.userName + "!");
        }
    }
}
