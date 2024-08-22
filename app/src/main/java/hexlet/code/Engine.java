package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void main(String[] args) {

        App.gamesChoice();
        App.start();

    }
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
}
