package shraddha;

public class LL {
	
	private Node head;//1st node
	private Node tail;//last node
	
	private int size;
	
	public LL() {
		this.size = 0;
	}
	public void insertAtBeg(int data) {
		Node newnode=new Node(data);
		newnode.next=head;
		head=newnode;
		
		if(tail==null) {
			tail=head;//if only one element is present and maintaing tail
			
		}
		size+=1;
	}
	public void insert(int data,int index) {
		if(index==0) {
			insertAtBeg(data);
			return;
			
		}
		else if(index==size) {
			insertAtEnd(data);
			return;
		}else {
			Node temp=head;
			for(int i=1;i<index;i++) {
				temp=temp.next;
			}
			Node newnode=new Node(data,temp.next);
			temp.next=newnode;
			size++;
		}
	}
//	public void insert(int data,int position) {
//		if(position==1) {
//			insertAtBeg(data);
//			return;
//			
//		}
//		/*
//		else if(position==size) {
//			insertAtEnd(data);
//			return;
//		}*/
//	else {
//			Node temp=head;
//			for(int i=1;i<position-1;i++) {
//				temp=temp.next;
//			}
//			Node newnode=new Node(data,temp.next);
//			temp.next=newnode;
//			size++;
//		}
//	}
	public void insertAtEnd(int data) {
		Node newnode=new Node(data);
		if(tail==null) {
			insertAtBeg(data);
			return;
		}
		tail.next=newnode;
		tail=newnode;
		size++;
	}
	
	public int deleteFirst() {
		int data=head.data;
		head=head.next;
		if(head==null) {
			tail=null;
		}
		size--;
		return data;
		
	}
	public int deleteLast() {
		if(size<=1) {
			return deleteFirst();
		}
		Node secondLast=get(size-2);
		int val=tail.data;
		tail=secondLast;
		tail.next=null;
		size--;

		return val;
		
	}
	public Node findVal(int val) {
		Node node=head;
		while(node!=null) {
			if(node.data==val)
			{
				return node;
			}
			node=node.next;
		}
		return null;
	}
	public Node get(int index) {
		Node node=head;
		for(int i=0;i<index;i++) {
			node=node.next;
//			System.out.println(node.data);
		}
		
		return node;
		
		
	}
	public int delete(int index) {
		if(index==0) {
			return deleteFirst();
		}
		if(index==size-1) {
			return deleteLast();
			
		}
		Node prev=get(index-1);
		int data=prev.next.data;
		prev.next=prev.next.next;
		return data;
	}
	public void disp() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("End");
		System.out.println("size:"+size);
		
		System.out.println("head->"+head.data);
		System.out.println("tail->"+tail.data);
		
	}
	public void display(int value) {
		Node temp=head;
//		System.out.println(temp.data);
//		temp=temp.next;
//		System.out.println(temp.data);
//		System.out.println(temp.next.data);
		while(temp!=null) {
			if(temp.data==value)
			System.out.println(temp.data);
			
		}
		temp=temp.next;
	}
	private class Node{
		private int data;
		private Node next;//reference variable(points to another node type )
		public Node(int data) {//default constructor
			this.data=data;
		}
		public Node(int data,Node next) {//parametarised constructor
			this.data=data;
			this.next=next;
		}
	}

}
