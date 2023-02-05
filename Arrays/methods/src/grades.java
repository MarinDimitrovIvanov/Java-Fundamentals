import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grades = Double.parseDouble(scanner.nextLine());
        printGradesWord(grades);
    }
    public static void printGradesWord(double grade){
        String word = "";
     if (grade >= 2 && grade < 3.00){
            word = "Fail";
        }else if (grade < 3.50){
            word = "Poor";
        }else if (grade < 4.50) {
            word = "Good";
        }else if (grade < 5.50) {
            word = "Very good";
        }else if (grade < 6.00) {
            word = "Excellent";
        }
        System.out.printf("%s",word);

     }

}
