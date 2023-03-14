package P6OrderBYAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String input = scanner.nextLine();
        List<Person> personList = new ArrayList<>();
         while (!"End".equals(input)){
             String[] inputArr =  input.split("\\s+");
             String name = inputArr[0];
             String ID = inputArr[1];
             int age = Integer.parseInt(inputArr[2]);
            Person person = new Person(name, ID, age);
             personList.add(person);
             input = scanner.nextLine();
         }
        personList.sort(Comparator.comparingInt(Person::getAge));

        for (Person person:personList) {
            System.out.println(person);
        }


    }
}
