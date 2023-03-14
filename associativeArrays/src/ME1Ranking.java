import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ME1Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> contestPasswordMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!"end of contests".equals(input)) {
            String contest = input.split(":")[0];
            String password = input.split(":")[1];
            contestPasswordMap.putIfAbsent(contest, password);

            input = scanner.nextLine();
        }

        Map<String, Map<String, Integer>> studentMap = new TreeMap<>();

        String command = scanner.nextLine();
        while (!"end of submissions".equals(command)) {
            String currentContest = command.split("=>")[0];
            String currentPassword = command.split("=>")[1];
            String userName = command.split("=>")[2];
            int point = Integer.parseInt(command.split("=>")[3]);


            if (!contestPasswordMap.containsKey(currentContest)) {
                command = scanner.nextLine();
                continue;
            }

            if (!contestPasswordMap.get(currentContest).equals(currentPassword)) {
                command = scanner.nextLine();
                continue;
            }
            studentMap.putIfAbsent(userName, new LinkedHashMap<>());
            studentMap.get(userName).putIfAbsent(currentContest, 0);

            if (point > studentMap.get(userName).get(currentContest)) {
                studentMap.get(userName).put(currentContest, point);
            }

            command = scanner.nextLine();
        }

        String bestStudent = "";
        int maxSum = 0;

        for (Map.Entry<String, Map<String, Integer>> student : studentMap.entrySet()) {
            int sum = 0;
            for (Map.Entry<String, Integer> contest : student.getValue().entrySet()) {
                sum += contest.getValue();
            }
            if (sum > maxSum) {
                bestStudent = student.getKey();
                maxSum = sum;
            }
        }
        System.out.printf("Best candidate is %s with total %d points.%n", bestStudent, maxSum);
        System.out.println("Ranking:");

        for (Map.Entry<String, Map<String, Integer>> student : studentMap.entrySet()) {

            System.out.println(student.getKey());
            Map<Integer, String> sorted = new TreeMap<>(Collections.reverseOrder());
            for (Map.Entry<String, Integer> contest : student.getValue().entrySet()) {

                sorted.put(contest.getValue(), contest.getKey());
            }
            sorted.entrySet().forEach(e -> System.out.println("#  " + e.getValue()+ " -> " + e.getKey()) );
        }
    }
}