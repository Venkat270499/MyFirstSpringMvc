package com.nt.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrappingRainWater {
	
	public static void main(String[] args) {
		
		List<Integer> lst=new ArrayList();
		
		int arr[]= {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		int arr2[]=new int[arr.length];
		int count=0;
		int sum=0;
		for(int i:arr)
			arr2[count++]=i;
		
		Arrays.sort(arr2);
		int max_range=arr2[arr2.length-2];
		boolean build=false;
		
		
		for(int i=0;i<arr.length-1;i++) {
			//System.out.println(arr[i]+ " "+ arr[i+1]);
			
			if(arr[i]>arr[i+1]||build) {
				//System.out.println(arr[i]+ " "+max_range);
				if(arr[i]<max_range) {
					sum=sum+max_range-arr[i];
				}
				else {
					sum=sum+0;
				}
				build=true;
			}
			else {
				sum=sum+0;
			}
		}
		System.out.println(sum);
	}

}
