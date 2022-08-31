package Interface;

public interface Employees extends EmployeesNumber{
    int minSalary = 6500;
    void employeeTax();
    default void info(){
        System.out.println("Don't forget to pay tax!!!");
    }
}
