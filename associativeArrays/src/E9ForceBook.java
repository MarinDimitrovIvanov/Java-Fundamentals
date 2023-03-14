import java.util.*;

public class E9ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> sidesMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!"Lumpawaroo".equals(input)) {
            if (input.contains("|")) {
                String forceSide = input.split(" \\| ")[0];
                String forceUser = input.split(" \\| ")[1];

//                if (!sidesMap.containsKey(forceSide)) {
//                    sidesMap.put(forceSide, new ArrayList<>());
//                }
                sidesMap.putIfAbsent(forceSide, new ArrayList<>());

                boolean isExit = false;
                for (List<String> list : sidesMap.values()) {
                    if (list.contains(forceUser)) {
                        isExit = true;
                        break;
                    }
                }
                if (!isExit) {
                    sidesMap.get(forceSide).add(forceUser);
                }
            } else if (input.contains(" -> ")) {
                String forceUser = input.split(" -> ")[0];
                String forceSide = input.split(" -> ")[1];

                sidesMap.entrySet().forEach(entry -> entry.getValue().remove(forceUser));

                if (sidesMap.containsKey(forceSide)) {
                    sidesMap.get(forceSide).add(forceUser);
                } else {
                    sidesMap.put(forceSide, new ArrayList<>());
                    sidesMap.get(forceSide).add(forceUser);
                }
                System.out.println(forceUser + " joins the " + forceSide + " side!");

            }
            input = scanner.nextLine();
        }

        sidesMap.entrySet().stream().filter(e -> e.getValue().size() > 0)
                .forEach(entry -> {
                    System.out.println("Side: " + entry.getKey() + ", Members: " + entry.getValue().size());
                    entry.getValue().forEach(e -> System.out.println("! " + e));

                });
    }
}
