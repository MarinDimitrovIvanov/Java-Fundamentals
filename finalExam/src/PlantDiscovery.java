import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> plantsMap = new LinkedHashMap<>();
        Map<String, List<Integer>> plantsRating = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String plant = input.split("<->")[0];
            String rarity = input.split("<->")[1];
            plantsMap.putIfAbsent(plant, "");
            plantsMap.put(plant, rarity);
        }
        String command = scanner.nextLine();

        while (!"Exhibition".equals(command)) {

            if (command.contains("Rate")) {
                command = command.replace("Rate: ", "");
                String plant = command.split(" \\- ")[0];
                int rating = Integer.parseInt(command.split(" \\- ")[1]);
                if (plantsMap.containsKey(plant)){
                    plantsRating.putIfAbsent(plant, new ArrayList<>());
                    plantsRating.get(plant).add(rating);
                }else {
                    System.out.println("error");
                }
            } else if (command.contains("Update")) {
                command = command.replace("Update: ", "");
                String plant = command.split(" \\- ")[0];
                String new_rarity = command.split(" \\- ")[1];
                if (plantsMap.containsKey(plant)){
                    plantsMap.put(plant, new_rarity);
                }else {
                    System.out.println("error");
                }
            } else if (command.contains("Reset")) {
                String plant = command.replace("Reset: ", "");
                if (plantsMap.containsKey(plant)){
                    plantsRating.put(plant, new ArrayList<>());
                }else {
                    System.out.println("error");
                }
            }
            command = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        plantsMap.entrySet().forEach(e-> System.out.printf("- %s; Rarity: %s; Rating: %.2f%n", e.getKey(), e.getValue(), averageRating(plantsRating, e.getKey()) ));

    }

    private static double averageRating(Map<String, List<Integer>> integers,String key) {

        double average = 0.0;
        if (integers.get(key).size()>0) {
            for (int i = 0; i < integers.get(key).size(); i++) {
                average += integers.get(key).get(i);
            }
            average /= integers.get(key).size();
            return  average;
        }else {
            return average;
        }

    }

}
