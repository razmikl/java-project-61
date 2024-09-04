package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.CalculateGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.PrimeGame;

import java.util.Scanner;


public class App {
    private static String yourChoice;

    public static void main(String[] args) {

        gamesChoice();
        games();

    }

    public static String gamesChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        System.out.print("Your choice: ");
        yourChoice = sc.nextLine();
        return yourChoice;
    }
    public static void games() {
        switch (getYourChoice()) {
            case ("0") -> System.out.println("Exiting the game.");
            case ("1") -> Cli.greetUser();
            case ("2") -> EvenGame.start();
            case ("3") -> CalculateGame.start();
            case ("4") -> GcdGame.start();
            case ("5") -> ProgressionGame.start();
            case ("6") -> PrimeGame.start();
            default -> System.out.println("Invalid choice. Please, select a valid number.");

        }
    }
    public static String getYourChoice() {
        return yourChoice;
    }




}

