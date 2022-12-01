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
    public static Node altrnate(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node head1 = slow.next;
        slow.next = null;
        head1 = reverse(head1);
        Node dummy = new Node(-1);
        Node curr = dummy;
        while(head!=null || head1!=null){
            if(head!=null){
                curr.next = head;
                head = head.next;
                curr = curr.next;
            }
            if(head1!=null){
                curr.next = head1;
                head1 = head1.next;
                curr = curr.next;
            }
        }
        return dummy.next;
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0;i<n;i++){
		    addlist(scan.nextInt());
		}
		Node as = altrnate(head);
		display(as);
	}
}
