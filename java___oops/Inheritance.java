import calculator.Calc;

public class Inheritance {
    public static void main(String[] args) {
        Calc ob1 = new Calc();
        int sum = ob1.add(3, 2);
        int sub = ob1.sub(3, 2);
        int product = ob1.product(3, 2);
        int divide = ob1.divide(3, 2);
        double power = ob1.power(3, 2);
        System.out.println(sum +" "+sub+" "+product+" "+divide+" "+power);
    }
}
