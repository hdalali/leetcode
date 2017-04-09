
package prep1;
import java.util.Scanner;


class Mylist {

	int info;
	Mylist link;
	
	Mylist(){
		this.link = null;
	}
	
}

public class Link_list{
	public static void llend_main(){
		
		Scanner sc = new Scanner(System.in);
		
		/*
		//creation of nodes..
		
		Mylist a= new Mylist();
		Mylist b= new Mylist();
		Mylist c= new Mylist();
		
		
		//storing of data into the info field of the nodes..
		
		System.out.println("Enter info of node a");
		a.info=s.nextInt();
		
		System.out.println("Enter info of node b");
		b.info=s.nextInt();
		
		System.out.println("Enter info of node c");
		c.info=s.nextInt();
		
		//Linking of nodes
		
		a.link=b;
		b.link=c;
		
		System.out.println("\n\t");
		while(a != null){
			System.out.print(a.info+"->");
			a=a.link;
		}
		System.out.print("null");
		
		*/
		
		char c;
		Mylist s= new Mylist();
		Mylist t = s;
		
		System.out.println("\t Please enter the data for the info field:");
		s.info = sc.nextInt();
		while(true){
			System.out.println("\t to add node press y else n");
			c=sc.next().charAt(0);
			
			if(c == 'n' || c=='N'){
				System.out.println("Ur final linked list is");
				
				
				s=t;
				System.out.println("\n\t");
				while(s != null){
					System.out.print(s.info+"->");
					s=s.link;
				}
				System.out.print("null");
				
				break;
			}
			Mylist l=new Mylist();
			System.out.println("\t enter data for info field");
			l.info=sc.nextInt();
			s.link = l;
			
			
			s=t;
			System.out.println("\n\t");
			System.out.println("ur present linked list is");
			while(s != null){
				System.out.print(s.info+"->");
				s=s.link;
			}
			System.out.print("null");
			System.out.println();
			
			s=l;
			
		}
	}
	
	public static void llstart_main(){
		
		Scanner sc = new Scanner(System.in);
		char c;
		Mylist s= new Mylist();
		Mylist t = s;
		Mylist p;
		
		System.out.println("\t Please enter the data for the info field:");
		s.info = sc.nextInt();
		while(true){
			System.out.println("\t to add node press y else n");
			c=sc.next().charAt(0);
			
			if(c == 'n' || c=='N'){
				System.out.println("Ur final linked list is");
				
				
				s=t;
				System.out.println("\n\t");
				while(s != null){
					System.out.print(s.info+"->");
					s=s.link;
				}
				System.out.print("null");
				
				break;
			}
			Mylist l=new Mylist();
			System.out.println("\t enter data for info field");
			l.info=sc.nextInt();
			l.link = s;
			
			s=l;
			System.out.println("\n\t");
			System.out.println("ur present linked list is");
			while(s != null){
				System.out.print(s.info+"->");
				s=s.link;
			}
			System.out.print("null");
			System.out.println();
			
			s=l;
			t=s;
			
		}
	}
	
	public static void llpos_main(){
		
		Scanner sc = new Scanner(System.in);
		char c;
		Mylist s= new Mylist();
		Mylist t = s;
		Mylist t1 =s;
		Mylist t2;
		Mylist p;
		Mylist ite;
		Mylist prev;
		Mylist cur;
		Mylist nxt;
		int cnt2=0;
		int cnt=1;
		int delpos;
		int delcnt;
		Mylist deltemp;
		
		System.out.println("\t Please enter the data for the info field of first node:");
		s.info = sc.nextInt();
		while(true){
			System.out.println("\t to add node press y else n or r to reverse or d to delete");
			c=sc.next().charAt(0);
			
			
			
			if(c == 'n' || c=='N'){
				System.out.println("Ur final linked list is");
				
			
				System.out.println("\n\t");
				while(s != null){
					System.out.print(s.info+"->");
					s=s.link;
				}
				System.out.print("null");
				
				break;
			}
			
			if(c == 'r'){
				cur=s;
				prev=null;
				while(cur!=null){
					nxt=cur.link;
					cur.link=prev;
					prev=cur;
					cur=nxt;
				}
				s=prev;
				ite=s;
				System.out.println("\n\t");
				System.out.println("ur reversed linked list is");
				while(ite != null){
					System.out.print(ite.info+"->");
					ite=ite.link;
				}
				System.out.print("null");
				System.out.println();
				break;
			}
			
			if(c == 'd'){
			System.out.println("u wanna delete the element");
			labl: {
				System.out.println("Enter the pos of node u wanna delete");
			delpos=sc.nextInt();
			delcnt=delpos-2;
			if(delpos>cnt){
				System.out.println("ur pos is incorrect,enter correct pos");
				break;
			}
			if(delpos==1){
				s=s.link;
			}
			else if(delpos==2){
				s.link=s.link.link;
			}
			else{
				deltemp=s;
				while(delcnt>0){
					deltemp=deltemp.link;
					delcnt--;
				}
				deltemp.link=deltemp.link.link;
			}
				ite=s;
				System.out.println("\n\t");
				System.out.println("ur deleted linked list is");
				while(ite != null){
					System.out.print(ite.info+"->");
					ite=ite.link;
				}
				System.out.print("null");
				System.out.println();
				break;
			}
			}
			
			System.out.println("\t Insert the position u want to enter");
			int pos=sc.nextInt();
			int iter = pos-2;
			
			
			cnt++;
			if(pos > (cnt)){
				System.out.println("Sorry,u r trying to insert at pos greter than number of elements");
				break;
			}
			Mylist l=new Mylist();
			System.out.println("\t enter data for info field");
			l.info=sc.nextInt();
			
			t=s;
			while(iter >0){
				t = t.link;
				iter--;
			}
			
			if(pos == 1){
				l.link=s;
				s=l;	
			}
			
			else{
				l.link=t.link;
				t.link=l;
			}
			
			ite=s;
			System.out.println("\n\t");
			System.out.println("ur present linked list is");
			while(ite != null){
				System.out.print(ite.info+"->");
				ite=ite.link;
			}
			System.out.print("null");
			System.out.println();
			
		}
	}
}
