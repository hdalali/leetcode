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

public class C2a7 {
public node head1=new node(100);
public node head2=new node(100);
	public void llpal_main(){
		C2a7 obj=new C2a7();
		obj.add(head1,1);
		obj.add(head1,2);
		obj.add(head1,3);
		obj.add(head1,4);
		obj.add(head1,5);
		obj.add(head2,3);
		obj.add(head2,4);
		obj.add(head2,5);
		obj.printllm(head1);
		obj.printllm(head2);
		node tempz=obj.overlap(head1, head2);
		if(tempz==null){
			System.out.println("does not have intersection");
		}
		else
		System.out.println(""+tempz.data);
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
	
	public node overlap(node tempx,node tempr){
		int cnt1=0;
		int cnt2=0;
		node temp1=tempx.next;
		node temp2=tempr.next;
		while(temp1.next!=null){
			cnt1++;
			temp1=temp1.next;
		}
		cnt1++;
		int data1=temp1.data;
		while(temp2.next!=null){
			cnt2++;
			temp2=temp2.next;
		}
		cnt2++;
		int data2=temp2.data;
		
		int dif=cnt1-cnt2;
		if(data1!=data2){
			return null;
		}
	
		node temp3=tempx.next;
		for(int i=0;i<dif;i++){
			temp3=temp3.next;
		}
		node temp4=tempr.next;
		while(temp4.data!=temp3.data){
			temp4=temp4.next;
			temp3=temp3.next;
		}
		return temp4;
	}
}
*/

