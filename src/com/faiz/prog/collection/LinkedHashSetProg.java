package com.faiz.prog.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetProg {
    //Java LinkedHashSet class:
    //
    //contains unique elements only like HashSet. It extends HashSet class and implements Set interface.
    //maintains insertion order.
    
    public static void main(String[] args) {
	Set<String> al=new LinkedHashSet<String>();  
	  al.add("Ravi");  
	  al.add("Vijay");  
	  al.add("Ravi");  
	  al.add("Ajay");  
	  
	  Iterator<String> itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }
    }
}
