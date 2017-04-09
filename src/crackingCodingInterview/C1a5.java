package crackingCodingInterview;

public class C1a5 {
	public static void rep_main(){
		String r=rep("Harsha Iranna Dalali");
		System.out.println(r);
		
	}
	public static String rep(String S){
		
		String re="";
		for(int i=0;i<S.length();i++){
			if(S.charAt(i)==' '){
				re=re+"%20";
				
			}
			else{
				re=re+S.charAt(i);
			}
		}
		
		return re;
	}
}
