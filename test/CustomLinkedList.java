package com.aurionpro.test;

import java.util.LinkedList;
import java.util.ListIterator;

public class CustomLinkedList {
	public static void main(String[] args) {
		LinkedList<String> names=new LinkedList<String>();
		names.add("Ani");
        names.add("ramdas");
        names.add("sid");
        names.addLast("Ajay");
        names.add("gokul");
        names.addFirst("Aniket");
        names.add( "KD");
      
       /* for (String x : names) {
        	System.out.print(x + " "); 
        }*/    
        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+"\n");
        }
    
        System.out.println("\nUpdating linked list : ");
        names.set(4, "Nikul");
        System.out.println(names);
        
        System.out.println(" deletion in linked list : \n ");
        names.remove("Kala");
        names.remove(3);
        names.removeFirst();
        names.removeLast();
        for (String x : names) {
        	System.out.print(x + " "); 
        }  
	}
}