import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate myDateObj = LocalDate.now();
        System.out.println("Today's Date is " + myDateObj);
        LocalTime myTimeObj = LocalTime.now();
        System.out.println("Time is " + myTimeObj);
        LocalDateTime inst = LocalDateTime.now();
        System.out.println("The date and time is " + inst);

        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        System.out.println("The formatted LocalDateTime is " + inst.format(myFormatter));
    }
}