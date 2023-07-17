// WAP to arithmetic operations between two numbers...

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        int add = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        int mod = num1 % num2;

        System.out.println("Addition of two number is:\n" + add);
        System.out.println("Substraction of two number is:\n" + sub);
        System.out.println("Multiplication of two number is:\n" + mul);
        System.out.println("Division of two number is:\n" + div);
        System.out.println("Modulus of two number is:\n" + mod);
    }
}
