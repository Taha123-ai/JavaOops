// An enum lets us define a fixed set of named constants, and Java automatically creates one object for each constant. We don't need to manually create those objects

public class Enums {

    // **** Declare constant with normal class*******
    // static class Day{
    // String day;
    // }
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SUNDAY //--> All are objects of Day class.
    }

    public static void main(String[] args) {
        // **** Declare constant with normal class*******
        // Day ob = new Day();
        // ob.day="MONDAY";
        // System.out.println(ob);---------> give ob.tostring() include class name +@+hashcode 
        // System.out.println(ob.day);

        // **** Declare constant with normal class*******
        Day OB = Day.MONDAY;
        System.out.println(OB);//-----------> enum has its own tostring() that override the object class tostring()
        
    }
}
