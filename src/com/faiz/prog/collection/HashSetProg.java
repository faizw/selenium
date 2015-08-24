package com.faiz.prog.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetProg {
    
    public static void main(String[] args) {
	Set<Integer> set = new HashSet<Integer>();
	set.add(2);
	boolean result = set.add(2);
	System.out.println("Added 2 again : " + result);
	set.add(1);
	set.add(0);
	set.add(5);
	
	System.out.println("Size: " + set.size());
	Iterator<Integer> itr = set.iterator();
	while(itr.hasNext())
	    System.out.println(itr.next());
	
    }
    
//    Java HashSet class
//
//    uses hashtable to store the elements.It extends AbstractSet class and implements Set interface.
//    contains unique elements only.
//    Difference between List and Set:
//
//    List can contain duplicate elements whereas Set contains unique elements only.

}
