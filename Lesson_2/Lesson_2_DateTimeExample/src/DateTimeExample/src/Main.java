package DateTimeExample.src;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //Lấy ra ngày hiện tại
        LocalDate toDay = LocalDate.now();
        System.out.println("Hôm nay là: " + toDay);

        LocalDate date = LocalDate.of(2020, Month.AUGUST,10);
        System.out.println(date);

        System.out.println("Hôm nay là ngày: " + toDay.getDayOfMonth());
        System.out.println("Hôm nay là ngày: " + toDay.getDayOfWeek());
        System.out.println("Hôm nay là ngày: " + toDay.getDayOfYear());

        System.out.println("Tháng này là: " + toDay.getMonth());
        System.out.println("Tháng này là: " + toDay.getMonthValue());

        System.out.println("Năm nay là: " + toDay.getYear());

        System.out.println("Ngày mai là: " + toDay.plusDays(1));
        System.out.println("Hôm qua là: " + toDay.minusDays(1));

        LocalTime now = LocalTime.now();
        System.out.println("Bây giờ là: " + now);

        LocalTime hour = LocalTime.of(20,30);
        System.out.println(hour);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        LocalDateTime localDateTime = LocalDateTime.of(date, hour);
        System.out.println(localDateTime);

        DateTimeFormatter myFormat =DateTimeFormatter.ofPattern("dd/MM/yyyy  -  hh:mm");
        System.out.println(dateTime.format(myFormat));
    }
}
