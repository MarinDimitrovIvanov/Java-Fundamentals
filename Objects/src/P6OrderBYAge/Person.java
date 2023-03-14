package P6OrderBYAge;

public class Person {
    public String name;
    public  String ID;
    public  int age;

    public Person(String name, String ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return  name + " with ID: " + ID + " is " + age +" years old.";
    }
}
