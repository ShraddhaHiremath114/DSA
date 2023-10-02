package LinkedListQue;

public class IsPAlindrome {
	private Node head;
	
	
	public void insertBeg(int data) {
		Node newnode=new Node(data);
		
		newnode.next=head;
		head=newnode;
	}
	public void insertEnd(int data) {
		Node newnode=new Node(data);
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newnode;
		
	}
	public void insertAtPos(int data,int pos) {
		Node newnode=new Node(data);
		if(pos==1) {
			insertBeg(data);
			return;
		}
		Node prev=head;//At 1st pos
		int i=1;
		while(i<pos-1) {
			prev=prev.next;
			i++;
		}
		newnode.next=prev.next;
		prev.next=newnode;
		
	}
	public void insertAtind(int data,int ind) {
		Node newnode=new Node(data);
		if(ind==0) {
//			newnode.next=head;
//			head=newnode;
			insertBeg(data);
			return;
		}
		int size=findsize();
		if(ind==size) {
			//size is 8 and wanna insert at ind 8
			insertEnd(data);
			return;
		}
		Node prev=head;
		int i=1;
		while(i<ind) {
			prev=prev.next;
			i++;
		}
		newnode.next=prev.next;
		prev.next=newnode;
		
		
	}
	public int findsize() {
		int size=0;
		Node temp=head;
		while(temp!=null) {
			temp=temp.next;
			size++;
		}
		return size;
	}
	public void disp() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	public void reverseLinkedList() {
		Node curr=head;
		Node prev=null;
		Node next=null;
		
		while(curr!=null) {
			next=curr.next;//backup
			curr.next=prev;//link to back
			prev=curr;
			curr=next;
			
		}
		Node temp=prev;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	public Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        Node next=null;
        
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public Node findMiddle(Node head){
        Node small=head;
        Node faster=head;
        
        while(faster.next!=null && faster.next.next!=null){
            faster=faster.next.next;
            small=small.next;
        }
        return small;//mid
    }
    //Function to check whether the list is palindrome.
    boolean isPalindrome() 
    {
        //Your code here
        if(head==null || head.next==null)return true;
        
        Node midNode=findMiddle(head);
        Node newHead=reverse(midNode.next);
        
        Node first=head;
        while(newHead!=null){
            if(first.data!=newHead.data){
                return false;
            }
            first=first.next;
            newHead=newHead.next;
        }
        return true;
    }
    
    public int FindNthNodeFromLast(int n) {
    	int size=0;
    	Node temp=head;
    	while(temp!=null) {
    		temp=temp.next;
    		size++;
    	}
    	if(n==size) {
    		return head.data;
    	}
    	int N=size-n;
    	int i=1;
    	Node prev=head;
    	while(i<N) {
    		prev=prev.next;
    		i++;
    	}
    	int ans = prev.next.data;
    	return ans;
    }
    public int FindNthNodeFromFirst(int n) {
    	int size=0;
    	Node temp=head;
    	while(temp!=null) {
    		temp=temp.next;
    		size++;
    	}
    	if(n==1) {
    		return head.data;
    	}
    	
    	int i=1;
    	Node prev=head;
    	while(i<n) {
    		prev=prev.next;
    		i++;
    	}
    	int ans = prev.data;
    	return ans;
    }
    public void deleteXth(int x) {
    	int size=0;
    	Node temp=head;
    	while(temp!=null) {
    		temp=temp.next;
    		size++;
    	}
    	if(x==1) {
    		head=head.next;
    		return;
    	}
    	Node prev=head;
    	int i=1;
    	while(i<x-1) {
    		prev=prev.next;
    		i++;
    	}
    	prev.next=prev.next.next;
    }
    public int findx(int ele) {
    	int size=0;
    	Node temp=head;
    	while(temp!=null) {
    		temp=temp.next;
    		size++;
    	}
    	int x=1;
    	Node search=head;
    	while(search!=null) {
    		if(search.data==ele) {
    			return x;
    		}
    		x++;
    		search=search.next;
    	}
    	return -1;
    }
    public void RemoveDup() {
    	Node temp=head;
    	while(temp.next!=null) {
    		if(temp.next.data==temp.data) {
    			temp.next=temp.next.next;
    		}
    		else {
    			temp=temp.next;
    		}
    	}
    }
	private class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this .data=data;
		}
		public Node(int data,Node next) {
			this.data=data;
			this.next=next;
			
		}
		
	}
}
