
public class FullTimeEmployee extends Employee {
    private Double salary;
    FullTimeEmployee(String name,int Id,Double salary){
        super(name, Id,"FullTime Employee");
        this.salary=salary;
    }
    public double calculatesalary(){
        return salary;
    };
}
