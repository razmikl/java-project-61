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
        System.out.println(array[0][2]);

        for (int correctAnswersCount = 0; correctAnswersCount < ROUNDS_LENGTH; correctAnswersCount++) {
            System.out.print(array[correctAnswersCount][0]);
            String yourAnswer = Engine.yourAnswer();

            if (array[correctAnswersCount][1].equals(yourAnswer)) {
                System.out.println("Correct!");
            } else {
                Engine.wrongAnswer(yourAnswer);
                Engine.yourAnswerIsWrong(array[correctAnswersCount][1]);
                return;
            }
        }
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
    }

}
