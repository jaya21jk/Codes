/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

public class Main
{
    static Node head;
    static Node tail;
    public static void addlist(int data){
        Node nn = new Node(data);
        if(head==null){
            head = tail = nn;
        }else{
            tail.next = nn;
            tail = nn;
        }
    }
    public static void display(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static Node altrnate1(Node head){
        Node odd = head;
        Node even = head.next;
        Node evenHead = even;
        while(even!=null && even.next!=null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        even.next = null;
        evenHead = reverse(evenHead);
        Node dummy = new Node(-1);
        Node curr = dummy;
        Node head2 = head;
        while(head2!=null && evenHead!=null){
            if(head2!=null){
                curr.next = head2;
                head2 = head2.next;
                curr = curr.next;
            }
            if(evenHead!=null){
                curr.next = evenHead;
                evenHead = evenHead.next;
                curr = curr.next;
            }
        }
        return dummy.next;
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=1;i<=n;i++){
		    addlist(i);
		}
		Node aa = altrnate1(head);
		display(aa);
	}
}
