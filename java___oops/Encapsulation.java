
class Human {
    private int age;
    private String name;
    public void setage(int age){//setter for controlled modification after initialisation
         this.age=age;
    }
    public int getage(){
        return this.age;
    }
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return this.name;
    }
    Human(int age){ //initialise the dat
        this.age=age;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Human h1 = new Human(12);
        Human h2 = new Human(14);
        h1.setage(2);
        System.out.println(h1.getname()+h1.getage());
        System.out.println(h2.getname()+h2.getage());
    }
}