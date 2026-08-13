package humans;

public class Human {
    public int age;
    public String name;
    public static int population;

    public static void mssg(){
        System.out.println("Static blocks runs.");
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        population += 1;
    }
}
