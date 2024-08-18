package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Cli;

public class EvenGame {
    public static void evenGame() {

        Cli.greetUser();
        byte roundsCount = 3;
        byte correctAnswersCount = 0;

        while (correctAnswersCount < roundsCount) {
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

            int rdmNumber = (int) (Math.random() * 100 + 1);
            System.out.print("Question: " + rdmNumber);
            String yourAns = App.yourAnswer();

            if ((rdmNumber % 2 == 0 && yourAns.equals("yes"))) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else if ((rdmNumber % 2 > 0 && yourAns.equals("no"))) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                if ((rdmNumber % 2 == 0 && !(yourAns.equals("yes")))) {
                    App.wrongAnswer(yourAns);
                    System.out.println("Correct answer was 'yes'.");
                    System.out.println("Let's try again, " + Cli.getUserName() + "!");
                    break;
                } else {
                    if (rdmNumber % 2 > 0 && !(yourAns.equals("no"))) {
                        App.wrongAnswer(yourAns);
                        System.out.println("Correct answer was 'no'.");
                        System.out.println("Let's try again, " + Cli.getUserName() + "!");
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



