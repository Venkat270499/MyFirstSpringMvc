package com.nt.practice;

public class MinimumJumpsToReach {

	public static void main(String[] args) {
		int arr[]= {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		
		int MaxReach=arr[0];
		int step=arr[0];
		int jump=1;
		int first=0;
		int second=0;
		
		
		if(arr[0]==0)
			jump=-1;
		else if(arr.length==1&&arr[0]!=0)
			jump=1;
		else {
			int temp=0;
			for(int i=1;i<arr.length-1;i++) {
				
				MaxReach=Math.max(MaxReach, i+arr[i]);
				step--;
				if(step==0) {
					jump++;
					if(i>=MaxReach)
						jump=-1;
					step=MaxReach-i;
				}
				
			}
			
			System.out.println(jump);
		}
	}
}
