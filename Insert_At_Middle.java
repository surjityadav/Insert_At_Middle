
import java.util.Scanner;


public class Insert_At_Middle 
{
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    static Node head;
    static void insert(int data)
    {
        Node temp=new Node(data);
        if(head==null)
        {
            head=temp;
            return;
        }
        Node cur=head;
        while(cur.next!=null)
        {
            cur=cur.next;
        }
        cur.next=temp;
    }
    static void insertMid(int data,int size)
    {
        int count;
        int x=size/2;
        if(size%2!=0)
            count=0;
        
        else
            count=1;
        Node cur=head;
        Node temp=new Node(data);
        while(cur!=null && count < x)
        {
            count++;
            cur=cur.next;
        }
        Node t=cur.next;
        cur.next=temp;
        temp.next=t;
    }
    static void print()
    {
        Node cur=head;
        while(cur!=null)
        {
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
    }
    public static void main(String args[])
    {
        Insert_At_Middle in=new Insert_At_Middle();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            in.insert(sc.nextInt());
        }
        System.out.println("Enter the Node to be inserted at middle: ");
        int n=sc.nextInt();
        in.insertMid(n,size);
        in.print();
        
    }
    
}
