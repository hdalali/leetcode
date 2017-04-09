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

public class C2a5 {
public node head1=new node(100);
public node head2=new node(50);
public int cnt=0;
	public void ll_main(){
		C2a5 obj = new C2a5();
		
		
		obj.addAtend(head1,7);
		obj.addAtend(head1,1);
		obj.addAtend(head1,6);
		obj.printll(head1);
		int ans=obj.conv2int(head1);
		System.out.println(""+ans);
		obj.addAtend(head2,5);
		obj.addAtend(head2,9);
		obj.addAtend(head2,2);
		obj.printll(head2);
		int ans2=obj.conv2int(head2);
		System.out.println(""+ans2);
		int sum=ans+ans2;
		node head4=obj.conv2ll(sum);
		obj.printll(head4);
	}
	
	public void addAtend(node head,int d){
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
	
	public void printll(node head){
		node templl=head.next;
		while(templl != null){
			System.out.print(templl.data+"-->");
			templl=templl.next;
		}
		System.out.print("null");
		System.out.println("");
	}
	
	public int conv2int(node head){
		int i=0;
		int mult=1;
		node trv=head;
		trv=trv.next;
		while(trv!=null){
			i+=trv.data*mult;
			mult*=10;
			trv=trv.next;
		}
		return i;
	}
	
	public node conv2ll(int p){
		int i=p;
		int mult=10;
		node head3=new node(500);
		int ansx=i;
		//int cntx=0;
		while(ansx!=0){
			int nn=ansx%mult;
			
			node tempx=new node(nn);
			cnt++;
			if(head3.next == null){
				head3.next=tempx;
				//return null;
			}
			else{
			node z=head3;
			while(z.next != null){
				z=z.next;
			}
			z.next=tempx;
			}
			ansx=ansx/mult;
		}
		return head3;
	}
	
	public void revll(node head){
		node prev=null;
		node cur=head.next;
		node nxt;
		while(cur!=null){
			nxt=cur.next;
			cur.next=prev;
			prev=cur;
			cur=nxt;
		}
		node temp1=new node(100);
		temp1.next=prev;
		head=temp1;
	}
		
}
*/
