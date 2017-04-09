/*
package crackingCodingInterview;
import java.util.*;


class node{
	char data;
	node next;
	
	public node(char i){
		data=i;
		this.next=null;
	}
}

public class C2a1{
public node head=new node('z');
public int cnt=0;
	public void ll_main(){
		C2a1 obj = new C2a1();
		obj.addAtend('a');
		obj.addAtend('b');
		obj.addAtend('c');
		obj.addAtend('d');
		obj.addAtend('e');
		obj.printll();
		obj.addAtend('a');
		obj.addAtend('b');
		obj.addAtend('c');
		
		obj.printll();
		obj.remdup();
		obj.printll();

	}
	
	public void addAtend(char d){
		node temp=new node(d);
		cnt++;
		if(head.next == null){
			head.next=temp;
			return;
		}
		
		node i=head;
		while(i.next != null){
			i=i.next;
		}
		i.next=temp;
		
	}
	
	public void printll(){
		node templl=head.next;
		while(templl != null){
			System.out.print(templl.data+"-->");
			templl=templl.next;
		}
		System.out.print("null");
		System.out.println("");
	}
	
	public void remdup(){
		/*
		node current=head;
		while(current!=null){
			node runner = current;
			while(runner.next!=null){
				if(runner.next.data==current.data){
					runner.next=runner.next.next;
				}
				else{
					runner=runner.next;
				}	
			}
			current=current.next;
		}
		
		
		
		HashSet<Character> hset=new HashSet<Character>();
		node current=head.next;
		node previous=null;
		while(current!=null){
			if(hset.contains(current.data)){
				previous.next=current.next;
			}
			else{
				hset.add(current.data);
				previous=current;	
			}
			current=current.next;
		}	
	}
}
*/
