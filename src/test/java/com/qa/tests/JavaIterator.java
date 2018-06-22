package com.qa.tests;
import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {

	
		   public static void main(String[] args)
		   {
		       
		       ArrayList<Integer> ar= new ArrayList<Integer>();
		       for (int i = 0; i < 10; i++)
		           ar.add(i);
		       System.out.println(ar);
		       Iterator<Integer> itr = ar.iterator();
		       while (itr.hasNext())
		       {
		           int i = itr.next();
		                       System.out.print(i + " ");
		           if (i % 2 != 0)
		              itr.remove();
		       }
		       System.out.println();
		       System.out.println(ar);
		   }
		
	}


