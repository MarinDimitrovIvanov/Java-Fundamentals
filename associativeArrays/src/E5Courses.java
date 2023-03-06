import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E5Courses {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, ArrayList<String>> coursesMap = new LinkedHashMap<>();

        while (!"end".equals(input)){
            String course = input.split(" : ")[0];
            String student = input.split(" : ")[1];
            coursesMap.putIfAbsent(course, new ArrayList<>());
            coursesMap.get(course).add(student);
            input=scanner.nextLine();
        }
        coursesMap.entrySet().forEach(entry ->
                                {System.out.println(entry.getKey() + ": " + entry.getValue().size());
                    entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));
                                });

 //       coursesMap.entrySet().forEach(entry -> System.out.printf("%s: %d%n-- %s%n", entry.getKey(), entry.getValue().size(),String.join("\n-- ", entry.getValue())));
    }
}
