package fonyou.test.date_comparison;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {

    public static void runFromHere()  {
        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT FIRST DATE :: ");

        String date1 = sc.nextLine();
        System.out.println("INPUT SECOND DATE :: ");
        String date2 = sc.nextLine();
        LocalDate returnedDate = dateComparison(date1, date2);

        System.out.println("THE LATER DATE IS :: "+returnedDate);
    }

    static LocalDate dateComparison(String date1, String date2) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate lastDate = null;

        LocalDate localDateForDay1 = LocalDate.parse(date1, dateTimeFormatter);
        LocalDate localDateForDay2 = LocalDate.parse(date2, dateTimeFormatter);

        if (localDateForDay1.isEqual(localDateForDay2)) {
            System.out.println("localDateForDay1 is equal localDateForDay2");
            lastDate = localDateForDay1;
        }

        if (localDateForDay1.isBefore(localDateForDay2)) {
            System.out.println("localDateForDay1 is before localDateForDay2");

            lastDate = localDateForDay2;
        }

        if (localDateForDay1.isAfter(localDateForDay2)) {
            System.out.println("localDateForDay1 is after localDateForDay2");
            lastDate =  localDateForDay1;
        }

        return lastDate;
    }
}
