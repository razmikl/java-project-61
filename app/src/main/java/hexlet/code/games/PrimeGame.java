package hexlet.code.games;

import hexlet.code.Engine;

public class PrimeGame {
    public static void start() {

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Engine.answersLogic();
    }
    public static void isPrime(int number) {
        if (number <= 1) {
            Engine.setCorrectAnswer("no");
            return;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    Engine.setCorrectAnswer("no");
                    return;
                }
            }
        }
        Engine.setCorrectAnswer("yes");
    }
    public static void primeQuestion(int randomNumber) {
        System.out.print("Question: " + randomNumber);
    }
}
