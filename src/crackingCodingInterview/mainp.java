package crackingCodingInterview;
import java.util.*;
public class mainp {
	public static void main(String[] args){
		//c1a1.uniq();
		//C1a2.strrev_main();
		//C1a3.dup_main();
		//C1a4.ana_main();
		//C1a5.rep_main();
		//C1a6.matrot_main();
		//C1a7.setzero_main();
		//C1a8.issub_main();
		
		//C2AddAtEnd obj2 = new C2AddAtEnd();
		//obj2.ll_main();
		
		//C2a1 obj3 = new C2a1();
		//obj3.ll_main();
		
		//C2a3 obj3 = new C2a3();
		//obj3.ll_main();
		
		//C2a5 obj3 = new C2a5();
		//obj3.ll_main();
		
		//C2a6a obj3 = new C2a6a();
		//obj3.llpal_main();
		
		//C2a8 obj3 = new C2a8();
		//obj3.llcirc_main();
		
		//C2a4 obj3 = new C2a4();
		//obj3.llcirc_main();
		
		//C3Stack.stk_main();
		
		//C3Queue.qmain();
		
		List<List<Integer>> flist = new LinkedList<List<Integer>>();
		List<Integer> temp = new LinkedList<Integer>();
		temp.add(0);
		temp.add(1);
		temp.add(2);
		flist.add(temp);
		
		temp.add(0);
		temp.add(1);
		temp.add(2);
		flist.add(temp);
		System.out.println(flist.get(0));
	}
}

