package com.nt.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class RearrangingArray {
	
	public static void main(String[] args) {
		
		List<Integer> negs=new ArrayList<>();
		int negcount=0;
		int arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
		for(int i:arr) {
			if(i<0)
				negs.add(i);
		}
		
		List<Integer> pos=new ArrayList<>();
		for(int i:arr) {
			if(i>=0)
				pos.add(i);
		}
		List<Integer> result=new ArrayList<>();
		Set<ModelClass> st=new HashSet<>();
		
		st.addAll(List.of(new ModelClass(1,"venkat","male"),new ModelClass(2,"krishna","male"),new ModelClass(3,"Kiranmayi","female")));
		
		System.out.println(st.stream().map(a->a.getName()).collect(Collectors.toList()));
		
		//Collections.sort(pos,(a,b)->a.compareTo(b));
		//System.out.println(mdc);
		
//		for(String s:st)
//			System.out.println(s);
		
//		Iterator<Integer> itr=pos.iterator();
//		
//		result.add(2);
//		result.add(4);
//		result.add(1);
//		
//		System.out.println(pos.containsAll(result));
//		
//		
//		for(int i=0;i<arr.length;i++) {
//			if(i%2==0&&c1<negs.size())
//				result.add(negs.get(c1++));
//			else if(c2<pos.size())
//				result.add(pos.get(c2++));
//		}
//		
//				System.out.println(result);
		
	}
	

}
