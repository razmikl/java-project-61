package hexlet.code;

import java.util.Scanner;

public class App {

    public static String userName;
    public static int yourChoice;

    public static void main(String[] args) {

    App.welcomeMassage();

    }
    public static String yourAnswer(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Your answer: " );
        String yourAnswer = sc.nextLine();
        return yourAnswer;
    }

    public static int yourChoice(){
        Scanner sc = new Scanner(System.in);
        int yourChoice = sc.nextInt();
        return yourChoice;
    }

    public static void welcomeMassage(){
        Engine.gamesChoice();
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = Cli.setName();
        System.out.println("Hello, " + userName + "!");
        Engine.events();
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


}

