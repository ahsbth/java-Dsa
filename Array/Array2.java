package Array;
import java.util.Scanner;
public class Array2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int array1[]=new int[5];
        int array2[]=new int[5];
        int array3[]=new int[10];
        int i,j;
        System.out.println("\nEnter 5 array elements for First array:");
        for(i=0;i<5;i++)
        {
         array1[i]=sc.nextInt();
        }
        System.out.println("\nEnter 5 array elements for second array:");
        for(i=0;i<5;i++)
        {
            array2[i]=sc.nextInt();
        }
        System.out.println("\nFirst array elements:");
        for(i=0;i<5;i++)
        {
            System.out.print("\t"+array1[i]);
        }
        System.out.println("\nSecond array elements:");
        for(i=0;i<5;i++)
        {
            System.out.print("\t"+array2[i]);
        }
       for(i=0;i<5;i++)
       {
        array3[i]=array1[i];
       }
       for(i=0;i<5;i++)
       {
        array3[i+5]=array2[i];
       }
       System.out.println("\nAfter Merge Two array elements are:");
       for(i=0;i<10;i++)
       {
        System.out.print("\t"+array3[i]);
       }
    }
}
