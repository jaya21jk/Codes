
import java.util.*;
import java.io.*;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
	}
}
public class Main {
	static Node head;
	static Node tail;
	public static void add(int data){
		Node nn = new Node(data);
		if(head==null){
			head = tail = nn;
		}else{
			tail.next = nn;
			tail = nn;
		}
	}
	public static int countofnode(){
		Node curr = head;
		int len = 0;
		while(curr!=null){
			len++;
			curr = curr.next;
		}
		return len;
	}
	public static void display(Node node){
		Node curr = node;
		while(curr!=null){
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
	}
	public static void swapKth(int k){
		int n = countofnode();
		if(n<k) return;
		if(2*k-1==n) return;
		Node x = head;
		Node x_prev = null;
		for(int i=1;i<k;i++){
			x_prev = x;
			x = x.next;
		}
		Node y = head;
		Node y_prev = null;
		for(int i=1;i<n-k+1;i++){
			y_prev = y;
			y = y.next;
		}
		if(x_prev!=null){
			x_prev.next = y;
		}
		if(y_prev!=null){
			y_prev.next = x;
		}
		Node temp = x.next;
		x.next = y.next;
		y.next = temp;
		if(k==1) head = y;
		if(k==n) head = x;
	}
    public static void main(String args[]) {
        //your code here
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		for(int i=0;i<n1;i++){
			add(scan.nextInt());
		}
		swapKth(n2);
		display(head);
    }
}