package com.nt.practice;

public class ContigiousSumSubArray {

	
	
	
	public static void main(String[] args) {
		int sum=0;
		int temp=0;
		int arr[]= {6, -3, -10, 0, 2};
		for(int i=0;i<arr.length;i++) {
			sum=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				sum*=arr[j];
				if(sum>temp) {
					temp=sum;
				}
			}
			if(arr[i]>temp)
				temp=sum;
			sum=0;
		}
		
		System.out.println(temp);
		
		
	}
}
