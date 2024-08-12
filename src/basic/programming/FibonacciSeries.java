package basic.programming;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int first_Number = 0, second_Number = 1, count,temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the count: ");
        count = input.nextInt();
        System.out.print(" "+first_Number);
        System.out.print(" "+second_Number);
        for (int i = 1; i <= count-1; i++) {

            temp = first_Number+second_Number;
            first_Number = second_Number;
            second_Number = temp;
            System.out.print(" "+temp);
        }
    }
}
