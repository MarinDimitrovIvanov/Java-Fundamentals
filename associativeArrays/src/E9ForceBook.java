import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E9ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, ArrayList<String>> sidesMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        
        while (!"Lumpawaroo".equals(input)){
         if (input.contains(" | ")){
             String forceSide = input.split(" \\| ")[0];
             String forceUser = input.split(" \\| ")[1];

             sidesMap.putIfAbsent(forceSide, new ArrayList<>());
             if (!sidesMap.values().contains(forceUser)){
                 sidesMap.get(forceSide).add(forceUser);
             }
         } else if (input.contains(" -> ")) {
             String forceSide = input.split(" -> ")[1];
             String forceUser = input.split(" -> ")[0];

             if (!sidesMap.values().contains(forceUser) && sidesMap.containsKey(forceSide)){
                 sidesMap.put(forceSide,new ArrayList<>());
                 sidesMap.get(forceSide).add(forceUser);
             } else if (!sidesMap.containsValue(forceUser) ) {
                 sidesMap.get(forceSide).add(forceUser);
             }else {

                 sidesMap.entrySet().forEach(entry -> entry.getValue().remove(forceUser));
                 sidesMap.get(forceSide).add(forceUser);
                 System.out.println(forceUser + " joins the " + forceSide + " side!");
             }
         }
            input = scanner.nextLine();
        }

            sidesMap.entrySet().stream().filter(e -> e.getValue().size()>0)
                    .forEach(entry -> {
                        System.out.println("Side: " + entry.getKey() + ", Members: " + entry.getValue().size());
                        entry.getValue().forEach(e -> System.out.println("! " + e));

                    });

    }
}
