package hexlet.code.games;

import hexlet.code.App;

public class EvenGame {
    public static void evenGame() {

        byte correctAnswersCount = 0;

        while (correctAnswersCount < 3) {
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

            int rdmNumber = (int) (Math.random() * 100 + 1);
            System.out.println("Question: " + rdmNumber);
            String yourAns = App.yourAnswer();

            if ((rdmNumber % 2 == 0 && yourAns.equals("yes"))) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else if ((rdmNumber % 2 > 0 && yourAns.equals("no"))) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else if ((rdmNumber % 2 == 0 && yourAns.equals("no")) || (rdmNumber % 2 > 0 && yourAns.equals("yes"))) {
                System.out.println("'" + yourAns + "' is wrong answer ;(. Correct answer was 'yes'."
                        + "Let's try again, " + App.userName + "!");
                break;
            }
        }
        if (correctAnswersCount == 3) {
            System.out.println("Congratulations, " + App.userName + "!");
        }
    }
}



