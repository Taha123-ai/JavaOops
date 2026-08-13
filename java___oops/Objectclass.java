


class A {
    int num=12;
    public String toString(){//over ride parent class ie object string method
        return "hi";
    }
    public int hashCode(){
        return 123;
    }

}


public class Objectclass {
    public static void main(String[] args) {
        A ob =new A();
        A ob1 = new A();
        ob.num=23;
        ob1.num=123;
        System.out.println(ob);
        System.out.println(ob.getClass());
        System.out.println(ob1.hashCode());
        System.out.println(ob1);
    }
}
