package basic.programming;

import java.util.Scanner;

public class PasclaTriangle {
    public static void main(String[] args) {
        int i,j,row;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        row = sc.nextInt();

//        right pascal triangle
//        for(i=1;i<=row;i++) {
//            for(j=1;j<=i;j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        pyramid triangle
//       for (i = 0; i < row; i++) {
//           for (j = row-i; j >1; j--) {
//               System.out.print(" ");
//           }
//           for (j = 1; j <=i; j++) {
//               System.out.print("* ");
//           }
//           System.out.println();
//       }

//       left pascal triangle
        for(i=0;i<row;i++) {
            for (j=2*(row -i);j>=0; j--) {
                System.out.print(" ");
            }
            for (j=0;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
