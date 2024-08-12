package basic.programming;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int fact = 1;
        // loop to iterate the element to find factorial of number
        for (int i = 1; i <= n; i++) {
            fact *= i; //fact = fact*i
        }
        System.out.println(fact);
    }
}
