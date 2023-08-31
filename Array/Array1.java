
package Array;

import java.util.Scanner;

public class Array1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i;
        int array[] = new int[6];
        int array2[] = new int[6];
        System.out.println("Enter 6 nos=");
        for (i = 0; i < 6; i++) {
            array[i] = sc.nextInt();
        }
        for (i = 0; i < 6; i++) {
            int m = array[i], R, rev = 0;
            while (m > 0) {
                R = m % 10;
                rev = rev * 10 + R;
                m = m / 10;
            }
            array2[i] = rev;

        }
        System.out.println("After Reverse Array is");
        for (i = 0; i < 6; i++) {
            System.out.print("\t" + array2[i]);
        }

    }
    
}
