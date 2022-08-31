package Interface;

public class FopSimple3Gr extends FopSimpleSystem implements Employees, FinReport {
    public FopSimple3Gr(String lName, String fName, int idCode, String address) {
        super(lName, fName, idCode, address);
        this.systemName = "Simple system 3d group";
        System.out.println(lName + " " + fName + " ID code: " + idCode + " Address: " + address + ", " + systemName);
    }
    public void podatok(){
        System.out.println("The tax is 5% from the income");
    }

    @Override
    public int maxEmployeesNum() {
        System.out.println("Employees:" + 100);
        return 100;
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
        System.out.println("The tax report should be done every three months");

    }
}
