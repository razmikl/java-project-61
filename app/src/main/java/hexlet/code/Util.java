package hexlet.code;

public class Util {
    public static int randomNumberOnHundred() {
        final int multiplyOnHundred = 100;
        int num = (int) (Math.random() * multiplyOnHundred + 1);
        return num;
    }
    public static int randomNumberOnTen() {
        final int multiplyOnTen = 10;
        int num = ((int) (Math.random() * multiplyOnTen + 1)) + 1;
        return num;
    }
}
