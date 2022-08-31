package Interface;

public class FopGeneralSystem extends FOP {


    public FopGeneralSystem(String lName, String fName, int idCode, String address, String systemName) {
        super(lName, fName, idCode, address, systemName);
        this.systemName = "General system";
        System.out.println(lName + " " + fName + " ID code: " + idCode + " Address: " + address + ", " + systemName);
    }
    public FopGeneralSystem(String lName, String fName, int idCode, String address) {
        super(lName, fName, idCode, address);
        this.systemName = "General system";
        System.out.println(lName + " " + fName + " ID code: " + idCode + " Address: " + address + ", " + systemName);
    }

    @Override
    public void podatok() {
        System.out.println("The tax is 18% from the netto income");
    }

    @Override
    public void pensijnuj() {
        System.out.println("The pension's tax is 22% from the netto income");

    }

}
