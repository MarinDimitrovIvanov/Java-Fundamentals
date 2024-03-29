import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class destinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String places = scanner.nextLine();
        String regex = "([=/])(?<place>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(places);
        List<String> placesList = new ArrayList<>();
        int travelPoints = 0;
        while (matcher.find()) {
            String currentPlace = matcher.group("place");
            placesList.add(currentPlace);
            travelPoints += currentPlace.length();
        }

        System.out.println("Destinations: " + String.join(", ",placesList));
        System.out.println("Travel Points: " + travelPoints);

    }
}
