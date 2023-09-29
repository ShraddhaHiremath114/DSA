package shraddha;
import java.util.LinkedList;
public class CollectionLinkedList {
	public static void main(String args[]) {
		LinkedList<Integer> list=new LinkedList<>();
		LinkedList<Integer> list3=new LinkedList<>();
		list.add(100);
		list.add(200);
//		System.out.println(list.getFirst());
		list.addLast(3);
		list.clear();
		list.add(1);
		list.addFirst(67);
		list.addLast(76);
		System.out.println(list.contains(67));
		list.add(1, 3);
		list.addAll(list);
		Object list2=list.clone();
		System.out.println(list2);
		System.out.println(list3.containsAll(list));
//		System.out.println(list.descendingIterator());
		System.out.println(list.element());
//		list.forEach(null);
		System.out.println(list.get(3));
		System.out.println(list.getClass());
		System.out.println(list.hashCode());
		int ind2=list.indexOf(list2);
		System.out.println(ind2);
		System.out.println(list.isEmpty());
		list.offer(100);
		list.offer(20);
		System.out.println(list.peek());
//		list.poll()
		list.remove(1);
		list.set(1, 3);
		System.out.println(list.size());
		System.out.println(list.toArray());
		
		String str=list.toString();
		System.out.println(str);
		System.out.println(list);
	}
}
