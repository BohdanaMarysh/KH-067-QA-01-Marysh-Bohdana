package Interface;

public interface FinReport {
    default void pensionReport(){
        System.out.println("Send Pension's report once a year");
    }
    void taxReport();

}
