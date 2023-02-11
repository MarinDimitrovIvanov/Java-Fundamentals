import java.util.Scanner;

public class mEx1DataType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

      switch (type){
          case "int":
              int number = Integer.parseInt(scanner.nextLine());
              operation(number);
              break;
          case "real":
              double num = Double.parseDouble(scanner.nextLine());
              operation(num);
              break;
          case "string":
              String input = scanner.nextLine();
              operation(input);
              break;
      }
    }
    public static void operation(int num){
        System.out.println(num * 2);
    }
    public static void operation(double num){
        System.out.printf("%.2f", num * 1.5);
    }
    public static void operation(String text){
        System.out.printf("$%s$",text);
    }
}
