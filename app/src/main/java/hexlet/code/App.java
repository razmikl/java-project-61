package hexlet.code;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {

        Engine.gamesChoice();
        Cli.greetUser();
        Engine.events();

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
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static String isPrime(int number) {
        if (number <= 1) {
            return "no";
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return "no";
                }
            }
        }
        return "yes";
    }
    public static void wrongAnswer(String yourAnswer) {
        System.out.print("'" + yourAnswer + "'" + " is wrong answer ;(. ");
    }
    public static void correctAnswers(String correctAnswer) {
        System.out.println("Correct answer was '" + correctAnswer + "'.");
        System.out.println("Let's try again, " + Cli.getUserName() + "!");
    }


}

