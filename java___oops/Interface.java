
interface Recipies {// blueprint of a class.
    boolean fssaiapproved = true; // by default static, final , public

    void maggie();// by default abstract,public {public abstract void maggie();}

    void yuppie();
}

class Food implements Recipies {//class using blueprint recipies
    @Override
    public void maggie() {
        System.out.println("Magie in 2 minutes...");
    }
    public void yuppie() {
        System.out.println("Yuppie in 5 minutes...");
    }
}

public class Interface {
    public static void main(String[] args) {
        Food ob = new Food();
        ob.yuppie();
        ob.maggie();
        System.out.println(Recipies.fssaiapproved);

    }
}
