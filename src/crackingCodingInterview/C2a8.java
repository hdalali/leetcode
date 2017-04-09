/*
package crackingCodingInterview;

class node{
	int data;
	node next;
	public node(int i){
		data=i;
		this.next=null;
	}
}

public class C2a8 {
public node head=new node(100);
	public void llcirc_main(){
		C2a8 obj=new C2a8();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		obj.add(6);
		obj.add(7);
		obj.printllm();
		node temple=obj.tra();
		System.out.println(""+temple.data);
		obj.circ(temple);
		node tx=obj.loop_dec();
		System.out.println("Ans is:"+tx.data);
		
	}
	public void add(int j){
		node temp=head;
		node temp1=new node(j);
		if(head.next==null){
			head.next=temp1;
			return;
		}
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=temp1;
	}
	
	public void printllm(){
		node temp=head;
		temp=temp.next;
		while(temp!=null){
			System.out.print(""+temp.data+"-->");
			temp=temp.next;
		}
		System.out.print("null");
		System.out.println("");
	}
	
	public node tra(){
		node templd=head.next.next.next.next;
		return templd;
	}
	
	public void circ(node t){
		node temp1=head;
		while(temp1.next!=null){
			temp1=temp1.next;
		}
		temp1.next=t;
	}
	
	public node loop_dec(){
		node sp=head;
		node fp=head;
		node tmp=head;
		while(fp.data!=sp.data){
			fp=fp.next.next;
			sp=sp.next;
		}
		sp=tmp.next;
		while(fp.data!=sp.data){
			fp=fp.next;
			sp=sp.next;
		}
		return fp;
	}
}
*/
