
abstract class Car{//Incomplete class - abstract class cannot create object-incomplete method.
    abstract void engine();//Incomplete method
    void playmusic(){
        System.out.println("Music playing...");
    }
}
class Audi extends Car{//Concrete class-subclass where abstract method initialised.
    void engine(){
        System.out.println("Audi engine..");
    }
}
class BMW extends Car{
    void engine(){
        System.out.println("BMW engine..");
    }
}

public class Abstractclass {
    public static void main(String[] args) {
       Car ob=new Audi();//created object of concrete class which is complete and there refrence type is parent class as Audi is car.
       ob.engine();
       ob.playmusic();
       ob=new BMW();
       ob.engine();
       ob.playmusic();
    }
}
