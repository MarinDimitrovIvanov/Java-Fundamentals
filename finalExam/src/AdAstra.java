import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "([|#])(?<food>[A-Za-z ]+)\\1(?<expDay>[0-9]{2}/[0-9]{2}/[0-9]{2})\\1(?<calories>[0-9]{1,6})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        List<String> food = new ArrayList<>();
        List<String> day = new ArrayList<>();
        List<Integer> calories = new ArrayList<>();
        int sumCalories = 0;
        while (matcher.find()) {
            String currentFood = matcher.group("food");
            food.add(currentFood);
            String expDay = matcher.group("expDay");
            day.add(expDay);
            int currentCalories = Integer.parseInt(matcher.group("calories"));
            calories.add(currentCalories);
            sumCalories += currentCalories;
        }
        int daysToLast = sumCalories / 2000;
        System.out.printf("You have food to last you for: %d days!%n",daysToLast);
        for (int i = 0; i < food.size(); i++) {
            System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n",food.get(i), day.get(i), calories.get(i));
        }
    }
}
