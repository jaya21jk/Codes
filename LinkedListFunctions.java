
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
        System.out.println();
    }
    public static void RemoveFirst(){
        if(head==null){
            return;
        }else if(head==tail){
            head = tail = null;
        }
        else{
            head = head.next;
        }
    }
    public static Node getvalue(int idx){
        Node curr = head;
        if(idx<0){
            System.out.println("given index is out of range");
            return null;
        } 
        for(int i=0;i<idx;i++){
            if(curr==null){
            System.out.println("given index is out of range");
            return null;
        }
            curr = curr.next;
        }
        return curr;
    }
    public static void addElement(int indx,int data){
        //Node curr = head;
        Node nn = new Node(data);
        if(indx==0){
            nn.next=head;
            head = nn;
        }else{
            Node curr = getvalue(indx-1);
            Node nextcurr = curr.next;
            curr.next = nn;
            nn.next = nextcurr;
        }
        
        
    }
    public static Node removeLast(){
        //Node ss = head;
        Node curr = head;
        if(head==null){
            return null;
        }else if(head==tail){
            Node tr = tail;
            head = tail = null;
            
            return tr;
        }else{
            //Node curr = head;
            while(curr.next.next!=null){
                curr = curr.next;
            }
            curr.next = null;
            Node tr = tail;
            tail = curr;
            return tr;
        }
        
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=1;i<=n;i++){
		    addElement(i);
		}
		display();
		//RemoveFirst();
		Node ss = getvalue(0);
		if(ss!=null)
		    System.out.println(ss.data);
		display();
		addElement(0,15);
		display();
		Node as = removeLast();
		System.out.println(as.data);
		display();
	}
}
