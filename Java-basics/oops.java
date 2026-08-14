

class oops2 {
    static int number = 123;
    String city = "London";
    int population;
    double price;
    boolean issafe;
    oops2(String name, int pop) {
        this.city = name;
        this.population = pop;
    }
    oops2(String name) {
        this.city = name;
    }
}

public class oops {

    public static void main(String[] args) {
        oops2 ob = new oops2("patna", 2333);
        // oops2 ob2 = new oops2("delhi");
        // System.out.println(ob.city);

        // System.out.println(ob2.city);
        // System.out.println(ob.population);
        // System.out.println(ob2.population);
        // System.out.println(oops2.number);
        System.out.println(ob.price);
        
    }

}
