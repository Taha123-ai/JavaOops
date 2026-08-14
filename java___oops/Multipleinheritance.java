// Java does not support multiple inheritance of classes, but it supports multiple inheritance of type through interfaces.

interface Brand {
    void name();
}

interface Camera {
    void takephoto();
}

interface Space extends Brand, Camera {//interface can extends multiple interface.
    void capacity();
}

class Mobile implements Brand, Camera { // Mobile class has two supertypes(parent)
    public void name() {
        System.out.println("Oneplus");
    }

    public void takephoto() {
        System.out.println("120px picture..");
    }
}

class Phone implements Space {
    public void name() {
        System.out.println("Samsung");
    }

    public void takephoto() {
        System.out.println("250px picture..");

    }

    public void capacity() {
        System.out.println("1TB");
    }
}

public class Multipleinheritance {
    public static void main(String[] args) {
        Mobile ob1 = new Mobile();
        Phone ob2 = new Phone();
        ob1.name();
        ob1.takephoto();
        ob2.name();
        ob2.takephoto();
        ob2.capacity();
    }
}