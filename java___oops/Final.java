class Name{
    String name="jamal";
     void sub(int a,int b){ //if final used here Sub class cannot over-ride the value.
        System.out.println(a-b+"from  method in Name class");
    }
}
class Logic extends Name{
    final String credit = "Taha";
    void add(int a,int b){
        System.out.println(a+b);
    }
    void sub(int a,int b){
        System.out.println(a-b+"from  method in Logic class");
    }
}
public class Final{
    public static void main(String[] args) {
        Logic ob1 =new Logic();
        ob1.add(2, 4);
        ob1.sub(3, 2);
        System.out.println(ob1.credit);
        System.out.println(ob1.name);    
    }
}