package com.faiz.prog.collection;

import java.util.*; 

class TreeSetProg{  
 public static void main(String args[]){
//     Java TreeSet class
//
//     contains unique elements only like HashSet. The TreeSet class implements NavigableSet interface that extends the SortedSet interface.
//     maintains ascending order.     
   
  TreeSet<String> al=new TreeSet<String>();  
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