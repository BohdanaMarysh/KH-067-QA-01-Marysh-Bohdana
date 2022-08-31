package Interface;

public class FopSimple1Gr extends FopSimpleSystem implements EmployeesNumber, FinReport{

     public FopSimple1Gr(String lName, String fName, int idCode, String address) {
        super(lName, fName, idCode, address);
        this.systemName = "Simple system 1st group";
        System.out.println(lName + " " + fName + " ID code: " + idCode + " Address: " + address + ", " + systemName);
    }
    @Override
    public void podatok(){
        int livingMinimum = 4500;
        int result = livingMinimum/10;
        System.out.println("The tax is 10% from the living minimum: " + result);
    }

    @Override
    public int maxEmployeesNum() {
        System.out.println("The maximum employees for your group are: " + 0);
        return 0;
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
