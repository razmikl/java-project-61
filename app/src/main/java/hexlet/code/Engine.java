package hexlet.code;

import java.util.Scanner;

public class Engine {

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
    public static boolean answerEquals(String correctQuestionAnswer, String yourAnswer) {
        return yourAnswer.equals(correctQuestionAnswer);
    }
    public static void answersLogic(String[][] array) {

        Cli.greetUser();
        int correctAnswersCount = 0;
        final byte roundsCount = 3;

        System.out.println(array[0][2]);
        for (int i = 0; i < roundsCount; i++) {

            System.out.print(array[i][0]);
            String yourAnswer = Engine.yourAnswer();

            if (Engine.answerEquals(array[i][1], yourAnswer)) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else if (!(Engine.answerEquals(array[i][1], yourAnswer))) {
                Engine.wrongAnswer(yourAnswer);
                Engine.yourAnswerIsWrong(array[i][1]);
                return;
            }

            if (correctAnswersCount == roundsCount) {
                System.out.println("Congratulations, " + Cli.getUserName() + "!");
            }
        }
    }
}
