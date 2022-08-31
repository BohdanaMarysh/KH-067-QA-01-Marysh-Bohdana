package Interface;

public class FopSimple2Gr extends FopSimpleSystem implements Employees, FinReport {
    public FopSimple2Gr(String lName, String fName, int idCode, String address) {
        super(lName, fName, idCode, address);
        this.systemName = "Simple system 2nd group";
        System.out.println(lName + " " + fName + " ID code: " + idCode + " Address: " + address + ", " + systemName);
    }
    public void podatok(){
        int minimumSalary = 6500;
        int result = minimumSalary/5;
        System.out.println("The tax is 20% from the minimum salary: " + result);
    }

    @Override
    public int maxEmployeesNum() {
        System.out.println("Employees:" + 10);
        return 10;

    }

    @Override
    public void employeeTax() {
        System.out.println("The tax for one employee is: " + (minSalary*0.22 + minSalary*0.18 + minSalary * 0.015));
    }

    @Override
    public void info() {
        Employees.super.info();
    }

    @Override
    public void pensionReport() {
        FinReport.super.pensionReport();
    }

    @Override
    public void taxReport() {
        System.out.println("The tax report should be done once a year");

    }
}
