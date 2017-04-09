/*
package crackingCodingInterview;

class node{
		char data;
		node next;
		
		public node(char i){
			data=i;
			this.next=null;
		}
}

	public class C2a3{
	public node head=new node('z');
	public int cnt=0;
		public void ll_main(){
			C2a3 obj = new C2a3();
			obj.addAtend('a');
			obj.addAtend('b');
			obj.addAtend('c');
			obj.addAtend('d');
			obj.addAtend('e');
			obj.addAtend('f');
			obj.addAtend('g');
			obj.addAtend('h');
			
			node temple=obj.tra();
			obj.delnode(temple);
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
		
		public node tra(){
			node templd=head.next.next.next.next;
			return templd;
		}
		public boolean delnode(node n){
			 if(n==null || n.next==null)
				 return false;
			 node nxt=n.next;
			 n.data=nxt.data;
			 n.next=nxt.next;
			 return true;
		}	
}
*/

