package hexlet.code.games;

import hexlet.code.App;

public class EvenGame {
    public static void evenGame() {

        byte correctAnswersCount = 0;
        String yourAnswer = "";

        while (correctAnswersCount < 3) {

            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

            int randomNumber = (int) (Math.random() * 100 + 1);
            System.out.println("Question: " + randomNumber);

            yourAnswer = App.yourAnswer();

            if ((randomNumber % 2 == 0 && yourAnswer.equals("yes"))) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else if ((randomNumber % 2 > 0 && yourAnswer.equals("no"))) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else if (randomNumber % 2 == 0 && !(yourAnswer.equals("yes"))) {
                System.out.println("'" + yourAnswer + "' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + App.userName + "!");
                break;

            } else if (randomNumber % 2 > 0 && !(yourAnswer.equals("no"))) {
                System.out.println("'" + yourAnswer + "' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + App.userName + "!");
                break;
            }

        }
        if (correctAnswersCount == 3) {
            System.out.println("Congratulations, " + App.userName + "!");
        }


    }
}



