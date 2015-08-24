package com.faiz.prog.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListProg {
    
    public static void main(String[] args) {
	LinkedList<String> dll = new LinkedList<>();
	dll.add("abc");
	dll.add("cab");
	dll.add("bac");
	dll.add("xyz");
	dll.add("abc");
	
	for(String str : dll)
	{
	    System.out.println(str);
	}
	
	Iterator<String> itr = dll.iterator();
	while (itr.hasNext())
	    System.out.println(itr.next());
	
	System.out.println(dll.lastIndexOf("abc"));
	
    }
    
//    ArrayList	LinkedList
//    1) ArrayList internally uses dynamic array to store the elements.	LinkedList internally uses doubly linked list to store the elements.
//    2) Manipulation with ArrayList is slow because it internally uses array. If any element is removed from the array, all the bits are shifted in memory.	Manipulation with LinkedList is faster than ArrayList because it uses doubly linked list so no bit shifting is required in memory.
//    3) ArrayList class can act as a list only because it implements List only.	LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
//    4) ArrayList is better for storing and accessing data.	LinkedList is better for manipulating data.

    
}
