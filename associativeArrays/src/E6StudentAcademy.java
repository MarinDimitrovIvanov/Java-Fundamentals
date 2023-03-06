import java.util.*;

public class E6StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<Double>> studentsGrades = new LinkedHashMap<>();
        for (int i = 0; i < num; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            studentsGrades.putIfAbsent(name, new ArrayList<>());
            studentsGrades.get(name).add(grade);
        }

        Map<String, Double> output = new LinkedHashMap<>();

        for (Map.Entry<String, ArrayList<Double>> student: studentsGrades.entrySet()) {
            String studentName = student.getKey();
            List<Double> grades = student.getValue();
            double average = getAverageGrade(grades);
            if (average >= 4.50){
                output.put(studentName, average);
            }
        }

        output.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n",entry.getKey(), entry.getValue()));
    }

    private static double getAverageGrade(List<Double> grades) {
        double sum = 0;
        for (Double grade:grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}
