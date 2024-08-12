package basic.programming;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.max;

public class LargestNumber {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//        Maximum number from list
//        int max = max(list);
//        System.out.println(max);
//
////        Minimum number from list
//        int min = Collections.min(list);
//        System.out.println(min);

//        second largest number from list
        try {
            int secondLargest = max(list);
            System.out.println("The second largest number is: " + secondLargest);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int max(int[] list) throws Exception {
        if (list.length < 2) {
            throw new Exception("Array should have at least two elements.");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : list) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            throw new Exception("There is no second largest number (all elements might be the same).");
        }
        return secondLargest;
    }
}


