package cinema;

import java.util.Scanner;

import static cinema.UserInput.ROW_SIZE;
import static cinema.UserInput.COL_SIZE;

public class PrintCinema {
    static int[][] cinemaArray = new int[ROW_SIZE + 1][COL_SIZE + 1];

    public static void setUpCinema() {
        for (int i = 0; i < cinemaArray.length; i++) {
            System.out.println();
            for (int j = 0; j < cinemaArray[i].length; j++) {
                if (i == 0 & j == 0) {
                    cinemaArray[i][j] = -1;
                } else if (i == 0) {
                    cinemaArray[i][j] = j;
                } else if (j == 0) {
                    cinemaArray[i][j] = i;
                } else {
                    cinemaArray[i][j] = 99;
                }
            }
        }
    }

    public static void print() {
        System.out.print("\nCinema:");
        for (int i = 0; i < cinemaArray.length; i++) {
            System.out.println();
            for (int j = 0; j < cinemaArray[0].length; j++) {
                if (cinemaArray[i][j] == -1) {
                    System.out.print("  ");
                } else if (cinemaArray[i][j] == 99) {
                    System.out.print("S ");
                } else if (cinemaArray[i][j] == 98) {
                    System.out.print("B ");
                } else {
                    System.out.print(cinemaArray[i][j] + " ");
                }
            }
        }
        
        System.out.println("\n");
    }
}
