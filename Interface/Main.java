package Interface;

public class Main {
    public static void main (String [] args) {
        FopGeneralSystem fopGS1 = new FopGeneralSystem("Ivanov", "Ivan", 1234567, "Peremogy");
        fopGS1.podatok();
        fopGS1.pensijnuj();
        FopSimple1Gr fopSimple1Gr1 = new FopSimple1Gr("Petrov", "Petro", 11111, "Svitla");
        fopSimple1Gr1.podatok();
        fopSimple1Gr1.pensijnuj();
        fopSimple1Gr1.maxEmployeesNum();
        fopSimple1Gr1.pensionReport();
        fopSimple1Gr1.taxReport();
        FopSimple2Gr fopSimple2Gr1 = new FopSimple2Gr("Maximov", "Max", 22222, "Temna");
        fopSimple2Gr1.podatok();
        fopSimple2Gr1.pensijnuj();
        fopSimple2Gr1.maxEmployeesNum();
        fopSimple2Gr1.employeeTax();
        fopSimple2Gr1.info();
        fopSimple2Gr1.pensionReport();
        fopSimple2Gr1.taxReport();
        FopSimple3Gr fopSimple3Gr1 = new FopSimple3Gr("Semenov", "Semen", 33333, "Krajnia");
        fopSimple3Gr1.podatok();
        fopSimple3Gr1.pensijnuj();
        fopSimple3Gr1.maxEmployeesNum();
        fopSimple3Gr1.employeeTax();
        fopSimple3Gr1.info();
        fopSimple3Gr1.taxReport();
        fopSimple3Gr1.pensionReport();
    }
}
