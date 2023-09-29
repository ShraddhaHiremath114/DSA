package shraddha;

public class DLL {
	private Node head;
	
	private int size;
	public DLL() {
		this.size=0;
		
	}
	public void insertAtBeg(int data) {
		Node newnode=new Node(data);
		newnode.next=head;
		newnode.prev=null;
		if(head!=null) {
			head.prev=newnode;
		}
		head=newnode;
		size++;
	}
	public void insertLast(int data) {
		Node newnode=new Node(data);
		Node temp=head;
		newnode.next=null;
		if(head==null) {
			newnode.prev=null;
			head=newnode;
			return;
		}
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newnode;
		newnode.prev=temp;
		size++;
	}
	public Node find(int data) {
		Node p=head;
		while(p!=null) {
			if(p.data==data)
			 return p;
			p=p.next;
		}
		return null;
	}
	public void insertAfter(int after,int data) {
		
		Node p=find(after);
		if(p==null) {
			System.out.println("Sry Not found");
			return;
		}
		Node newnode=new Node(data);
		newnode.next=p.next;
		p.next=newnode;
		newnode.prev=p;
		if(newnode.next!=null) {
			newnode.next.prev=newnode;
		}
	}
	public void disp() {
		Node temp=head;
		Node last=null;
		while(temp!=null){
			System.out.print(temp.data+"-> ");
			last=temp;
			temp=temp.next;
		}
		
		System.out.println("End");
		System.out.println("size="+size);
		System.out.println("Print in Reverse");
		while(last!=null) {
			System.out.print(last.data+"->");
			last=last.prev;
		}
		System.out.println("Start");
		
		
	}
	private class Node{
		int data;
		Node next;
		Node prev;
		
		public Node(int data){
			this.data=data;
		}
		public Node(int data,Node next,Node prev){
			this.data=data;
			this.next=next;
			this.prev=prev;
		}
	}
}
