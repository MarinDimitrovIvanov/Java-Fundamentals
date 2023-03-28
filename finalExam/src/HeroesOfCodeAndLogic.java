import java.util.*;

public class HeroesOfCodeAndLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfHeroes = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> heroesMap = new LinkedHashMap<>();
        for (int i = 0; i < numOfHeroes; i++) {
            String[] inputHero = scanner.nextLine().split(" ");
            String name = inputHero[0];
            int hitPoint = Integer.parseInt(inputHero[1]);
            if (hitPoint > 100) {
                hitPoint = 100;
            }
            int manaPoint = Integer.parseInt(inputHero[2]);
            if (manaPoint > 200) {
                manaPoint = 200;
            }
            heroesMap.put(name, new ArrayList<>());
            heroesMap.get(name).add(hitPoint);
            heroesMap.get(name).add(manaPoint);
        }
        String command = scanner.nextLine();
        while (!"End".equals(command)) {

            if (command.contains("CastSpell")) {
                String heroName = command.split(" - ")[1];
                int MPNeeded = Integer.parseInt(command.split(" - ")[2]);
                String spellName = command.split(" - ")[3];
                if (heroesMap.get(heroName).get(1) >= MPNeeded) {
                    int MPLeft = heroesMap.get(heroName).get(1) - MPNeeded;
                    heroesMap.get(heroName).set(1, MPLeft);
                    System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, MPLeft);
                } else {
                    System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                }
            } else if (command.contains("TakeDamage")) {
                String heroName = command.split(" - ")[1];
                int damage = Integer.parseInt(command.split(" - ")[2]);
                String attacker = command.split(" - ")[3];
                int currentDamage = heroesMap.get(heroName).get(0) - damage;
                if (currentDamage > 0) {
                    heroesMap.get(heroName).set(0, currentDamage);
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, currentDamage);

                } else {
                    heroesMap.remove(heroName);
                    System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                }
            } else if (command.contains("Recharge")) {
                String heroName = command.split(" - ")[1];
                int amount = Integer.parseInt(command.split(" - ")[2]);
                if (amount + heroesMap.get(heroName).get(1) > 200) {
                    int amountToRecharge = 200 - heroesMap.get(heroName).get(1);
                    heroesMap.get(heroName).set(1, 200);
                    System.out.printf("%s recharged for %d MP!%n", heroName, amountToRecharge);
                } else {
                    heroesMap.get(heroName).set(1, amount + heroesMap.get(heroName).get(1));
                    System.out.printf("%s recharged for %d MP!%n", heroName, amount);
                }

            } else if (command.contains("Heal")) {
                String heroName = command.split(" - ")[1];
                int amountHP = Integer.parseInt(command.split(" - ")[2]);
                if (amountHP + heroesMap.get(heroName).get(0) > 100) {
                    int amountToHeal = 100 - heroesMap.get(heroName).get(0);
                    heroesMap.get(heroName).set(0, 100);
                    System.out.printf("%s healed for %d HP!%n", heroName, amountToHeal);
                } else {
                    heroesMap.get(heroName).set(0, amountHP + heroesMap.get(heroName).get(0));
                    System.out.printf("%s healed for %d HP!%n", heroName, amountHP);
                }
            }
            command = scanner.nextLine();
        }
        heroesMap.entrySet().forEach(e -> {
            System.out.println(e.getKey());
            System.out.println("  HP: " + e.getValue().get(0));
            System.out.println("  MP: " + e.getValue().get(1));
        });
    }
}
