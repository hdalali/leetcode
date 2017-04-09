package crackingCodingInterview;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class C3Queue {
	public static void qmain(){
		
		PriorityQueue<Integer> q1=new PriorityQueue<Integer>();
		System.out.println("after declaring:"+q1);
		q1.add(1);
		q1.add(2);
		q1.add(3);
		q1.add(4);
		q1.add(5);
		System.out.println("after adding elements:"+q1);
		q1.remove();
		System.out.println("after removing one element"+q1);
		int i=q1.peek();
		System.out.println("The peeked element is:"+i);
		int x=7;
		boolean b=q1.contains(x);
		System.out.printf("is element %d present? %b",x,b);
	}
}
