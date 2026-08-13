
class B {//super class
    B(){
        System.out.println("in B");
    }
    B(int n){
        this();
        System.out.println("IN B "+n);
    }
}
class A extends B{//sub class
    public A(){
        super(5);
        System.out.println("In A");
    }
    public A(int n){
        this();
        System.out.println("In A with "+n);
    }
}
public class superthis{
    public static void main(String[] args) {
        new A(5); //anonymus object
    }
}