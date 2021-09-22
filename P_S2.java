import java.time.*;
import java.util.*;
public class Main {
    public static void printMonth(int year, int month) {
        YearMonth ym = YearMonth.of(year, month);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int counter = 1;
        int dayValue = LocalDate.of(year, month,1).getDayOfWeek().getValue(); // to get starting day of the month
        if (dayValue != 7)
            for (int i = 0; i < dayValue; i++, counter++) {
                System.out.printf("%-4s", "");
            }

        for (int i = 1; i <= ym.getMonth().length(ym.isLeapYear()); i++, counter++) {
            System.out.printf("%-4d", i);
            if (counter % 7 == 0) {
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Press 1 for jan , 2 for feb, 12 for dec.......");
        int m = sc.nextInt();
        System.out.print("Enter year");
        int y = sc.nextInt();
        System.out.println("Press 1 for mon, 2 for tue, 7 for saturday......");
        int d=sc.nextInt();
        printMonth(y, m);
    }

    
}
