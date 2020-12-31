package FOLDER2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/*
 * 1. ordered item
 * 2. duplicate allow
 * 3. null many times
 * 
 * 
 * List: 1.ArrayList 2.Linkedlist 3.Vector
 * 
 * */

public class ListWork {
	public static void main(String[] args) {

		/*
		ArrayList<Integer> al=new ArrayList<Integer>();	//allow mutliple thread
		al.add(44);
		al.add(4);
		al.add(4);
		al.add(4);		
		al.add(1);
		al.add(6);
		al.add(null);
		al.add(74);
		al.add(null);		
		System.out.println(al);		
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.remove(4)); // 4th index
		System.out.println(al);
		System.out.println(al.contains(4));
		*/
		/*
		LinkedList<Integer> ll=new LinkedList<Integer>();		
		ll.add(44);
		ll.add(4);
		ll.add(4);
		ll.add(4);		
		ll.add(1);
		ll.add(6);
		ll.add(null);
		ll.add(74);
		ll.add(null);		
		ll.addFirst(100);
		ll.addLast(300);
		System.out.println(ll);
		ll.add(9,3);		
		System.out.println(ll);		
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.remove(4)); // 4th index
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		System.out.println(ll.contains(4));
		*/
		Vector<Integer> v=new Vector<Integer>();  // thread safe (run only one thread at a time)
		v.add(55);
		v.add(44);
		v.add(88);
		v.add(null);
		v.add(null);
		v.add(null);
		v.add(1);
		v.add(1);
		v.add(1);
		
		System.out.println(v);
		v.remove(4);
		System.out.println(v);
		System.out.println(v.capacity());		
	}
}
