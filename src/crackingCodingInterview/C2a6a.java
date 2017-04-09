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

public class C2a6a {
public node head1=new node(100);
	public void llpal_main(){
		C2a6a obj=new C2a6a();
		obj.add(head1,1);
		obj.add(head1,2);
		obj.add(head1,3);
		obj.add(head1,4);
		obj.add(head1,5);
		obj.add(head1,4);
		obj.add(head1,3);
		obj.add(head1,2);
		obj.printllm(head1);
		node revhead = obj.revll(head1);
		obj.printllm(revhead);
		boolean b=obj.pal(head1, revhead);
		if(b==true){
			System.out.println("Yes,pali");
		}
		else
			System.out.println("NO,not pali");
		
	}
	public void add(node head,int j){
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
	
	public void printllm(node head){
		node temp=head;
		temp=temp.next;
		while(temp!=null){
			System.out.print(""+temp.data+"-->");
			temp=temp.next;
		}
		System.out.print("null");
		System.out.println("");
	}
	
	public node revll(node head){
		node prev=null;
		node cur=head.next;
		node nxt;
		while(cur!=null){
			nxt=cur.next;
			cur.next=prev;
			prev=cur;
			cur=nxt;
		}
		node nj=new node(800);
		nj.next=prev;
		return nj;
	}
	
	public boolean pal(node tempx,node tempr){
		node temp1=tempx.next;
		node temp2=tempr.next;
		while(temp1!=null){
			if(temp1.data != temp2.data)
				return false;
			temp1=temp1.next;
			temp2=temp2.next;
		}
		return true;
	}
}
*/
