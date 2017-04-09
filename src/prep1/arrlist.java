package prep1;
import java.util.*;

public class arrlist {
	public static void arrlis_main(){
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Apple");
		obj.add("Banana");
		obj.add("Orange");
		
		System.out.println("Currently the array list has following elements:"+obj);
			
		obj.add(0, "Sapota");
		obj.remove(2);
		
		System.out.println("Currently the array list has following elements:"+obj);
		System.out.println("Currently the array list has following elements:"+obj.get(1));
		
	}
}
