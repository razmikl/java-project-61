package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;


public class ProgressionGame {
    public static void start() {

        Cli.greetUser();
        System.out.println("What number is missing in the progression?");
        Engine.answersLogic();
    }
    public static void progressionQuestion() {
        final int progressionLength = Engine.randomNumberOnTen() + 4;
        String[] progression = new String[progressionLength];

        for (int i = 0; i < progression.length; i++) {
            Engine.setRandomNumber3(Engine.getRandomNumber3() + Engine.getTermNumber());
            progression[i] = String.valueOf(Engine.getRandomNumber3());
        }
        for (int i = 0; i < progression.length; i++) {
            int randomNumber = Engine.randomNumberOnTen();
            if (randomNumber < progression.length) {
                Engine.correctAnswer = progression[randomNumber];
                progression[randomNumber] = "..";
                break;
            }
        }
        System.out.print("Question: ");
        for (int i = 0; i < progression.length; i++) {
            System.out.print(progression[i] + " ");
        }
    }

}
