package shraddha;

public class DLLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DLL list=new DLL();
		list.insertAtBeg(10);
		list.insertAtBeg(25);
		list.insertAtBeg(50);
		list.insertLast(21);
		list.insertAfter(25, 75);
		list.insertAfter(21, 12);
		list.disp();
	}

}
