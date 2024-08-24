package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class PrimeGame {
    public static void start() {

        Cli.greetUser();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Engine.answersLogic(isPrime(Engine.getRandomNumber1()));
    }
    public static String isPrime(int number) {
        if (number <= 1) {
            return "no";
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return "no";
                }
            }
        }
        return "yes";
    }
    public static void primeQuestion(int randomNumber) {
        System.out.print("Question: " + randomNumber);
    }
}
