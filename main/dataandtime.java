import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateTimeConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get current date and time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String currentDate = now.format(dateFormatter);
        System.out.println("Current Date: " + currentDate);

        // Get time input in 24-hour format
        System.out.print("Enter time in 24-hour format (HH:mm): ");
        String time24hr = scanner.nextLine();

        try {
            // Parse the 24-hour time
            DateTimeFormatter time24Formatter = DateTimeFormatter.ofPattern("HH:mm");
            LocalDateTime dateTime = LocalDateTime.parse(currentDate + "T" + time24hr, DateTimeFormatter.ISO_LOCAL_DATE_TIME);

            // Format to 12-hour format with AM/PM
            DateTimeFormatter time12Formatter = DateTimeFormatter.ofPattern("hh:mm a");
            String time12hr = dateTime.format(time12Formatter);

            System.out.println("Time in 12-hour format: " + time12hr);

        } catch (DateTimeParseException e) {
            System.out.println("Invalid time format. Please use HH:mm (e.g., 14:30).");
        } finally {
            scanner.close();
        }
    }
}