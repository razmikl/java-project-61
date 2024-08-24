package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class Engine {

    public static int randomNumber1;
    public static int randomNumber2;
    public static int randomNumber3;
    public static int randomNumber4;
    public static int multiplyNumber;
    public static int termNumber;
    public static String replacementNumber;

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
        byte roundsCount = 3;
        String correctAnswer = "";

        while(correctAnswersCount < roundsCount){

            randomNumber1 = randomNumberOnHundred();
            randomNumber2 = randomNumberOnHundred();
            randomNumber3 = randomNumberOnTen();
            randomNumber4 = randomNumberOnTen();
            multiplyNumber = randomNumberOnTen();
            termNumber = randomNumberOnTen() * 2;

            switch (App.getYourChoice()){
                case "2" -> EvenGame.evenQuestion(randomNumber1);
                case "3" -> CalculateGame.calculateQuestion(randomNumber1, randomNumber2);
                case "4" -> GcdGame.gcdQuestion(randomNumber3 * multiplyNumber, randomNumber4 * multiplyNumber);
                case "5" -> ProgressionGame.progressionQuestion();
                case "6" -> PrimeGame.primeQuestion(randomNumber1);
            }
            switch (App.getYourChoice()){
                case "2" -> correctAnswer = EvenGame.correctAnswer(randomNumber1);
                case "3" -> correctAnswer = String.valueOf(CalculateGame.correctAnswer(randomNumber1, randomNumber2));
                case "4" -> correctAnswer = String.valueOf(GcdGame.getGCDNumber(randomNumber3 * multiplyNumber, randomNumber4 * multiplyNumber));
                case "5" -> correctAnswer = replacementNumber;
                case "6" -> correctAnswer = PrimeGame.isPrime(randomNumber1);
            }

            String yourAnswer = Engine.yourAnswer();

            if(Engine.answerEquals(correctAnswer, yourAnswer)) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else if(!(Engine.answerEquals(correctAnswer, yourAnswer))) {
                Engine.wrongAnswer(yourAnswer);
                Engine.correctAnswers(correctAnswer);
                return;
            }

        if(correctAnswersCount == 3) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
            }
        }
    }
    public static int randomNumberOnHundred(){
        final int multiplyOnHundred = 100;
        int num = (int) (Math.random() * multiplyOnHundred + 1);
        return num;
    }
    public static int randomNumberOnTen(){
        final int multiplyOnTen = 10;
        int multiplyNumber = ((int) (Math.random() * multiplyOnTen + 1)) + 1;
        return multiplyNumber;
    }
}
