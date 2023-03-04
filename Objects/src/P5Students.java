import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P5Students {
    static class Student{
        private String firstName;
        private String lastName;
        private int age;
        private String hometown;

        public Student(String firstName, String lastName, int age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getHometown() {
            return hometown;
        }
    }

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String input = scanner.nextLine();
        List<Student> studentList = new ArrayList<>();
         while (!"end".equals(input)){
            String[] token = input.split("\\s+");
            String firstName = token[0];
            String lastName = token[1];
            int age = Integer.parseInt(token[2]);
            String homeTown = token[3];

            Student student = new Student(firstName, lastName, age, homeTown);
           studentList.add(student);
             input = scanner.nextLine();
         }
        String cityName = scanner.nextLine();
        for (Student student:studentList) {
            if (cityName.equals(student.getHometown())){
                System.out.printf("%s %s is %d years old%n",student.getFirstName(), student.getLastName(),student.getAge());
            }
        }

    }
}
