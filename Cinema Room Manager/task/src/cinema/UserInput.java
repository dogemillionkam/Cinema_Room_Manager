package cinema;

import java.util.Scanner;

public class UserInput {
    static Scanner scanner = new Scanner(System.in);
    public static int ROW_SIZE;
    public static int COL_SIZE;

    public static void input() {
        System.out.println("Enter the number of rows:");
        ROW_SIZE = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        COL_SIZE = scanner.nextInt();
    }
}
