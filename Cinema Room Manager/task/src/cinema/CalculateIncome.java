package cinema;

import static cinema.UserInput.ROW_SIZE;
import static cinema.UserInput.COL_SIZE;
import java.util.Scanner;
import static cinema.PrintCinema.cinemaArray;
public class CalculateIncome {
    static Scanner scanner = new Scanner(System.in);

    public static int SELECT_ROW;
    public static int SELECT_COL;

    public static int FULL_PRICE = 10;
    public static int HALF_PRICE = 8;
    public static int CURRENT_INCOME = 0;
    public static int PURCHASED_TICKETS = 0;
    public static void seatSelection() {
        boolean done = false;
        while (!done) {
            System.out.println("Enter a row number:");
            SELECT_ROW = scanner.nextInt();
            System.out.println("Enter a seat number in that row:");
            SELECT_COL = scanner.nextInt();
            if (SELECT_ROW <= 0 || SELECT_ROW > ROW_SIZE || SELECT_COL <= 0 || SELECT_COL > COL_SIZE ) {
                System.out.print("Wrong input!\n");
            } else if (cinemaArray[SELECT_ROW][SELECT_COL] == 98) {
                System.out.println("That ticket has already been purchased!");
            } else {
                done = true; //using a flag
            }

        }

        if (ROW_SIZE * COL_SIZE <= 60) {
            System.out.format("Ticket Price:$%s\n", FULL_PRICE);
            CURRENT_INCOME += FULL_PRICE;
        } else {
            if (SELECT_ROW <= ROW_SIZE / 2) {
                System.out.println("Ticket price: $" + FULL_PRICE);
                CURRENT_INCOME += FULL_PRICE;
            } else {
                System.out.println("Ticket price: $" + HALF_PRICE);
                CURRENT_INCOME += HALF_PRICE;
            }
        }
        ++PURCHASED_TICKETS;
        cinemaArray[SELECT_ROW][SELECT_COL] = 98;
    }
}