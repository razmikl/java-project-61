package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static String setName() {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        return name;
    }

}
