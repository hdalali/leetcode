package prep1;
import java.util.*;

public class hmap {
	public static void hmap_main(){
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		
		  hmap.put(12, "Chaitanya");
	      hmap.put(2, "Rahul");
	      hmap.put(7, "Singh");
	      hmap.put(49, "Ajeet");
	      hmap.put(3, "Anuj");
	      
	      
	      Set s = hmap.entrySet();
	      Iterator ite = s.iterator();
	      while(ite.hasNext()){
	    	 
	    	  Map.Entry mentry = (Map.Entry)ite.next();
	    	  System.out.println("Key is: "+ mentry.getKey() + "\tValue is: "+ mentry.getValue() );
	      }
	      String var=hmap.get(2);
	      System.out.println("Value at index 2 is:"+var);
	      
	      hmap.remove(7);
	      System.out.println("After removal");
	      
	      Set s2 = hmap.entrySet();
	      Iterator ite2 = s2.iterator();
	      while(ite2.hasNext()){
	    	  Map.Entry mentry2 = (Map.Entry)ite2.next();
	    	  System.out.println("Key is: "+ mentry2.getKey() + "\tValue is: "+ mentry2.getValue() );  	  
	      }
	      hmap.remove(3);
	      System.out.println("After removal 2nd time");
	      Set s3= hmap.entrySet();
	      Iterator ite3=s3.iterator();
	      while(ite3.hasNext()){
	    	  Map.Entry mentry3 = (Map.Entry)ite3.next();
	    	  System.out.println("Keyy is:"+mentry3.getKey()+"\tValue is:"+mentry3.getValue());
	      }

		
	}
}
