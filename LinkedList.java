
import java.util.*;

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
    public static void addElement(int data){
        Node nn = new Node(data);
        if(head==null){
            head = tail = nn;
        }else{
        tail.next = nn;
        tail = nn;
        }
    } 
    public static void display(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=1;i<=n;i++){
		    addElement(scan.nextInt());
		}
		display();
	}
}
