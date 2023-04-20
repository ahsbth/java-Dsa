 import java.util.Scanner;
 class QueueOpreation {
private int front=-1;
private int rear=-1;
private int Queue[]=new int[5];
Scanner sc=new Scanner(System.in);
public void enqueue()
{

    if((front==0 && rear==5-1) || (front==rear+1))    
    {
        System.out.println("Overfollow");
    }
    else
    {
        System.out.println("Enter the element that you want to insert=");
        int item=sc.nextInt();
        rear=rear+1;
        Queue[rear]=item;
    }
}
public void dequeue()
{   
    if(rear==-1)
    {
        System.out.println("Underfollow");
    }
    else
    {
       int x= Queue[rear];
       Queue[rear]=-1;
        front=front+1;

        System.out.printl("One Element is deleted from Queue");
    }
}
public void display()
{
 if(rear==-1)
 {
    System.out.println("Underfollow");
 }
 else
 {
    System.out.println("Elements in Queue");
    for(int i=rear;i>=0;i--)
    {
        System.out.print("\t"+Queue[i]);
    }
 }
}  
}
public class Queue
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int ch;
    QueueOpreation o=new QueueOpreation();
    while(true)
    {
    System.out.println("Press 1 for Enqueue");
    System.out.println("Press 2 for Dequeue");
    System.out.println("Press 3 fro Display");
    System.out.println("Press Any for Exit");
    System.out.println("Enter your choice=");
    ch=sc.nextInt();
    switch(ch)
      {
        case 1:o.enqueue();
               break;
        case 2:o.dequeue();
               break;
        case 3:o.display();
               break;

        default:break;
      }
    }
}
}
