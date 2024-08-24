package hexlet.code;

import hexlet.code.games.CalculateGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;

public class Engine {

    private static int randomNumber3;
    private static int termNumber;
    private static int randomNumber1;
    private static int randomNumber2;
    private static int randomNumber4;
    private static int multiplyNumber;
    private static String correctAnswer;


    public static String yourAnswer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nYour answer: ");
        String yourAnswer = sc.nextLine();
        return yourAnswer;
    }
    public static String yourChoice() {
        Scanner sc = new Scanner(System.in);
        String yourChoice = sc.nextLine();
        return yourChoice;
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

        int correctAnswersCount = 0;
        final byte roundsCount = 3;

        while (correctAnswersCount < roundsCount) {

            randomNumber1 = randomNumberOnHundred();
            randomNumber2 = randomNumberOnHundred();
            randomNumber3 = randomNumberOnTen();
            randomNumber4 = randomNumberOnTen();
            multiplyNumber = randomNumberOnTen();
            termNumber = randomNumberOnTen() * 2;

            switch (App.getYourChoice()) {
                case "2" -> EvenGame.correctAnswer(randomNumber1);
                case "3" -> CalculateGame.correctAnswer(randomNumber1, randomNumber2);
                case "4" -> GcdGame.getGCDNumber(randomNumber3 * multiplyNumber, randomNumber4 * multiplyNumber);
                case "6" -> PrimeGame.isPrime(randomNumber1);
                default -> System.out.print("");
            }
            switch (App.getYourChoice()) {
                case "2" -> EvenGame.evenQuestion(randomNumber1);
                case "3" -> CalculateGame.calculateQuestion(randomNumber1, randomNumber2);
                case "4" -> GcdGame.gcdQuestion(randomNumber3 * multiplyNumber, randomNumber4 * multiplyNumber);
                case "5" -> ProgressionGame.progressionQuestion();
                case "6" -> PrimeGame.primeQuestion(randomNumber1);
                default -> System.out.print("");
            }

            String yourAnswer = Engine.yourAnswer();

            if (Engine.answerEquals(correctAnswer, yourAnswer)) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else if (!(Engine.answerEquals(correctAnswer, yourAnswer))) {
                Engine.wrongAnswer(yourAnswer);
                Engine.yourAnswerIsWrong(correctAnswer);
                return;
            }

            if (correctAnswersCount == roundsCount) {
                System.out.println("Congratulations, " + Cli.getUserName() + "!");
            }
        }
    }
    public static int randomNumberOnHundred() {
        final int multiplyOnHundred = 100;
        int num = (int) (Math.random() * multiplyOnHundred + 1);
        return num;
    }
    public static int randomNumberOnTen() {
        final int multiplyOnTen = 10;
        int num = ((int) (Math.random() * multiplyOnTen + 1)) + 1;
        return num;
    }
    public static int getRandomNumber3() {
        return randomNumber3;
    }
    public static void setRandomNumber3(int newRandomNumber3) {
        randomNumber3 = newRandomNumber3;
    }
    public static int getTermNumber() {
        return termNumber;
    }
    public static void setCorrectAnswer(String newCorrectAnswer) {
        correctAnswer = newCorrectAnswer;
    }
}
