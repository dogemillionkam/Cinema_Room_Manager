package cinema;
import static cinema.UserInput.ROW_SIZE;
import static cinema.UserInput.COL_SIZE;
import static cinema.CalculateIncome.FULL_PRICE;
import static cinema.CalculateIncome.HALF_PRICE;
import static cinema.CalculateIncome.CURRENT_INCOME;
import static cinema.CalculateIncome.PURCHASED_TICKETS;
public class Statistics {
    public static int totalIncome = 0;
    public static void stats() {
        //Total income
            if (ROW_SIZE * COL_SIZE <= 60) {
                totalIncome = ROW_SIZE * COL_SIZE * FULL_PRICE;
            } else {
                totalIncome = ROW_SIZE / 2 * COL_SIZE * FULL_PRICE + ( ROW_SIZE - ROW_SIZE / 2) * COL_SIZE * HALF_PRICE;
            }
        // Percentage
        float percentage;
//     percentage = (float) CURRENT_INCOME / totalIncome * 100;
        percentage = (float) (100.0 * PURCHASED_TICKETS) / (ROW_SIZE * COL_SIZE);
        System.out.print("Number of purchased tickets:" + PURCHASED_TICKETS + "\n");
        System.out.printf("Percentage: %.2f", percentage);
        System.out.print("%");
        System.out.println();
        System.out.printf(
                "Current income: $%d\n" +
                "Total income: $%d\n",CURRENT_INCOME ,totalIncome);
    }
}
