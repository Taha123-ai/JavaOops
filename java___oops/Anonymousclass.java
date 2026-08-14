
// Anonymous classes are commonly used to override methods, especially when you need a one-time implementation.
// Anonymous class = unnamed class, usually used for a one-time implementation
abstract class Animals {
    abstract void animal();

    void animal2() {
        System.out.println("Cat");
    }
}

public class Anonymousclass {
    public static void main(String[] args) {

        // class SomeUnnamedClass extends Animals {--------->Concrete class without name.
        //     void animal() {
        //         System.out.println("Dog in new classs.");
        //     }
        // }
        // Animal a = new SomeUnnamedClass();

        Animals ob = new Animals() {//-------> anonymous class.
            void animal() {
                System.out.println("Dog in new classs.");
            }
        };
        ob.animal();
        ob.animal2();
    }
}
