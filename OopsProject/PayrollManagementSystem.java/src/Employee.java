abstract public class Employee {
    private String name;
    private int Id;
    private String type;

    Employee(String name, int Id, String type) {
        this.Id = Id;
        this.name = name;
        this.type = type;
    }

    public String gettype() {
        return type;
    }

    public int getId() {
        return Id;
    }

    abstract public double calculatesalary();

    @Override
    public String toString() {
        return "Name       : " + name + "\n"
                + "EmployeeID : " + Id + "\n"
                + "Type       : " + type + "\n"
                + "Salary     : " + calculatesalary() + "$\n"
                + "\n";
    }
}
