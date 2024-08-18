package hexlet.code.games;

import hexlet.code.App;

public class GcdGame {
    public static void gcdGame() {

        int multiplyNumber;
        int qcdNumber;
        int randomNumber;
        int randomNumber2;
        byte correctAnswersCount = 0;

        System.out.println("Find the greatest common divisor of given numbers.");

        while (correctAnswersCount < 3) {
            multiplyNumber = ((int) (Math.random() * 10 + 1)) + 1;
            randomNumber = ((int) (Math.random() * 10 + 1)) * multiplyNumber;
            randomNumber2 = ((int) (Math.random() * 10 + 1)) * multiplyNumber;

            if (randomNumber % randomNumber2 == 0) {
                qcdNumber = randomNumber2;
            } else if (randomNumber2 % randomNumber == 0) {
                qcdNumber = randomNumber;
            } else {
                qcdNumber = App.findGCD(randomNumber, randomNumber2);
            }
            System.out.println("Question: " + randomNumber + " " + randomNumber2);
            String yourAnswer = App.yourAnswer();

            if (yourAnswer.equals(String.valueOf(qcdNumber))) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                System.out.print("'" + yourAnswer + "'" + " is wrong answer ;(. ");
                System.out.println("Correct answer was '" + qcdNumber + "'.");
                System.out.println("Let's try again, " + App.userName + "!");
                break;
            }
        }
        if (correctAnswersCount == 3) {
            System.out.println("Congratulations, " + App.userName + "!");
        }


    }
}
