import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Input 1 Number");
        Scanner scan=new Scanner(System.in);
        int number1 = scan.nextInt();
        System.out.println("Input second number");
       // Scanner scan2 =new Scanner(System.in);
        int number2 = scan.nextInt();
        System.out.println("Sum="+(number1+number2));
        System.out.println("difference=" + (number1-number2));
        System.out.println("Multiplication=" + (number1*number2));
        System.out.println("Division=" + (number1/number2));

    }

}
