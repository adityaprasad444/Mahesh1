package com.qa.tests;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEnumeration {

	public static void main(String[] args) {
		Vector v= new Vector();
		for(int i=0;i<10;i++)
			v.addElement(i);
			System.out.println(v);
			Enumeration e= v.elements();
			
		
		while(e.hasMoreElements()){
			System.out.print(e.nextElement());
		}
	}

}
