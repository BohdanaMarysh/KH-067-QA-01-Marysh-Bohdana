package Inharitage;

public class FopSimple1Gr extends FopSimpleSystem{

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
}
