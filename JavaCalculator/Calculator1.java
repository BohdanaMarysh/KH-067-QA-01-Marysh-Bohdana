import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Chose an action");
            System.out.println("1. Adding (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplying (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Modulus (%)");
            System.out.print("6. Exit");
            int person = sc.nextInt();
            int result;
            if (person == 6) {
                System.out.println("Finish");
                break;
            }
            if (person == 1) {
                System.out.println("Insert your first number, please");
                int a = sc.nextInt();
                System.out.println("Insert your second number, please");
                int b = sc.nextInt();
                result = a + b;
                System.out.println("Your result is:" + result);}
            if (person == 2) {
                System.out.println("Insert your first number, please");
                int a = sc.nextInt();
                System.out.println("Insert your second number, please");
                int b = sc.nextInt();
                result = a - b;
                System.out.println("Your result is:" + result);}
            if (person == 3) {
                System.out.println("Insert your first number, please");
                int a = sc.nextInt();
                System.out.println("Insert your second number, please");
                int b = sc.nextInt();
                result = a * b;
                System.out.println("Your result is:" + result);}
            if (person == 4) {
                System.out.println("Insert your first number, please");
                int a = sc.nextInt();
                System.out.println("Insert your second number, please");
                int b = sc.nextInt();
                if (b == 0){System.out.println("You cann't divide on 0"); }
                result = a / b;
                System.out.println("Your result is:" + result);}
            if (person == 5) {
                System.out.println("Insert your number, please");
                int c = sc.nextInt();
                result = (c%2);
                System.out.println("Your result is:" + result);}
            if (!(person == 1 || person == 2 || person == 3 || person == 4 || person == 5 ||person == 6)) {
                System.out.println("There is no such operation");}
    }
} }

