import java.util.Scanner;

public class dayOfWeeks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        String[] dayOfWeekArr = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"};
        if (number > 0 && number <=7) {
            System.out.println(dayOfWeekArr[number - 1]);
        }else {
            System.out.println("Invalid day!");
        }
    }
}
