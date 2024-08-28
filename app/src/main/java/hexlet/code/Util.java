package hexlet.code;

public class Util {
    public static int randomNumberOnHundred() {
        final int MULTIPLY_ON_HUNDRED = 100;
        int num = (int) (Math.random() * MULTIPLY_ON_HUNDRED + 1);
        return num;
    }
    public static int randomNumberOnTen() {
        final int MULTIPLY_ON_TEN = 10;
        int num = ((int) (Math.random() * MULTIPLY_ON_TEN + 1)) + 1;
        return num;
    }
}
