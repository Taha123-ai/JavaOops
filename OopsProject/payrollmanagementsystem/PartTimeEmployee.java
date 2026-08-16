public class PartTimeEmployee extends Employee {
    private double hourwork;
    private double hourlyRate;
    PartTimeEmployee(String name,int Id,double hourlyRate,double hourwork){
        super(name,Id,"PartTime Employee");
        this.hourlyRate=hourlyRate;
        this.hourwork=hourwork;
    }
    public double calculatesalary(){
        return hourlyRate*hourwork;
    }

}
