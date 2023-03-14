import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E7LegendaryFarming {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        Map<String, Integer> materialMap = new LinkedHashMap<>();
        materialMap.put("shards", 0);
        materialMap.put("fragments", 0);
        materialMap.put("motes", 0);

         Map<String, Integer> junk = new LinkedHashMap<>();
        boolean isWin = false;
         while (!isWin){
             String input =scanner.nextLine();
             String[] materials = input.split("\\s+");

             for (int i = 1; i <= materials.length-1; i += 2) {
                 String currentMaterial = materials[i].toLowerCase();
                 int quantity = Integer.parseInt(materials[i-1]);
                 if (materialMap.containsKey(currentMaterial)){
                     materialMap.put(currentMaterial, materialMap.get(currentMaterial)+quantity);
                     if (materialMap.get(currentMaterial) >= 250){
                         if (currentMaterial.equals("shards")){
                             System.out.println("Shadowmourne obtained!");
                             materialMap.put(currentMaterial, materialMap.get(currentMaterial)-250);
                             isWin = true;
                             break;
                         } else if (currentMaterial.equals("fragments")) {
                             System.out.println("Valanyr obtained!");
                             materialMap.put(currentMaterial, materialMap.get(currentMaterial)-250);
                             isWin = true;
                             break;
                         } else if(currentMaterial.equals("motes")){
                             System.out.println("Dragonwrath obtained!");
                             materialMap.put(currentMaterial, materialMap.get(currentMaterial)-250);
                             isWin = true;
                             break;
                         }
                     }
                 }else{
                     junk.putIfAbsent(currentMaterial, 0);
                     junk.put(currentMaterial, junk.get(currentMaterial) + quantity);
                 }
             }
         }
         materialMap.entrySet().forEach(entry-> System.out.println(entry.getKey() + ": " + entry.getValue()));
         junk.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

    }
}
