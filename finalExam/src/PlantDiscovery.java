import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> plantsMap = new LinkedHashMap<>();
        Map<String, List<Double>> plantsRating = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String plant = input.split("<->")[0];
            String rarity = input.split("<->")[1];
            plantsMap.putIfAbsent(plant, "");
            plantsMap.put(plant, rarity);
            plantsRating.putIfAbsent(plant, new ArrayList<>());
        }
        String command = scanner.nextLine();

        while (!"Exhibition".equals(command)) {

            if (command.contains("Rate")) {
                command = command.split(":\\s+")[1];
                String plant = command.split("\\s+\\-\\s+")[0];
                double rating = Double.parseDouble(command.split("\\s+\\-\\s+")[1]);
                if (plantsRating.containsKey(plant)){
                    plantsRating.get(plant).add(rating);
                }else {
                    System.out.println("error");
                }
            } else if (command.contains("Update")) {
                command = command.split(":\\s+")[1];
                String plant = command.split(" \\- ")[0];
                String new_rarity = command.split(" \\- ")[1];
                if (plantsMap.containsKey(plant)){
                    plantsMap.put(plant, new_rarity);
                }else {
                    System.out.println("error");
                }
            } else if (command.contains("Reset")) {
                String plant = command = command.split(":\\s+")[1];
                if (plantsMap.containsKey(plant)){
                    plantsRating.get(plant).clear();
                }else {
                    System.out.println("error");
                }
            }
            command = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        plantsMap.entrySet().forEach(e-> System.out.printf("- %s; Rarity: %s; Rating: %.2f%n", e.getKey(), e.getValue(), averageRating(plantsRating, e.getKey()) ));

    }

    private static double averageRating(Map<String, List<Double>> integers,String key) {

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
