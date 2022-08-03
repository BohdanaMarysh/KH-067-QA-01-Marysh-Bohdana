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
            int number = sc.nextInt();
            int result;
            if (number == 6) {
                System.out.println("Finish");
                break;
            }
            if (number == 1) {
                System.out.println("Insert your first number, please");
                int a = sc.nextInt();
                System.out.println("Insert your second number, please");
                int b = sc.nextInt();
                result = a + b;
                System.out.println("Your result is:" + result);}
            if (number == 2) {
                System.out.println("Insert your first number, please");
                int a = sc.nextInt();
                System.out.println("Insert your second number, please");
                int b = sc.nextInt();
                result = a - b;
                System.out.println("Your result is:" + result);}
            if (number == 3) {
                System.out.println("Insert your first number, please");
                int a = sc.nextInt();
                System.out.println("Insert your second number, please");
                int b = sc.nextInt();
                result = a * b;
                System.out.println("Your result is:" + result);}
            if (number == 4) {
                System.out.println("Insert your first number, please");
                int a = sc.nextInt();
                System.out.println("Insert your second number, please");
                int b = sc.nextInt();
                if (b == 0){System.out.println("You cann't divide on 0"); }
                result = a / b;
                System.out.println("Your result is:" + result);}
            if (number == 5) {
                System.out.println("Insert your number, please");
                int c = sc.nextInt();
                result = (c%2);
                System.out.println("Your result is:" + result);}
            if (!(number == 1 || number == 2 || number == 3 || number == 4 || number == 5 || number == 6)) {
                System.out.println("There is no such operation");}
    }
} }

