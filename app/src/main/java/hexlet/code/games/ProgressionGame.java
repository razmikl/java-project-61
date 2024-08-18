package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Cli;


public class ProgressionGame {
    public static void progressionGame() {

        Cli.greetUser();
        byte correctAnswersCount = 0;
        String[] progression = new String[10];
        String replacementNumber = "";

        System.out.println("What number is missing in the progression?");

        while (correctAnswersCount < 3) {
            int randomNumber = ((int) (Math.random() * 10 + 1));
            int termNumber = ((int) (Math.random() * 10 + 1 * 2));

            for (int i = 0; i < progression.length; i++) {
                randomNumber = randomNumber + termNumber;
                progression[i] = String.valueOf(randomNumber);
            }
            for (int i = 0; i < progression.length; i++) {
                int positionNumber = ((int) (Math.random() * 10));
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
            String yourAnswer = App.yourAnswer();

            if (yourAnswer.equals(replacementNumber)) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                App.wrongAnswer(yourAnswer);
                System.out.println("Correct answer was '" + replacementNumber + "'.");
                System.out.println("Let's try again, " + Cli.userName + "!");
                break;
            }
        }
        if (correctAnswersCount == 3) {
            System.out.println("Congratulations, " + Cli.userName + "!");
        }
    }
}
