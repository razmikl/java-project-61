package hexlet.code;

import hexlet.code.games.CalculateGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;


public class App {
    private static String yourChoice;

    public static String getYourChoice() {
        return yourChoice;
    }

    public static String gamesChoice() {
        System.out.println("Please enter the game number and press Enter.\n"
                +
                "1 - Greet\n"
                +
                "2 - Even\n"
                +
                "3 - Calc\n"
                +
                "4 - GCD\n"
                +
                "5 - Progression\n"
                +
                "6 - Prime\n"
                +
                "0 - Exit");
        System.out.print("Your choice: ");
        yourChoice = Engine.yourChoice();
        return yourChoice;
    }
    public static void start() {
        switch (getYourChoice()) {
            case ("0") -> System.out.println("Exiting the game.");
            case ("1") -> Cli.greetUser();
            case ("2") -> EvenGame.evenGame();
            case ("3") -> CalculateGame.calculateGame();
            case ("4") -> GcdGame.gcdGame();
            case ("5") -> ProgressionGame.progressionGame();
            case ("6") -> PrimeGame.primeGame();
            default -> System.out.println("Invalid choice. Please, select a valid number.");

        }
    }


}

