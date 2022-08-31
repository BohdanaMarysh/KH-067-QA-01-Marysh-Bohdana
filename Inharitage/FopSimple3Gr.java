package Inharitage;

public class FopSimple3Gr extends FopSimpleSystem{
    public FopSimple3Gr(String lName, String fName, int idCode, String address) {
        super(lName, fName, idCode, address);
        this.systemName = "Simple system 3d group";
        System.out.println(lName + " " + fName + " ID code: " + idCode + " Address: " + address + ", " + systemName);
    }
    public void podatok(){
        System.out.println("The tax is 5% from the income");
    }


}
