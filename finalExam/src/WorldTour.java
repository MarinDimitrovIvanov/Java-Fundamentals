import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stops = scanner.nextLine();
        StringBuilder modifyStops = new StringBuilder(stops);
        String command = scanner.nextLine();
        while (!"Travel".equals(command)) {
            if (command.contains("Add Stop")) {
                int index = Integer.parseInt(command.split(":")[1]);
                String stop = command.split(":")[2];
                if (isValid(index, stops)) {
                    modifyStops.insert(index, stop);
                }
                System.out.println(modifyStops);
            } else if (command.contains("Remove Stop")) {
                int startIndex = Integer.parseInt(command.split(":")[1]);
                int endIndex = Integer.parseInt(command.split(":")[2]);
                if (isValid(startIndex, modifyStops.toString()) && isValid(endIndex, modifyStops.toString())) {
                    modifyStops.delete(startIndex, endIndex + 1);
                }
                System.out.println(modifyStops);
            } else if (command.contains("Switch")) {
                String oldStop = command.split(":")[1];
                String newStop = command.split(":")[2];
                if (modifyStops.toString().contains(oldStop)) {
                    String replaced = modifyStops.toString().replace(oldStop, newStop);
                    modifyStops = new StringBuilder(replaced);
                }
                System.out.println(modifyStops);
            }
            command = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + modifyStops);

    }

    private static boolean isValid(int index, String stops) {
        boolean isValid = false;
        if (index >= 0 && index < stops.length()) {
            isValid = true;
        }
        return isValid;
    }

}
