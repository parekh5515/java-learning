package DateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now();
//        System.out.println("date is: "+LocalDate.now());
        System.out.println("date is: "+d1);

        LocalTime t1 = LocalTime.now();
        System.out.println("TIme is: "+t1);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println("dt before frmatting is: "+dt);

        DateTimeFormatter myDate = DateTimeFormatter.ofPattern("dd-MM-yyyy hh-mm-ss");
        String formatedDate = dt.format(myDate);

        System.out.println("dt after formating is: "+formatedDate);
    }
}
