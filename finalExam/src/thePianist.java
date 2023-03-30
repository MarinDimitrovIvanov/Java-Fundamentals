import java.util.*;

public class thePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> piecesMap = new LinkedHashMap<>();
        // piece [composer - 0, key - 1]
        for (int i = 0; i < number; i++) {
            String[] inputPieces = scanner.nextLine().split("\\|");
            String piece = inputPieces[0];
            String composer = inputPieces[1];
            String key = inputPieces[2];
            piecesMap.put(piece, new ArrayList<>());
            piecesMap.get(piece).add(0, composer);
            piecesMap.get(piece).add(1, key);
        }

        String command = scanner.nextLine();
        while (!"Stop".equals(command)) {
            String piece = command.split("\\|")[1];
            if (command.contains("Add")) {
                String composer = command.split("\\|")[2];
                String key = command.split("\\|")[3];
                if (piecesMap.containsKey(piece)) {
                    System.out.println(piece + " is already in the collection!");
                } else {
                    piecesMap.put(piece, new ArrayList<>());
                    piecesMap.get(piece).add(0, composer);
                    piecesMap.get(piece).add(1, key);
                    System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                }
            } else if (command.contains("Remove")) {
                if (piecesMap.containsKey(piece)) {
                    piecesMap.remove(piece);
                    System.out.printf("Successfully removed %s!%n", piece);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }
            } else if (command.contains("ChangeKey")) {
                String newKey = command.split("\\|")[2];
                if (piecesMap.containsKey(piece)) {
                    piecesMap.get(piece).set(1, newKey);
                    System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }
            }
            command = scanner.nextLine();
        }
        piecesMap.entrySet().forEach(e -> System.out.printf("%s -> Composer: %s, Key: %s%n", e.getKey(), e.getValue().get(0), e.getValue().get(1)));

    }
}
