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

	public class C2a2{
	public node head=new node('z');
	public int cnt=0;
		public void ll_main(){
			C2a2 obj = new C2a2();
			obj.addAtend('a');
			obj.addAtend('b');
			obj.addAtend('c');
			obj.addAtend('d');
			obj.addAtend('e');
			obj.addAtend('f');
			obj.addAtend('g');
			obj.addAtend('h');
			
			obj.printll();
			char d=obj.kthll(9);
			System.out.println("Answer is:"+d);
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
		
		public char kthll(int p){
			node n1=head;
			node n2=head;
			for(int i=0;i<p;i++){
				if(n1==null)
				{
					System.out.println("out of bounds");
					return 0;
				}
				n1=n1.next;
			}
			while(n1!=null){
				n1=n1.next;
				n2=n2.next;
			}
			return n2.data;
		}
}
*/
