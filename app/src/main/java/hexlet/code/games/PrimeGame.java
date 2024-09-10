package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class PrimeGame {
    public static void start() {
        String[][] array = new String[Engine.ROUNDS_LENGTH][Engine.ROUNDS_LENGTH];

        for (int i = 0; i < array.length; i++) {
            int primeGameRandomNumber = Util.randomNumberOnHundred();
            array[i][0] = PrimeGame.primeQuestion(primeGameRandomNumber);
            array[i][1] = PrimeGame.isPrime(primeGameRandomNumber);
        }
        array[0][2] = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.answersLogic(array);
    }
    public static String isPrime(int number) {
        if (number <= 1) {
            return "no";
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }

    public static String primeQuestion(int randomNumber) {
        return "Question: " + randomNumber;
    }

}
