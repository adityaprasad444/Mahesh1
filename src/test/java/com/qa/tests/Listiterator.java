package com.qa.tests;

import java.util.ArrayList;
import java.util.ListIterator;


//This is only applicable where there is List implemented classes such as ArrayList, 
//linked list etc. It provides the user to give bi-directional iteration,
//it is used when we want to enumerate the list, it has more functionality.

public class Listiterator {

	public static void main(String[] args) {
		ArrayList<Integer> ar= new ArrayList<Integer>();
	       for (int i = 0; i < 10; i++)
	           ar.add(i);
	       System.out.println(ar);
	      ListIterator<Integer> LI= ar.listIterator();
	      while(LI.hasNext()){
	    	 int i= LI.next();
	    	 if(i%2==0){
	    		 i++;
	    		 LI.set(i);
	    		 LI.add(i);
	    		 
	    	 }
	    	 
	      }
	      System.out.println(ar);
	}

}
