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

public class C2a4 {
public node head=new node(100);
	public void llcirc_main(){
		C2a4 obj=new C2a4();
		obj.add(7);
		obj.add(5);
		obj.add(8);
		obj.add(5);
		obj.add(10);
		obj.add(2);
		obj.add(1);
		int tst=5;
		obj.printllm();
		obj.loop_par(tst);
		obj.printllm();
	
		
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
	
	public void loop_par(int j){
		int tst=j;
		node sp=head;
		node fp=head;
		int tmp1;
		while(fp.next!=null){
			if(fp.next.data>=tst){
				fp=fp.next;
			}
			else if(fp.next.data<tst){
				tmp1=sp.next.data;
				sp.next.data=fp.next.data;
				fp.next.data=tmp1;
				sp=sp.next;
				fp=fp.next;
			}
		}
		
	}
}
*/
