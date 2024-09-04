package hexlet.code.games;

import hexlet.code.Engine;

public class PrimeGame {
    public static void start() {

        Engine.answersLogic();
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
    public static String primeQuestion(int randomNumber) {
        return "Question: " + randomNumber;
    }
}
