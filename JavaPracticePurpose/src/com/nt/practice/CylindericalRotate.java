package com.nt.practice;

import java.util.LinkedList;

public class CylindericalRotate {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 5, 7, -1};
		int sum=0;
		
		LinkedList<Integer> lst=new LinkedList<>();
		for(int i:arr)
			lst.add(i);
		
		lst.add(0,lst.pollLast());
		
		System.out.println(lst);
		
	}
}
