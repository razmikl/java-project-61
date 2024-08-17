package hexlet.code;

import hexlet.code.games.GameEvent;

public class Engine{

    public static int gamesChoice(){
        System.out.println("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "3 - Calc\n" +
                "4 - GCD\n" +
                "5 - Progression\n" +
                "0 - Exit");
        System.out.print("Your choice: ");
        App.yourChoice = App.yourChoice();
        return App.yourChoice;
    }
    public static void events(){
        if (App.yourChoice == 2) {
            GameEvent.evenGame();
        }
        if (App.yourChoice == 3){
            GameEvent.calculateGame();
        }
        if(App.yourChoice == 4){
            GameEvent.gcdGame();
        }
        if(App.yourChoice == 5){
            GameEvent.progressionGame();
        }
    }
}
