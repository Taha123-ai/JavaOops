class InnerMssg {// 2:class initialise
    static String mssg = "hello";// 3:statice var initialise
    String name;// 6:instance var created

    static {
        System.out.println("static block executes");// 4:static block execute
    }

    void show() {
        System.out.println("Non static method executes of " + name);
    }

    static void show1(InnerMssg ob2) {
        System.out.println("static method executes of " + ob2.name);
    }

    InnerMssg(String name) {// 7:constructor exectues
        System.out.println("constructor executes.");
        this.name=name;
    }
}

public class staticmethod {

    public static void main(String[] args) { // 1:class loaded
        InnerMssg ob1 = new InnerMssg("tahha");// 5:obj created
        InnerMssg ob2 = new InnerMssg("sameer");
        System.out.print(InnerMssg.mssg + " ");
        System.out.println(ob1.name);
        ob1.show();
        System.out.print(InnerMssg.mssg + " ");
        System.out.println(ob2.name);
        // ob2.show();
        InnerMssg.show1(ob2);
    }

}
