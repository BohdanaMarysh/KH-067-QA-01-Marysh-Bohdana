import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("This is a calculator");
        System.out.println("Insert your first number, please");
        double a = sc.nextDouble();
            System.out.println("Chose an action");
            System.out.println("1. Adding (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplying (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Modulus (%)");
            System.out.print("6. Exit");
            int number = sc.nextInt();
            if (number == 6) {
                System.out.println("Finish");
                break;}
            System.out.println("Insert your second number");
            double b = sc.nextDouble();
            double result;
            switch (number){
                case (1) : result = a + b;
                System.out.println("Your result is:" + result); break;
                case (2): result = a - b;
                System.out.println("Your result is:" + result); break;
                case (3) : result = a * b;
                System.out.println("Your result is:" + result); break;
                case (4) : result = a / b;
                System.out.println("Your result is:" + result); break;
                case (5) : result = (a%b);
                System.out.println("Your result is:" + result); break;
                default: System.out.println("There is no such operation");}
        }
    }}
