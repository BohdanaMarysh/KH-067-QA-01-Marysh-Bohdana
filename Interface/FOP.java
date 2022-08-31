package Interface;

public abstract class FOP {
    public String lName;
    public String fName;
    public int idCode;
    public String address;
   public String systemName;

    public FOP(String lName, String fName, int idCode, String address, String systemName) {
        this.lName = lName;
        this.fName = fName;
        this.idCode = idCode;
        this.address = address;
        this.systemName = systemName;
    }


    public FOP(String lName, String fName, int idCode, String address) {
        this.lName = lName;
        this.fName = fName;
        this.address = address;
        this.idCode = idCode;
    }
    public abstract void podatok ();
    public abstract void pensijnuj ();


    public String getLName() {
        return lName;
    }
    public String getFName() {
        return fName;
    }
    public int getIdCode() {
        return idCode;
    }
    public String getAddress() {
        return address;
    }
   public String getSystemName(){
        return systemName;
    }

}
