package crackingCodingInterview;
import java.util.*;

public class c1a1 {
	public static void uniq(){
		/*
		String s=new String();
		s = "abcdefg";
		char c1,c2;
		int i,j;
		for(i=0;i<s.length();i++){
			c1 = s.charAt(i);
			for(j=0;j<s.length();j++){
				if(i == j){
					continue;
				}
				
				c2 = s.charAt(j);
				if(c1 == c2){
					System.out.println("String does not have all unique characters");
					return;
				}
			}
		}
		System.out.println("String has ALL unique characters");
		*/
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
