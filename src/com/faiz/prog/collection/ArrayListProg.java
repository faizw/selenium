package com.faiz.prog.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProg {
    
    /**
     * @param args
     */
    public static void main(String args[])
    {
	ArrayList<String> al = new ArrayList<String>();
	al.add("faiz");
	al.add("alam");
	al.add(0, "md");
	al.add("rourkela");
	
	System.out.println("Listing all item in Array list");
	Iterator<String>  itr = al.iterator();
	while (itr.hasNext()) {
	    String ale = itr.next();
	    System.out.println(ale);
	}
	
	al.remove("rourkela");
	
	itr = al.iterator();
	
	System.out.println();
	System.out.println("After removal");
	while (itr.hasNext())
	{
	    System.out.println(itr.next());
	}
	System.out.println();
	System.out.println("Array list contains faiz :: " + al.contains("faiz"));
	System.out.println("Array list contains Faiz :: " + al.contains("Faiz"));
	System.out.println("3rd Element in Array List ::" + al.get(2));
	
	System.out.println();
	System.out.println("Now iterating using for loop");
	for(String ele : al)
	    System.out.println(ele);
	
	
	Student st1 = new Student(1, "Fuzail");
	Student st2 = new Student(2, "Zahra");
	Student st3 = new Student(3, "Heba");
	
	ArrayList<Student> studentList = new ArrayList<Student>();
	studentList.add(st1);
	studentList.add(st2);
	studentList.add(st3);
	
	System.out.println("Student ArrayList");
	for(Student st: studentList)
	{
	    System.out.println("Roll: "+ st.roll);
	    System.out.println("Name: "+ st.name);
	}
	
	System.out.println("Student ArrayList using iteration");
	Iterator<Student> sItr = studentList.iterator();
	while (sItr.hasNext()) {
	    Student student = (Student) sItr.next();
	    System.out.println(student.name);
	    System.out.println(student.roll);
	    
	}
//	others
//	removeAll, addAll, retainAll --
	
	    
	
    }

}