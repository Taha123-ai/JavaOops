
class Animal {// super class
    void sound() {
        System.out.println("animal sound");
    }
}

class Cat extends Animal{//sub class
    void sound() {
        System.out.println("Meow..");
    }
}

class Dog extends Animal {//sub class
    void sound() {
        System.out.println("Bark..");
    }

}

public class Polymorphism {
    public static void main(String[] args) {
        Animal ob = new Animal(); //we use parent reference to refer objects of subclass/childclass{same refrence and same method many behaviours.}
        ob.sound();
        ob= new Cat();
        ob.sound();
        ob=new Dog();
        ob.sound();
    }

}
