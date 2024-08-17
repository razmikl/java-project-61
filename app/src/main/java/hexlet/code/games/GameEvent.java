package hexlet.code.games;

import hexlet.code.App;

import java.util.Arrays;

public class GameEvent {
    public static void evenGame() {

        byte correctAnswersCount = 0;
        String yourAnswer = "";

        while (correctAnswersCount < 3) {

            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

            int randomNumber = (int) (Math.random() * 100 + 1);
            System.out.println("Question: " + randomNumber);

            yourAnswer = App.yourAnswer();

            if ((randomNumber % 2 == 0 && yourAnswer.equals("yes")) || (randomNumber % 2 > 0 && yourAnswer.equals("no"))) {
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
                System.out.println("'" + yourAnswer + "' is wrong answer ;(. Correct answer was '" + sum + "'.\n" +
                        "Let's try again, " + App.userName + "!");
                break;
            }
        }
        if (correctAnswersCount == 3) {
            System.out.println("Congratulations, " + App.userName + "!");
        }

    }
    public static void gcdGame() {

        int multiplyNumber;
        int qcdNumber;
        int randomNumber;
        int randomNumber2;
        byte correctAnswersCount = 0;

        System.out.println("Find the greatest common divisor of given numbers.");

        while(correctAnswersCount < 3){
            multiplyNumber = ((int) (Math.random() * 10 + 1)) + 1;
            randomNumber = ((int) (Math.random() * 10 + 1)) * multiplyNumber;
            randomNumber2 = ((int) (Math.random() * 10 + 1)) * multiplyNumber;

            if(randomNumber % randomNumber2 == 0){
                qcdNumber = randomNumber2;
            } else if (randomNumber2 % randomNumber == 0) {
                qcdNumber = randomNumber;
            }else{
                qcdNumber = App.findGCD(randomNumber, randomNumber2);
            }
            System.out.println("Question: " + randomNumber + " " + randomNumber2);
            String yourAnswer = App.yourAnswer();

            if(yourAnswer.equals(String.valueOf(qcdNumber))){
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                System.out.println("'" + yourAnswer + "'" + " is wrong answer ;(. Correct answer was '" + qcdNumber + "'.");
                System.out.println("Let's try again, " + App.userName + "!");
                break;
            }
        }
        if(correctAnswersCount == 3){
            System.out.println("Congratulations, " + App.userName + "!");
        }


    }
    public static void progressionGame() {

        byte correctAnswersCount = 0;
        String[] progression = new String[10];
        String replacementNumber = "";

        System.out.println("What number is missing in the progression?");

        while (correctAnswersCount < 3) {

            int randomNumber = ((int) (Math.random() * 10 + 1));
            int termNumber = ((int) (Math.random() * 10 + 1 * 2));

            for (int i = 0; i < progression.length; i++) {
                randomNumber = randomNumber + termNumber;
                progression[i] = String.valueOf(randomNumber);

            }
            for (int i = 0; i < progression.length; i++) {
                int positionNumber = ((int) (Math.random() * 10));
                if (positionNumber < progression.length) {
                    replacementNumber = progression[positionNumber];
                    progression[positionNumber] = "..";
                    break;
                }
            }

            System.out.println("Question: " + Arrays.toString(progression));
            String yourAnswer = App.yourAnswer();

            if (yourAnswer.equals(replacementNumber)) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                System.out.println("'" + yourAnswer + "'" + " is wrong answer ;(. Correct answer was '" + replacementNumber + "'.");
                System.out.println("Let's try again, " + App.userName + "!");
                break;
            }
        }

        if (correctAnswersCount == 3) {
            System.out.println("Congratulations, " + App.userName + "!");
        }


    }
}



