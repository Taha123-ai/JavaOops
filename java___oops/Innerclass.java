
class Book{
    String name;
    void name(String name){//if you want to call this name method you need object of Book as it is non-static method
        this.name=name;
    }
    
    class English{//If you want to call this class you need object of Book as it is non static 
        void mssg(){
            System.out.println("Inside English");
        }
    }
    static class Englishnew{//If you want to call this class you need Book class as it is static 
        void mssg(){
            System.out.println("Inside English new");
        }
    }
}
public class Innerclass {
    public static void main(String[] args) {
        Book ob= new Book();
        ob.name("hindi");
        System.out.println(ob.name);
        Book.English b1= ob.new English();//we used object of Book to create obj of inner class English
        b1.mssg();
        Book.Englishnew ob2 = new Book.Englishnew();//we created object of englishnew as it is static we dont need any object of Book.
        ob2.mssg();
    }
}
