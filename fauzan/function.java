public class function{
    public static void main(String[] args) {
       int a=3;
       System.out.println("a from main"+a);
       sum(a);
       System.out.println("a after sum runs"+a);
      
    }

    public static void sum(int a){
       a=a+3;
       System.out.println("from sum func"+a);
    }

}
