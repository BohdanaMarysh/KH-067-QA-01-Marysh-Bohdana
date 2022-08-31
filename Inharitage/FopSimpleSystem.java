package Inharitage;

public abstract class FopSimpleSystem extends FOP {
    public FopSimpleSystem(String lName, String fName, int idCode, String address, String systemName) {
        super(lName, fName, idCode, address, systemName);
        this.systemName = systemName;
        System.out.println(lName + " " + fName + " ID code: " + idCode + " Address: " + address + ", " + systemName);
    }
    public FopSimpleSystem(String lName, String fName, int idCode, String address) {
        super(lName, fName, idCode, address);
       }

    @Override
    public void podatok() {
    }

    @Override
    public void pensijnuj() {
        int minimumSalary = 6500;
        int result = minimumSalary*22/100;
        System.out.println("The pension tax is 22% from minimum salary: " + result);
    }
}
