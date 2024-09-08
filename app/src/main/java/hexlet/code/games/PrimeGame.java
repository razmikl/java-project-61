package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class PrimeGame {
    public static void start() {
        String[][] array = new String[Engine.ROUNDS_LENGTH][Engine.ROUNDS_LENGTH];

        for (int i = 0; i < array.length; i++) {
            int randomNumber1 = Util.randomNumberOnHundred();
            array[i][0] = PrimeGame.primeQuestion(randomNumber1);
            array[i][1] = PrimeGame.isPrime(randomNumber1);
        }
        array[0][2] = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.answersLogic(array);
    }
    public static String isPrime(int number) {
        if (number <= 1) { // Проверка числа на положительность/отрицательность (никак не смогу убрать этот этап)
            return "no";
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            // В случае удачной проверки с выше, то идет основной цикл определения простого числа
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes"; // Максимум того, что смог изменить, опираясь на комментарий 1 от кодревью 5
    }

    public static String primeQuestion(int randomNumber) {
        return "Question: " + randomNumber;
    }

}
