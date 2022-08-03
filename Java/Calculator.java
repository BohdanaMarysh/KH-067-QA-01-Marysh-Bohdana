import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Hello, I'm a strange Calculator");
        System.out.println("I'm going to increase or decrease your number on 1");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Chose an action");
            System.out.println("1. Increase");
            System.out.println("2. Decrease");
            System.out.println("3. Exit");
            int person = sc.nextInt();
            int result;
            if (person == 3){
                System.out.println("Goodbye, my friend");
                break;}
            if (person == 1){
                System.out.println("Insert your number, please");
                int a = sc.nextInt();
                result = (a+1);
                System.out.println("Result:" + result);}
            if (person ==2){
                System.out.println("Insert your number, please");
                int b = sc.nextInt();
                result = (b-1);
                System.out.println("Result:" + result);}
        }
           }
}
