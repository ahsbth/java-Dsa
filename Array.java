import java.util.Scanner;
class ArrayOpreation {
    
    
    // public void addElement(int [] arr)
    // {  int n,pos;
    //    System.out.println("Enter the elemnts and position for insert =");
    //    n=sc.nextInt();
    //    pos=sc.nextInt();
    //    if(pos<=0||pos>a)
    //    for(i=0;i<n;i++)
    //    {
    //     a[i]=sc.nextInt();
    //    }
    // }
    public void display(int [] arr)
    {
       System.out.println("Array elements are");
       for(i=0;i<arr.length;i++)
       {
        System.out.print("\t"+a[i]);
       }
    }
    public void searchElement(int [] arr)
    { 
    System.out.println("Enter the Element that you want to Search=");
     int sn=sc.nextInt();
     int f=0;
    for(i=0;i<arr.length;i++)
    {
        if(sn==a[i])
        {
            f=1;
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
public class Arraydemo
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size for array=");
      int sz=sc.nextInt();
      int arr[]=new int[sz],i;
      System.out.prinltn("Enter the elements for array=");
      for(i=0;i<sz;i++){
        arr[i]=sc.nextInt();
      }
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
        
        case 1:a.display(arr);
                 break;
        case 2:a.searchElement(arr);
                  break;
        default:break;
      }
    }
    }
}
