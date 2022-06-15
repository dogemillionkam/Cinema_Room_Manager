package cinema;
import java.util.Scanner;

public class Cinema {
    private static int entry;

    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        State state = State.CHOOSINGACTION;
        UserInput.input();
        PrintCinema.setUpCinema();
            while (state.getStateVal() != 0) {
                System.out.print("1. Show the seats\n" +
                        "2. Buy a ticket\n" +
                        "3. Statistics\n" +
                        "0. Exit");
                entry = scanner.nextInt();
                switch (entry) {
                    case 1:
                        PrintCinema.print();
                        state = State.PRINTINGSEAT;
                        break;
                    case 2:
                        CalculateIncome.seatSelection();
                        state = State.BUYINGTICKET;
                        break;
                    case 3:
                        state = state.CHECKINGSTATS;
                        Statistics.stats();
                        break;
                    case 0:
                        state = State.EXIT;
                        break;
                }
            }
        }
    }
