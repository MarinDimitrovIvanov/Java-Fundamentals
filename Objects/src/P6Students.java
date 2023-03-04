import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P6Students {
    static class Student {
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

        public void setAge(int age) {
            this.age = age;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Student> studentList = new ArrayList<>();
        while (!"end".equals(input)) {
            String[] token = input.split("\\s+");
            String firstName = token[0];
            String lastName = token[1];
            int age = Integer.parseInt(token[2]);
            String homeTown = token[3];

            if (isExist(studentList, firstName, lastName)) {
                int index = getIndex(studentList, firstName, lastName);
                studentList.get(index).setAge(age);
                studentList.get(index).setHometown(homeTown);

            } else {
                Student student = new Student(firstName, lastName, age, homeTown);
                studentList.add(student);
            }
            input = scanner.nextLine();
        }
        String cityName = scanner.nextLine();
        for (Student student : studentList) {
            if (cityName.equals(student.getHometown())) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }

    }

    private static int getIndex(List<Student> studentList, String firstName, String lastName) {
        int index = -1;
        for (int i = 0; i <= studentList.size()-1; i++) {
            Student currentStudent = studentList.get(i);
            if (currentStudent.firstName.equals(firstName) && currentStudent.getLastName().equals(lastName)){
                index = i;
            }
        }
            return  index;
    }

    private static boolean isExist(List<Student> studentList, String firstName, String lastName) {
        for (Student student : studentList) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }
}
