package calculator;

public class Calc extends advcal {//child,base
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }
    public int product(int n1, int n2) {//method over riding
        return n1 * n2 * 0;
    }
}