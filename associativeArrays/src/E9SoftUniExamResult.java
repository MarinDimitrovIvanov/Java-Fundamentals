import java.util.*;

public class E9SoftUniExamResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> submissionsLanguageMap = new LinkedHashMap<>();
        Map<String, Integer> submissionsPointMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!"exam finished".equals(input)) {
            String[] command = input.split("-");
            if (command.length == 3) {
                String userName = command[0];
                String language = command[1];
                int point = Integer.parseInt(command[2]);

                submissionsLanguageMap.putIfAbsent(language, 0);
                submissionsPointMap.putIfAbsent(userName, 0);
                submissionsLanguageMap.put(language,submissionsLanguageMap.get(language)+1);

                if (submissionsPointMap.get(userName) < point) {
                    submissionsPointMap.put(userName, point);
                }

            }else {
                String userName = input.split("-")[0];
                submissionsPointMap.remove(userName);
            }
            input = scanner.nextLine();
        }
        System.out.println("Results:");
        submissionsPointMap.entrySet().forEach(e-> System.out.println(e.getKey() + " | " + e.getValue()));
        System.out.println("Submissions:");
        submissionsLanguageMap.entrySet().forEach(e -> System.out.println(e.getKey()+ " - " + e.getValue()));

    }
}
