package hexlet.code.games;

import hexlet.code.App;

public class CalculateGame {
    public static void calculateGame() {

        byte correctAnswersCount = 0;
        System.out.println("What is the result of the expression?");

        while (correctAnswersCount < 3) {
            int num1 = (int) (Math.random() * 100 + 1);
            int num2 = (int) (Math.random() * 100 + 1);
            int sum = num1 + num2;

            System.out.println("Question: " + num1 + " + " + num2);
            String yourAnswer = App.yourAnswer();

            if (yourAnswer.equals(String.valueOf(sum))) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else if (!(yourAnswer.equals(String.valueOf(sum)))) {
                App.wrongAnswer(yourAnswer);
                System.out.println("Correct answer was '" + sum + "'.\n");
                System.out.println("Let's try again, " + App.userName + "!");
                break;
            }
        }
        if (correctAnswersCount == 3) {
            System.out.println("Congratulations, " + App.userName + "!");
        }

    }
}
