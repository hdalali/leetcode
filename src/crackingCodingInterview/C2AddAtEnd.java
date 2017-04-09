package crackingCodingInterview;

/*
class node{
	int data;
	node next;
	
	public node(int i){
		data=i;
		this.next=null;
	}
}

public class C2AddAtEnd {
public node head=new node(100);
public int cnt=0;
	public void ll_main(){
		C2AddAtEnd obj = new C2AddAtEnd();
		
		
		obj.addAtend(1);
		obj.addAtend(2);
		obj.addAtend(3);
		obj.addAtend(4);
		obj.addAtend(5);
		obj.addAtStart(6);
		obj.addAtStart(7);
		obj.printll();
		obj.addAtPos(8,8);
		obj.printll();
		obj.delpos(2);
		obj.printll();
		obj.delpos(1);
		obj.printll();
		obj.delpos(6);
		obj.printll();
		obj.revll();
		obj.printll();
	}
	
	public void addAtend(int d){
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
	
	public void addAtStart(int d){
		node temp=new node(d);
		cnt++;
		if(head.next==null){
			head.next=temp;
			return;
		}
		node i=head;
		temp.next=i.next;
		head.next=temp;
		
	}
	
	public void addAtPos(int d,int pos){
		node temp=new node(d);
		cnt++;
		if(pos>cnt){
			System.out.println("Sorry,trying to insert at the position greater than number of elements");
			return;
		}
		int trv = pos-1;
		
		if(pos==1){
			node i=head;
			temp.next=i.next;
			head.next=temp;
		}
		else{
			node i=head;
			while(trv != 0){
				i=i.next;
				trv--;
			}
			temp.next=i.next;
			i.next=temp;
		}
	}
	
	public void delpos(int pos){
		int deltrav=pos-1;
		if(pos>cnt){
			System.out.println("Sorry,trying to delete at the position greater than number of elements");
			return;
		}
		--cnt;
		if(pos==1){
			head.next=head.next.next;
		}
		else {
			node i=head;
			while(deltrav!=0){
				i=i.next;
				deltrav--;
			}
			i.next=i.next.next;
		}
		
	}
	
	public void revll(){
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
	
	public void printll(){
		node templl=head.next;
		while(templl != null){
			System.out.print(templl.data+"-->");
			templl=templl.next;
		}
		System.out.print("null");
		System.out.println("");
	}
}
*/
