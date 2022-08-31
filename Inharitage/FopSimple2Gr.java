package Inharitage;

public class FopSimple2Gr extends FopSimpleSystem{
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

}
