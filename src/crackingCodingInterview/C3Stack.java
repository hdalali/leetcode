package crackingCodingInterview;
import java.util.Stack;
import java.util.EmptyStackException;

public class C3Stack {
	public static void stk_main(){
	Stack<Integer> st=new Stack<Integer>();
	print(st);
	st.push(1);
	st.push(2);
	st.push(3);
	print(st);
	st.pop();
	st.push(7);
	st.push(125);
	st.push(400);
	print(st);
	int p=st.peek();
	System.out.println("Top element is:"+p);
	boolean b=st.isEmpty();
	System.out.println("Stack is empty?:"+b);
	int sz=st.size();
	System.out.println("Size is:"+sz);
	int srch=st.search(40);
	System.out.println("Searched element  exist? offset from top is:"+srch);
	try {
        st.pop();
        print(st);
        st.pop();
        print(st);
        st.pop();
        print(st);
        st.pop();
        print(st);
        st.pop();
        print(st);
        st.pop();
        print(st);
        st.push(69);
        print(st);
     }catch (EmptyStackException e) {
        System.out.println("empty stack");
     }
	}
	
	public static void print(Stack<Integer> stk){
		System.out.println(""+stk);
	}
}
