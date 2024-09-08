package hexlet.code.games;

import hexlet.code.Util;
import hexlet.code.Engine;

public class ProgressionGame {
    private static String progressionCorrectAnswer = "";
    public static void start() {
        String[][] array = new String[Engine.ROUNDS_LENGTH][Engine.ROUNDS_LENGTH];

        for (int i = 0; i < array.length; i++) {
            int randomNumber3 = Util.randomNumberOnTen();
            int termNumber = Util.randomNumberOnTen() * 2;
            array[i][0] = "Question: " + ProgressionGame.progressionQuestion(randomNumber3, termNumber);
            array[i][1] = ProgressionGame.getProgressionCorrectAnswer();
        }
        array[0][2] = "What number is missing in the progression?";
        Engine.answersLogic(array);
    }

    public static String progressionQuestion(int randomNumber, int termNumber) {
        String progressionResult = "";
        int progressionNumber = randomNumber;

        final int progressionLength = Util.randomNumberOnTen() + 4;
        String[] progression = new String[progressionLength];

        for (int i = 0; i < progression.length; i++) {
            progressionNumber += termNumber;
            progression[i] = String.valueOf(progressionNumber);
        }
        for (int i = 0; i < progression.length; i++) {
            int randomNumber2 = Util.randomNumberOnTen();
            if (randomNumber2 < progression.length) {
                progressionCorrectAnswer = progression[randomNumber2];
                progression[randomNumber2] = "..";
                break;
            }
        }
        for (int i = 0; i < progression.length; i++) {
            progressionResult = progressionResult + progression[i] + " ";
        }
        return progressionResult;
    }

    public static String getProgressionCorrectAnswer() {
        return progressionCorrectAnswer;
    }


}
