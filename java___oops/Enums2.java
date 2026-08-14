
//  **********day.MONDAY is a reference to an existing enum object. MONDAY(1) is
// enum-constant initialization, where Java invokes the enum constructor
//  internally.*****
enum day {
    MONDAY(1), TUESDAY(2), WEDNESDAY(), THURSDAY(4), FRIDAY(5), saturday(6), SUNDAY(7);

    private int dayno;

    day() {//enum constructor with zero parameter
        this.dayno = 3;
    }

    day(int daynos) {//enum constructor with one parameter
        this.dayno = daynos;
    }

    public void setdayno(int input) {
        this.dayno = input;
    }

    public int getdayno() {
        return this.dayno;
    }
}

public class Enums2 {

    public static void main(String[] args) {
        for (day data : day.values() ) {
            System.out.println(data +" : "+data.getdayno());
        }
    }
}
