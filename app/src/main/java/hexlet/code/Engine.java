package hexlet.code;

import hexlet.code.games.*;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;

public class Engine {

    private static int randomNumber3;
    private static int termNumber;
    private static int randomNumber1;
    private static int randomNumber2;
    private static int randomNumber4;
    private static int multiplyNumber;
    private static String progressionCorrectAnswer;


    public static String yourAnswer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nYour answer: ");
        String yourAnswer = sc.nextLine();
        return yourAnswer;
    }

    public static void wrongAnswer(String yourAnswer) {
        System.out.print("'" + yourAnswer + "'" + " is wrong answer ;(. ");
    }
    public static void yourAnswerIsWrong(String correctQuestionsAnswer) {
        System.out.println("Correct answer was '" + correctQuestionsAnswer + "'.");
        System.out.println("Let's try again, " + Cli.getUserName() + "!");
    }
    public static boolean answerEquals(String correctQuestionAnswer, String yourAnswer) {
        return yourAnswer.equals(correctQuestionAnswer);
    }
    public static void answersLogic() {

        Cli.greetUser();
        int correctAnswersCount = 0;
        final byte roundsCount = 3;
        String[][] array = new String[3][3];

        for (int i = 0; i < array.length; i++) {

            randomNumber1 = Util.randomNumberOnHundred();
            randomNumber2 = Util.randomNumberOnHundred();
            randomNumber3 = Util.randomNumberOnTen();
            randomNumber4 = Util.randomNumberOnTen();
            multiplyNumber = Util.randomNumberOnTen();
            termNumber = Util.randomNumberOnTen() * 2;

            switch (App.getYourChoice()) {
                case "2" -> {
                    array[i][0] = EvenGame.evenQuestion(randomNumber1);
                    array[i][1] = EvenGame.correctAnswer(randomNumber1);
                    array[0][2] = "Answer 'yes' if the number is even, otherwise answer 'no'.";
                }
                case "3" -> {
                    array[i][0] = CalculateGame.calculateQuestion(randomNumber1, randomNumber2);
                    array[i][1] = CalculateGame.correctAnswer(randomNumber1, randomNumber2);
                    array[0][2] = "What is the result of the expression?";
                }
                case "4" -> {
                    array[i][0] = GcdGame.gcdQuestion(randomNumber3 * multiplyNumber, randomNumber4 * multiplyNumber);
                    array[i][1] = GcdGame.getGCDNumber(randomNumber3 * multiplyNumber, randomNumber4 * multiplyNumber);
                    array[0][2] = "Find the greatest common divisor of given numbers.";
                }
                case "5" -> {
                    array[i][0] = ProgressionGame.progressionQuestion(randomNumber3, termNumber);
                    array[i][1] = ProgressionGame.getProgressionCorrectAnswer();
                    array[0][2] = "What number is missing in the progression?";
                }

                case "6" -> {
                    array[i][0] = PrimeGame.primeQuestion(randomNumber1);
                    array[i][1] = PrimeGame.isPrime(randomNumber1);
                    array[0][2] = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
                }
                default -> System.out.print("");
            }
        }

        System.out.println(array[0][2]);
        for (int i = 0; i < roundsCount; i++) {

            System.out.print(array[i][0]);
            String yourAnswer = Engine.yourAnswer();

            if (Engine.answerEquals(array[i][1], yourAnswer)) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else if (!(Engine.answerEquals(array[i][1], yourAnswer))) {
                Engine.wrongAnswer(yourAnswer);
                Engine.yourAnswerIsWrong(array[i][1]);
                return;
            }

            if (correctAnswersCount == roundsCount) {
                System.out.println("Congratulations, " + Cli.getUserName() + "!");
            }
        }
    }
}