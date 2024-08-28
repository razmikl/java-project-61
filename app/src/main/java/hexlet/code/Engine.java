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
        final byte ROUNDS_COUNT = 3;

        while (correctAnswersCount < ROUNDS_COUNT) {

            randomNumber1 = Util.randomNumberOnHundred();
            randomNumber2 = Util.randomNumberOnHundred();
            randomNumber3 = Util.randomNumberOnTen();
            randomNumber4 = Util.randomNumberOnTen();
            multiplyNumber = Util.randomNumberOnTen();
            termNumber = Util.randomNumberOnTen() * 2;

            switch (App.getYourChoice()) {
                case "2" -> {
                    EvenGame.correctAnswer(randomNumber1);
                    EvenGame.evenQuestion(randomNumber1);
                }
                case "3" -> {
                    CalculateGame.correctAnswer(randomNumber1, randomNumber2);
                    CalculateGame.calculateQuestion(randomNumber1, randomNumber2);
                }
                case "4" -> {
                    GcdGame.getGCDNumber(randomNumber3 * multiplyNumber, randomNumber4 * multiplyNumber);
                    GcdGame.gcdQuestion(randomNumber3 * multiplyNumber, randomNumber4 * multiplyNumber);
                }
                case "5" -> {
                    ProgressionGame.progressionQuestion();
                }
                case "6" -> {
                    PrimeGame.isPrime(randomNumber1);
                    PrimeGame.primeQuestion(randomNumber1);
                }
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

            if (correctAnswersCount == ROUNDS_COUNT) {
                System.out.println("Congratulations, " + Cli.getUserName() + "!");
            }
        }
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
