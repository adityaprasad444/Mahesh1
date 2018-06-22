package com.qa.tests;

public class MissingNumInArray {

	public static void main(String[] args) {
		
		
		int [] arr={1,2,3,5,6,7,8,9};
		int sum=0;
		int sum2=0;
		for(int i=0;i<8;i++){
			 sum+=arr[i];			
		}
		for(int i=0;i<=9;i++){
			sum2+=i;
		}
		System.out.println("The missing number is: "+ (sum2-sum));
	}

}
