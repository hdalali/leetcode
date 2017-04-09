package prep1;
import java.util.Scanner;
public class stack {
	
	public int size;
	public int top;
	public int stackarr[];
	
	public stack(int p){
		size=p;
		stackarr=new int[size];
		top=-1;
	}	
	
	public static void stk_main(){
		int cnt=0;
	    System.out.println("Enter the number of elements you want");
	    Scanner ip=new Scanner(System.in);
	    int sz;
	    sz=ip.nextInt();
		stack Stack=new stack(sz);
		String sp;
		while(cnt<7){
		System.out.println("Do u want to push or pop or top\n");
		sp=ip.next();
		String tmp=sp;
		if(tmp.compareTo("push")==0){
			System.out.println("Enter the element u want to push\n");	
			int ele;
			ele=ip.nextInt();
			Stack.push(ele);
			cnt++;
		}
		else if(tmp.compareTo("pop")==0){
			Stack.pop();
			cnt++;
		}
		else if(tmp.compareTo("top")==0){
	    Stack.topelement();
	    cnt++;
		}
		else{
			System.out.println("input incorrect\n");
		}
		}
	}
	
	
	public void push(int x){
		if(isstackfull()){
			System.out.println("Sorry,stack is full but increasing capacity\n");
			int[] newstack=new int[size];
			for(int pz=0;pz<size;pz++){
				newstack[pz]=stackarr[pz];
			}
			size=size*2;
			System.out.printf("new length is %d",size);
			stackarr=new int[size];
			for(int py=0;py<(size/2);py++){
				stackarr[py] = newstack[py];
			}
			
			return;
		}
		++top;	
		stackarr[top]=x;
		System.out.printf("Your element %d has been pushed in stack and top is %d\n",x,top);
	}
	
	public void pop(){
		if(isstackempty()){
			System.out.println("Sorry,stack is empty,you cant pop");
			return;
		}
		--top;	
		System.out.printf("You have popped successfully and top is %d\n",top);

	}
	
	public void topelement(){
			System.out.printf("the topmost element is %d\n", stackarr[top]);
	}
	
	public boolean isstackfull(){
		return(top==size-1);
	}
	
	public boolean isstackempty(){
		return(top==-1);
	}
	
	
}
