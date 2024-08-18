package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.App;

public class CalculateGame {
    public static void calculateGame() {

        Cli.greetUser();
        byte roundsCount = 3;
        byte correctAnswersCount = 0;
        System.out.println("What is the result of the expression?");

        while (correctAnswersCount < roundsCount) {
            int num1 = (int) (Math.random() * 100 + 1);
            int num2 = (int) (Math.random() * 100 + 1);
            int sum = num1 + num2;

            System.out.print("Question: " + num1 + " + " + num2);
            String yourAnswer = App.yourAnswer();

            if (yourAnswer.equals(String.valueOf(sum))) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else if (!(yourAnswer.equals(String.valueOf(sum)))) {
                App.wrongAnswer(yourAnswer);
                App.correctAnswers(String.valueOf(sum));
                break;
            }
        }
        if (correctAnswersCount == roundsCount) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }

    }
}
