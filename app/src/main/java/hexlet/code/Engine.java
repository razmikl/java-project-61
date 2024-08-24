package hexlet.code;

import hexlet.code.games.CalculateGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;

public class Engine {

    private static int randomNumber3;
    private static String replacementNumber;
    private static int termNumber;

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
    public static void correctAnswers(String correctAnswer) {
        System.out.println("Correct answer was '" + correctAnswer + "'.");
        System.out.println("Let's try again, " + Cli.getUserName() + "!");
    }
    public static boolean answerEquals(String correctAnswer, String yourAnswer) {
        return yourAnswer.equals(correctAnswer);
    }
    public static void answersLogic() {

        int correctAnswersCount = 0;
        final byte roundsCount = 3;
        String correctAnswer = "";

        while (correctAnswersCount < roundsCount) {

            int randomNumber1 = randomNumberOnHundred();
            int randomNumber2 = randomNumberOnHundred();
            randomNumber3 = randomNumberOnTen();
            int randomNumber4 = randomNumberOnTen();
            int multiplyNumber = randomNumberOnTen();
            termNumber = randomNumberOnTen() * 2;

            switch (App.getYourChoice()) {
                case "2" -> EvenGame.evenQuestion(randomNumber1);
                case "3" -> CalculateGame.calculateQuestion(randomNumber1, randomNumber2);
                case "4" -> GcdGame.gcdQuestion(randomNumber3 * multiplyNumber, randomNumber4 * multiplyNumber);
                case "5" -> ProgressionGame.progressionQuestion();
                case "6" -> PrimeGame.primeQuestion(randomNumber1);
                default -> System.out.print("");
            }
            switch (App.getYourChoice()) {
                case "2" -> correctAnswer = EvenGame.correctAnswer(randomNumber1);
                case "3" -> correctAnswer = String.valueOf(CalculateGame.correctAnswer(randomNumber1, randomNumber2));
                case "4" -> correctAnswer = GcdGame.getGCDNumber(randomNumber3 * multiplyNumber,
                        randomNumber4 * multiplyNumber);
                case "5" -> correctAnswer = replacementNumber;
                case "6" -> correctAnswer = PrimeGame.isPrime(randomNumber1);
                default -> System.out.print("");
            }

            String yourAnswer = Engine.yourAnswer();

            if (Engine.answerEquals(correctAnswer, yourAnswer)) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else if (!(Engine.answerEquals(correctAnswer, yourAnswer))) {
                Engine.wrongAnswer(yourAnswer);
                Engine.correctAnswers(correctAnswer);
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
        int multiplyNumber = ((int) (Math.random() * multiplyOnTen + 1)) + 1;
        return multiplyNumber;
    }
    public static int getRandomNumber3() {
        return Engine.randomNumber3;
    }
    public static void setRandomNumber3(int randomNumber3) {
        Engine.randomNumber3 = randomNumber3;
    }
    public static String getReplacementNumber() {
        return Engine.replacementNumber;
    }
    public static void setReplacementNumber(String replacementNumber) {
        Engine.replacementNumber = replacementNumber;
    }
    public static int getTermNumber() {
        return Engine.termNumber;
    }
}
