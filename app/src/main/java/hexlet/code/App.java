package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        byte correctAnswersCount = 0;
        String yourAnswer = "";

        System.out.println("Please enter the game number and press Enter.\n" +
                "2 - Even\n" +
                "1 - Greet\n" +
                "0 - Exit");
        System.out.print("Your choice: ");
        int choice = scan.nextInt();


        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = Cli.setName();
        System.out.println("Hello, " + name + "!");

            if (choice == 2) {
                while(correctAnswersCount < 3) {

                    System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

                    int randomNumber = (int) (Math.random() * 100 + 1);
                    System.out.println("Question: " + randomNumber);

                    yourAnswer = App.yourAnswer();

                    if((randomNumber % 2 == 0 && yourAnswer.equals("yes")) || (randomNumber % 2 > 0 && yourAnswer.equals("no"))) {
                        System.out.println("Correct!");
                        correctAnswersCount++;
                    } else if(randomNumber % 2 == 0 && !(yourAnswer.equals("yes"))){
                        System.out.println("'" + yourAnswer + "' is wrong answer ;(. Correct answer was 'yes'.");
                        System.out.println("Let's try again, " + name + "!");
                        break;

                    } else if(randomNumber % 2 > 0 && !(yourAnswer.equals("no"))) {
                        System.out.println("'" + yourAnswer + "' is wrong answer ;(. Correct answer was 'no'.");
                        System.out.println("Let's try again, " + name + "!");
                        break;
                        }

                }
                if(correctAnswersCount == 3){
                    System.out.println("Congratulations, " + name + "!");
            }
        }
    }
    public static String yourAnswer(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Your answer: " );
        String yourAnswer = sc.nextLine();
        return yourAnswer;
    }
}

