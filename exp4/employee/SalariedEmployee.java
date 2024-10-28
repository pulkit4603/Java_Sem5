public class SalariedEmployee extends Employee {
    private double empSalary;
    public boolean isPermanent;

    public SalariedEmployee(String name,
                                  String id,
                                  int age,
                                  double empSalary,
                                  boolean isPermanent) {
        super(name, id, age);
        this.isPermanent = isPermanent;
        setEmpSalary(empSalary);
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = (isPermanent) ? (empSalary + 2000)
                                       : (empSalary);
    }

    public double getEmpSalary() {
        return empSalary;
    }
}

