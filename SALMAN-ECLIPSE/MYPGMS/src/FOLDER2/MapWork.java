package FOLDER2;
/*
 * Map  - 
 * 		key value pair (two data add/del at a time)
 * 
 * 1.HashMap
 * 			 unique data only
 * 			 null accpet (both key and value)
 * 			 random  
 * 2.TreMap
 * 		 	 unique data only
 * 			 null not accpet key (but value accept)
 * 			 ascending
 * 3.Hashtable
 * 			 unique
 * 	         null not accept both key and value
 * 			  random
 * */

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class MapWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> hm=new HashMap<String,Integer>();
		hm.put("salman", 88);
		hm.put("gowthaman", 98);
		hm.put("raja", 78);
		hm.put("raja", 100);
		hm.put("raj", 58);
		hm.put(null, 58);
		hm.put(null, 58);
		hm.put(null, null); // null accept both key and value
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.get("raja"));
		System.out.println(hm.isEmpty());
		System.out.println(hm.remove("raja", 100));
		System.out.println(hm.replace("salman", 88, 99));
		System.out.println(hm);	
		
		
		
		TreeMap<String, Integer> tm=new TreeMap<String,Integer>();
		tm.put("salman", 88);
		tm.put("gowthaman", 98);
		tm.put("raja", 78);
		tm.put("raja", null); // value accept null but not key
		tm.put("raj", 345);
		System.out.println(tm);
		
		
		Hashtable<String, Integer> ht=new Hashtable<String,Integer>();
		ht.put("salman", 88);
		ht.put("gowthaman", 98);
		ht.put("raja", 78);
		//ht.put("raja", null);  // null not accept
		ht.put("raj", 345);
		System.out.println(ht);
		
		
		
		
	}

}
