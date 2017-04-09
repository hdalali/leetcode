package crackingCodingInterview;

public class C1a8 {
	public static void issub_main(){
		
		boolean bi=issub("apple","ppale");
		if(bi == true){
			System.out.println("Yes rotated exist");
		}
		else
			System.out.println("No");
	}
	public static boolean issub(String s1,String s2){
		int len=s1.length();
		if(len==s2.length() && len>0){
			String s1s1 = s1+s1;
			
			boolean b=s1s1.contains(s2);
			return b;
		}
		return false;
	}
}
