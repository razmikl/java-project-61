package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class CalculateGame {
    public static void calculateGame() {

        Cli.greetUser();
        byte correctAnswersCount = 0;
        final int multiplyOnHundred = 100;
        final byte roundsCount = 3;
        System.out.println("What is the result of the expression?");

        while (correctAnswersCount < roundsCount) {
            int num1 = (int) (Math.random() * multiplyOnHundred + 1);
            int num2 = (int) (Math.random() * multiplyOnHundred + 1);
            int sum = num1 + num2;

            System.out.print("Question: " + num1 + " + " + num2);
            String yourAnswer = Engine.yourAnswer();

            if (yourAnswer.equals(String.valueOf(sum))) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else if (!(yourAnswer.equals(String.valueOf(sum)))) {
                Engine.wrongAnswer(yourAnswer);
                Engine.correctAnswers(String.valueOf(sum));
                break;
            }
        }
        if (correctAnswersCount == roundsCount) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }

    }
}
