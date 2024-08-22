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

            if ((rdmNumber % 2 == 0 && Engine.answerEquals("yes", yourAns))
                    || (rdmNumber % 2 > 0 && Engine.answerEquals("no", yourAns))) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                if ((rdmNumber % 2 == 0 && !(Engine.answerEquals(yourAns, "yes")))) {
                    Engine.wrongAnswer(yourAns);
                    Engine.correctAnswers("yes");

                    break;
                } else {
                    if (rdmNumber % 2 > 0 && !(Engine.answerEquals(yourAns, "no"))) {
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



