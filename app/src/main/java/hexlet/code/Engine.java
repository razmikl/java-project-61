package hexlet.code;

import hexlet.code.games.GameEvent;

public class Engine {

    public static int yourChoice;
    public static int gamesChoice() {
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
        yourChoice = App.yourChoice();
        return yourChoice;
    }
    public static void events() {
        if (yourChoice == 2) {
            GameEvent.evenGame();
        }
        if (yourChoice == 3) {
            GameEvent.calculateGame();
        }
        if (yourChoice == 4) {
            GameEvent.gcdGame();
        }
        if (yourChoice == 5) {
            GameEvent.progressionGame();
        }
        if (yourChoice == 6) {
            GameEvent.primeGame();
        }
    }
}
