package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class EvenGame {
    public static void evenGame() {

        Cli.greetUser();
        byte correctAnswersCount = 0;
        final int multiplyOnHundred = 100;
        final byte roundsCount = 3;

        while (correctAnswersCount < roundsCount) {
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

            int rdmNumber = (int) (Math.random() * multiplyOnHundred + 1);
            System.out.print("Question: " + rdmNumber);
            String yourAns = Engine.yourAnswer();

            if ((rdmNumber % 2 == 0 && yourAns.equals("yes")) || (rdmNumber % 2 > 0 && yourAns.equals("no"))) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                if ((rdmNumber % 2 == 0 && !(yourAns.equals("yes")))) {
                    Engine.wrongAnswer(yourAns);
                    Engine.correctAnswers("yes");

                    break;
                } else {
                    if (rdmNumber % 2 > 0 && !(yourAns.equals("no"))) {
                        Engine.wrongAnswer(yourAns);
                        Engine.correctAnswers("no");
                        break;
                    }
                }
            }
            if (correctAnswersCount == roundsCount) {
                System.out.println("Congratulations, " + Cli.getUserName() + "!");
            }
        }
    }
}



