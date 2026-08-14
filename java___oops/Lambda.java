// Lambda expression is coincise way to implement a single abstract method(SAM) without creating anonymous class.
// Bina anonymous class bnye SAM ko implement kr sktey hai.

@FunctionalInterface //--->attributes check functional interface.
interface InnerLambda {
    void mssg();
}
interface InnerLambda2 {
    int sum(int a,int b);
}
public class Lambda {
    public static void main(String[] args) {
        // ****** Without lambda expression *******
        // InnerLambda ob = new InnerLambda(){
        //     public void mssg(){
        //         System.out.println("In innerlambda.");
        //     }
        // };

        InnerLambda ob = ()->{System.out.println("In innerlambda.");};
        ob.mssg();

        // **** With arguments ****
        InnerLambda2 ob2 = (a,b)->{return a+b;};
        System.out.println(ob2.sum(3, 5));
    }
}