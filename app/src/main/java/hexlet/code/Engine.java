package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final byte ROUNDS_LENGTH = 3;

    public static String yourAnswer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nYour answer: ");
        String yourAnswer = sc.nextLine();
        return yourAnswer;
    }

    public static void wrongAnswer(String yourAnswer) {
        System.out.print("'" + yourAnswer + "'" + " is wrong answer ;(. ");
    }
    public static void yourAnswerIsWrong(String correctQuestionsAnswer) {
        System.out.println("Correct answer was '" + correctQuestionsAnswer + "'.");
        System.out.println("Let's try again, " + Cli.getUserName() + "!");
    }
    public static void answersLogic(String[][] array) {

        Cli.greetUser();
        int correctAnswersCount = 0;

        System.out.println(array[0][2]);
        for (int i = 0; i < ROUNDS_LENGTH; i++) {

            System.out.print(array[i][0]);
            String yourAnswer = Engine.yourAnswer();

            if (array[i][1].equals(yourAnswer)) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else  {
                Engine.wrongAnswer(yourAnswer);
                Engine.yourAnswerIsWrong(array[i][1]);
                return;
            }

            if (correctAnswersCount == ROUNDS_LENGTH) {
                System.out.println("Congratulations, " + Cli.getUserName() + "!");
            }
        }
    }
}
