import java.util.*;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Integer>> citiesMap = new LinkedHashMap<>();
        //city [0] population [1] gold
        String input = scanner.nextLine();
        while (!"Sail".equals(input)) {
            String[] inputArr = input.split("\\|\\|");
            String city = inputArr[0];
            int population = Integer.parseInt(inputArr[1]);
            int gold = Integer.parseInt(inputArr[2]);
            if (citiesMap.containsKey(city)) {
                citiesMap.get(city).set(0, population + citiesMap.get(city).get(0));
                citiesMap.get(city).set(1, gold + citiesMap.get(city).get(1));
            } else {
                citiesMap.put(city, new ArrayList<>());
                citiesMap.get(city).add(population);
                citiesMap.get(city).add(gold);
            }
            input = scanner.nextLine();
        }

        String event = scanner.nextLine();
        while (!"End".equals(event)) {
            String town = event.split("=>")[1];
            if (event.contains("Plunder")) {
                int people = Integer.parseInt(event.split("=>")[2]);
                int gold = Integer.parseInt(event.split("=>")[3]);
                System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, gold, people);
                citiesMap.get(town).set(0, citiesMap.get(town).get(0) - people);
                citiesMap.get(town).set(1, citiesMap.get(town).get(1) - gold);
                if (citiesMap.get(town).get(0) <= 0 || citiesMap.get(town).get(1) <= 0) {
                    citiesMap.remove(town);
                    System.out.println(town + " has been wiped off the map!");
                }
            } else if (event.contains("Prosper")) {
                int gold = Integer.parseInt(event.split("=>")[2]);
                if (gold < 0) {
                    System.out.println("Gold added cannot be a negative number!");
                } else {
                    citiesMap.get(town).set(1, citiesMap.get(town).get(1) + gold);
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold, town, citiesMap.get(town).get(1));
                }
            }
            event = scanner.nextLine();
        }
        if (citiesMap.isEmpty()) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", citiesMap.size());
            citiesMap.entrySet().forEach(e-> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",e.getKey(), e.getValue().get(0), e.getValue().get(1)));
        }
    }
}
