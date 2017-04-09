package crackingCodingInterview;
import java.util.HashMap;
import java.util.Map;

public class C1a4 {
	public static void ana_main(){
	
		String s1= "School MASTER";
		String s2= "The ClassROOM";
		boolean b= ana(s1,s2);
		if(b==true){
			System.out.println("are anagrams");
		}
		if(b==false){
			System.out.println("are not anagrams");
		}
	}
	public static boolean ana(String one,String two){
		Map<Character, Integer> map = new HashMap<>();
		
		for(char c: one.toCharArray())
			if(map.containsKey(c))
				map.put(c, map.get(c) + 1);
		
			else
				map.put(c, 1);
		
		for(char c: two.toCharArray())
			if(!map.containsKey(c))
				return false;
		
			else
			{
				map.put(c, map.get(c) - 1);
			
				if(map.get(c) == 0)
					map.remove(c);
			}
		
		return map.isEmpty();

	}
}
