package FOLDER2;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
public class CollectionPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*HashSet<String> hs=new HashSet<String>();     //<> angular bracket
		
		hs.add("salman");
		hs.add("gowthaman");
		hs.add("raja");hs.add("raja");hs.add(null);hs.add(null);
		hs.add("gowthaman");
		hs.add("salman");
		
		System.out.println(hs);
		*/
				
		HashSet<Integer> hs1=new HashSet<Integer>();     //<> angular bracket
		hs1.add(45);
		hs1.add(6);
		hs1.add(67);
		hs1.add(57);
		hs1.add(1);
		hs1.add(67);
		hs1.add(null);
		System.out.println(hs1);
		int len=hs1.size();
		System.out.println("Total size  :"+len);		
        System.out.println(hs1.isEmpty());
        System.out.println(hs1.remove(67));		
		System.out.println(hs1);
	
		
/* 		for(Integer i :hs1)
		{
			System.out.println(i);
		}
 		for(Integer i :hs1)
		{
			System.out.println(i);
		}*/ 		
	/*	
 				
 		Iterator<Integer> k=	hs1.iterator();		
 		while(k.hasNext()==true)
			{
				System.out.println(k.next());
			}
	
 		while(k.hasNext()==true)
			{
				System.out.println(k.next());
			}
	*/		
		Iterator<Integer> k=	hs1.iterator();		  // only forward dir
		System.out.println(k.next());
		System.out.println(k.next());
		System.out.println(k.next());		
		
		
		int a[]= {11,11,11,34,45,56,11,1,34};
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(44);
		ts.add(44);
		ts.add(44);
		ts.add(44);
		ts.add(44);
		ts.add(1);
		ts.add(5);
		ts.add(3);
	//	ts.add(null);
		
		System.out.println(ts);	
		
		
		
	}

}
