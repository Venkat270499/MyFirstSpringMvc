package com.nt.practice;

import java.util.Arrays;

public class MaxContiniousNumbers {

	
	
	public static void main(String[] args) {
		int arr[]={1, 9, 3, 10, 4, 20, 2};
		Arrays.sort(arr);
		int count=1;
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			if(i>0&&arr[i]==arr[i-1]+1) {
				count++;
			}
			else if(temp<count) {
				System.out.println("count "+count);
				temp=count;
				count=1;
			}
		}
		System.out.println(temp);
		
		for(int i:arr)
			System.out.print(i+" ");
	}
	
}
