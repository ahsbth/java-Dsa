import java.util.Scanner;
class ArrayOpreation {
    
    private int a[]=new int[20],i,n,f=0,sn;
    Scanner sc=new Scanner(System.in);
    public void addElement()
    {
       System.out.println("Enter the size of array =");
       int n=sc.nextInt();
       System.out.println("Enter the elemets for array"+n);
       for(i=0;i<n;i++)
       {
        a[i]=sc.nextInt();
       }
    }
    public void display()
    {
       System.out.println("Array elements are");
       for(i=0;i<n;i++)
       {
        System.out.print("\t"+a[i]);
       }
    }
    /*public void deletElement()
    {

    }*/
    public void searchElement()
    { 
    System.out.println("Enter the Element that you want to Search=");
     sn=sc.nextInt();
    for(i=0;i<=n;i++)
    {
        if(sn==a[i])
        {
            int f=1;
            break;
        }
        
    }
    if(f==1)
       {
        System.out.println("No is found");
       }
    else{
        System.out.println("No is not found");
        }  
    }
}
public class Array
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      ArrayOpreation a=new ArrayOpreation();
      while(true)
      {
      System.out.println("Press 1 for AddElements");
      System.out.println("Press 2 for Display");
      System.out.println("Press 3 for Search");
      System.out.println("Enter your choice ");
      int ch=sc.nextInt();
      switch(ch)
      {
        case 1:a.addElement();
                 break;
        case 2:a.display();
                 break;
        case 3:a.searchElement();
                  break;
        default:break;
      }
    }
    }
}
