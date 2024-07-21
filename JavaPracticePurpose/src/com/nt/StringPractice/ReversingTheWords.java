package com.nt.StringPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReversingTheWords {

	public static void main(String[] args) {
		String s="I LOVE U";
		String s2="";
		
		String str[]={"geeksforgeeks", "geeks", "geek", "geeks"};
		
		Arrays.sort(str);
		for(String z:str) {
			System.out.println(z);
		}
		int size=str.length;
		
		int end=Math.min(str[0].length(), str[size].length());
		int i=0;
		String pre="";
		while(i<end) {
			
			if(str[0].charAt(i)==str[size-1].charAt(i)) {
				pre+=str[0].charAt(i);
			}
			else
				break;
			
			i++;
		}
		System.out.println(pre);
		
//		String []str=s.split(" ");
//		
		//List<String> lst=new ArrayList<>();
		
		//System.out.println(lst);
		
//		for(int i=lst.size()-1;i>=0;i--) {
//			System.out.print(lst.get(i)+ " ");
//		}
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)!=' ') {
//				s2+=s.charAt(i);
//			}
//			else {
//				lst.add(s2);
//				s2=" ";
//			}
//		}
		//lst.add(s2);
		//System.out.println(lst);
		
	}
}
