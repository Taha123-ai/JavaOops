

import humans.Human;

public class Main {
    public static void main(String[] args) {
        Human h1= new Human(15,"Taha");
        Human h2= new Human(25,"jamal");
        System.out.println(h1.name);
        System.out.println(h2.name);
        System.out.println(h1.age);
        System.out.println(h2.age);
        System.out.println(Human.population);
    }
}
