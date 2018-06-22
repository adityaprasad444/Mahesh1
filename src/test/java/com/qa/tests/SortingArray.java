package com.qa.tests;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		
		int[] arr= {30,10,40,50,2,90,1};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		int length=arr.length;
		System.out.println("The largest number is:"+ arr[length-1]);
		
	}

}
