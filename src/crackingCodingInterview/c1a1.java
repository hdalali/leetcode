package crackingCodingInterview;
import java.util.*;

public class c1a1 {
	public static void uniq(){

		boolean res = isuniq("abcdefgg");
				if(res == true){
					System.out.println("String HAS ALL unique characters");
				}
				else if(res == false )
					System.out.println("String does NOT have unique characters");
	}
	public static boolean isuniq(String str){
		int val;
		boolean[] b = new boolean[256];
		
		for(int i=0;i<str.length();i++){
			val= str.charAt(i);
			if(b[val]) return false;
			b[val]=true;
		}
		return true;
	}
}
