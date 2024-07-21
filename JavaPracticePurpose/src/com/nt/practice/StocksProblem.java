package com.nt.practice;

import java.util.ArrayList;
import java.util.List;

public class StocksProblem {
	
	public static void main(String[] args) {
		int arr[]= {10, 4, 5, 90, 120, 80 };
		
		List<Integer> lst=new ArrayList<>();
		
		int count=1;
		
		
		for(int i=0;i<arr.length;i++) {
			if(i==0)
				lst.add(1);
			
			else {
				for(int j=i-1;j>=0;j--) {
					if(arr[i]>arr[j]) {
						count++;						
					}
					else
						break;
				}
				lst.add(count);
				count=1;
			}
		}
		System.out.println(lst);
	}

}
