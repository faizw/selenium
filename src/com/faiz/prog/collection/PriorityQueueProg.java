package com.faiz.prog.collection;

import java.util.*;

public class PriorityQueueProg {
    
//    Java Queue Interface
//
//    The Queue interface basically orders the element in FIFO(First In First Out)manner.
//
//    Methods of Queue Interface :
//
//    public boolean add(object);
//    public boolean offer(object);
//    public remove();
//    public poll();
//    public element();
//    public peek();
    
    public static void main(String[] args) {
	PriorityQueue<String> queue=new PriorityQueue<String>();  
	queue.add("Amit");  
	queue.add("Vijay");  
	queue.add("Karan");  
	queue.add("Jai");  
	queue.add("Rahul");  
	  
	System.out.println("head:"+queue.element());  
	System.out.println("head:"+queue.peek());  
	  
	System.out.println("iterating the queue elements:");  
	Iterator itr=queue.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	  
	queue.remove();  
	queue.poll();  
	  
	System.out.println("after removing two elements:");  
	Iterator<String> itr2=queue.iterator();  
	while(itr2.hasNext()){  
	System.out.println(itr2.next());  

	}
    }
}
