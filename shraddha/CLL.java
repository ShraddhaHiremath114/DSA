package shraddha;

public class CLL {
	private Node head;
	private Node tail;
	public CLL() {
		this.head=null;
		this.tail=null;
	}
	public void insert(int val) {
		Node newnode=new Node(val);
		if(head==null) {
			head=newnode;
			tail=newnode;
			return;
		}
		tail.next=newnode;
		newnode.next=head;
		tail=newnode;
	}
	public void disp() {
		Node temp=head;
		if(head!=null) {
			do {
				System.out.print(temp.val+"->");
				if(temp.next!=null) {
					temp=temp.next;
				}
			}while(temp!=head);
		}
		System.out.println("Head");
	}
	public void delete(int val) {
		Node temp=head;
		if(temp==null) {//if no element in linkedlist
			return;
		}
		if(head==tail) {//Only one element is present in linked list
			head=null;
			tail=null;
			return;
		}
		if(temp.val==val) {//if 1st element at head is ==val
			head=head.next;
			tail.next=head;
			return;
		}
		do {
			Node n=temp.next;
			if(n.val==val) {
				temp.next=n.next;
				break;
			}
			temp=temp.next;
			
		}while(temp!=head);
	}
	private class Node{
		int val;
		Node next;
		
		public Node(int val) {
			this.val=val;
		}
	}
}
