package crackingCodingInterview;
import java.util.Scanner;

public class C1a2 {
public static void strrev_main(){
	/*
	System.out.println("Please enter the string to be reveresed");
	Scanner s = new Scanner(System.in);
	String st = s.next();
	String Res1=strirev(st);
	System.out.println("Reveresed string is "+ "'"+Res1+"'");
}
public static String strirev(String Strin){
	
	char[] res = new char[Strin.length()];
	for(int i=(Strin.length()-1);i>=0;i--){
		res[(Strin.length()-1)-i]=Strin.charAt(i);
	}
	String RevString= String.copyValueOf(res);
	return RevString;
	*/
    String input = "Harsha Irann";
    char[] temparray= input.toCharArray();
    int left,right=0;
    right=temparray.length-1;
    char temp;
    for (left=0; left < right ; left++ ,right--)
    {
     // Swap values of left and right 
     temp = temparray[left];
     temparray[left] = temparray[right];
     temparray[right]=temp;
    }
    /*
    String RevString= String.copyValueOf(temparray);
    System.out.println("Reveresed string is "+ "'"+RevString+"'");
    */
    System.out.println("Reveresed string is ");
    for (char c : temparray)
     System.out.print(c);
}

}
