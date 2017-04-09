package crackingCodingInterview;

public class C1a3 {
public static void dup_main(){
	String st="aaccaaddee";
	String res = dup(st);
	System.out.println("My op string is:"+ "'"+res+"'");
}
public static String dup(String data){
	/*
	 char[] str=stri.toCharArray();
	
	if (str == null) return null;
	int len = str.length;
	if (len < 2) return null;

	int tail = 1;

	for (int i = 1; i < len; ++i) {
	int j;
	for (j = 0; j < tail; ++j) {
	if (str[i] == str[j]) break;
	}
	if (j == tail) {
	str[tail] = str[i];
	++tail;
	}
	}
	str[tail] = 0;
	String opst = String.copyValueOf(str);
	return opst;
	*/
	  String rs="";
	   for(char a:data.toCharArray()){
	       if(!rs.contains(""+a)){
	          rs+=a;
	       }
	   }
	   return rs;
}
}
