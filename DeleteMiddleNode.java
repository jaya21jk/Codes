import java.util.*;
import java.lang.*;
import java.io.*;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}
public class Main
{
    static Node head;
    static Node tail;

    public static void addList(int data){
        Node nn = new Node(data);
        if(head==null){
            head = tail = nn;
        }
        tail.next = nn;
        tail = nn;
    }
    public static void deleteNode(int pos){
        if(head==null) return;
        if(pos==0){
            head.next = head;
            return;
        }
        Node curr = head;
        int i=0;
        while(curr != null && i<pos-1){
            curr = curr.next;
            i++;
        }
        if(curr==null || curr.next == null) return;
        curr.next = curr.next.next;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for(int lk = 1;lk<= test;lk++){
            head = tail = null;
            int n = scan.nextInt();
            for(int i=0;i<n;i++){
                addList(scan.nextInt());
            }
            deleteNode(n/2);
            Node curr = head;
            while(curr != null){
                System.out.print(curr.data+" ");
                curr = curr.next;
            }
            System.out.println();
        }
        
        
	}
}