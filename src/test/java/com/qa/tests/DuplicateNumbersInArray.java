package com.qa.tests;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DuplicateNumbersInArray {

	public static void main(String[] args) {
		int [] arr={20,20,30,40,30,50,40,90,80,70};
		
		Set<Integer> set= new HashSet<Integer>();
		for(int i=0;i<arr.length;i++){
			set.add(arr[i]);
		}
		
		Iterator<Integer>it=set.iterator();
		while(it.hasNext()){
			System.out.println("The unique numbers in array ==>" + it.next());
		}
		
		Object[] obj= set.toArray();
		for(int i=0;i<obj.length;i++){
			int count=0;
			int a=(Integer) obj[i];
			for(int j=0;j<arr.length;i++){
				
					if(a==arr[j]){
						count++;
					
				}
			}
			System.out.println("The integer with repitition count is:" + a + " is ==> "+ count);
		}
	}

}
