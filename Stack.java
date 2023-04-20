import java.util.Scanner;
 class Ahsan {
        private int top=-1;
        private int s[]=new int[5];
        Scanner sc=new Scanner(System.in);
        public void push()
        {
            
            if(top==5-1)
            {
                System.out.println("Overfollow");
            }
            else
            {
                top++;
                System.out.println("Enter the element for push=");
                int e=sc.nextInt();
                s[top]=e;
            }
        }
        public void pop()
        {
            if(top==-1)
            {
                System.out.println("Underfollow");
            }
            else{
                int x=s[top];
                top--;
                System.out.println("\n"+x+"\t is deleted from stack");
            }
        }
        public void disp()
        { 
            if(top==-1)
            {
                System.out.println("Underfollow");
            }
            else
            {
              System.out.println("Elements in Satck");
            for(int i=top;i>=0;i--)
              {
                System.out.print("\t"+s[i]);
              }
            }
        }  
    }
   public class Stack
   {
    public static void main(String args[])
    {
      Ahsan a=new Ahsan();
      Scanner sc=new Scanner(System.in);
      while(true)
      {
      System.out.println("Press 1 for push");
      System.out.println("Press 2 for pop");
      System.out.println("Press 3 for display");
      System.out.println("Press Any for Exit");
      System.out.println("Enter your choice=");
      int ch=sc.nextInt();
      switch(ch)
      {
        case 1:a.push();
                 break;
        case 2:a.pop();
                 break;
        case 3:a.disp();
                 break;
 
       default:break;
      } 
    } 
    }
}


