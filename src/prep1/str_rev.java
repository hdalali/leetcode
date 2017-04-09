package prep1;
import java.util.Scanner;
public class str_rev {

	
	
	public static void str_main(){
		System.out.println("Enter the string,where u have to find the first non repating character");
		Scanner ip=new Scanner(System.in);
		String atr;
		atr = ip.next();
		int cnt=0;
		
		for(int a=0;a<atr.length();a++){
			cnt=0;
			for(int p=0;p<atr.length();p++){
				if(a == p){
				continue;	
				}
				if(atr.charAt(a) == atr.charAt(p)){
					++cnt;
					if(cnt==1){
						break;
					}
				}			
			}
			if(cnt==0){
				System.out.printf("First non repeating char is %c",atr.charAt(a));
				return;
			}
		}
		System.out.printf("All are repeating characters");
		return;
	}
}


