package FOLDER2;
/*
 *  Deque --> 1. ArrayDeque
 *  (we can add/del both end)
 *  null not accept.
 *  duplicate allow
 */

import java.util.ArrayDeque;
//import java.lang.Thread;

public class dequeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  	
        ArrayDeque<Integer> ad=new ArrayDeque<Integer>();
        ad.add(44);
        ad.add(4);
        
        //ad.add(null);
        //ad.add(null);
        ad.add(7);
        ad.add(4);
        ad.add(7);
        System.out.println(ad);
        
        ad.addFirst(100);
        ad.addLast(500);
        System.out.println(ad);
        ad.removeFirst();
        ad.removeLast();
        System.out.println(ad);
        System.out.println(ad.contains(4));
        System.out.println(ad.isEmpty());
        System.out.println(ad.size());
        System.out.println(ad.remove(4));  // first 4 delete. left to right
        System.out.println(ad);        
	}
}
