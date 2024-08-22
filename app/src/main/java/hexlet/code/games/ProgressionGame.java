package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;


public class ProgressionGame {
    public static void progressionGame() {

        Cli.greetUser();
        byte correctAnswersCount = 0;
        final byte roundsCount = 3;
        final int multiplerOnTen = 10;
        final int multiplerOnTwo = 2;
        final int progressionLength = (int) (Math.random() * 10 + 5);
        final String[] progression = new String[progressionLength];

        System.out.println("What number is missing in the progression?");

        while (correctAnswersCount < roundsCount) {
            String replacementNumber = "";
            int randomNumber = ((int) (Math.random() * multiplerOnTen + 1));
            int termNumber = ((int) (Math.random() * multiplerOnTen + 1 * multiplerOnTwo));

            for (int i = 0; i < progression.length; i++) {
                randomNumber = randomNumber + termNumber;
                progression[i] = String.valueOf(randomNumber);
            }
            for (int i = 0; i < progression.length; i++) {
                int positionNumber = ((int) (Math.random() * multiplerOnTen));
                if (positionNumber < progression.length) {
                    replacementNumber = progression[positionNumber];
                    progression[positionNumber] = "..";
                    break;
                }
            }
            System.out.print("Question: ");
            for (int i = 0; i < progression.length; i++) {
                System.out.print(progression[i] + " ");
            }
            String yourAnswer = Engine.yourAnswer();

            if (Engine.answerEquals(replacementNumber, yourAnswer)) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                Engine.wrongAnswer(yourAnswer);
                Engine.correctAnswers(replacementNumber);
                break;
            }
        }
        if (correctAnswersCount == roundsCount) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }
    }
}
