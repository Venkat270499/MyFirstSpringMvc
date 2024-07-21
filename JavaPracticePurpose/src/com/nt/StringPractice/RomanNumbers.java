package com.nt.StringPractice;

public class RomanNumbers {

	public static void main(String[] args) {
		
		
		String s="XXIV";
		int len=s.length();
		int res=0;
		for(int i=0;i<len;i++) {
			char c=s.charAt(i);
			int s1=stringValue(c);
			if(i+1<len) {
			char c2=s.charAt(i+1);
			int s2=stringValue(c2);
			System.out.println(s1+" "+s2+" "+res);
			if(s1>=s2) {
				res=res+s1;
			}
			else {
				res=res+s2-s1;
			System.out.println(res+" "+s1+" "+s2);
			i++;
			}
		}
			
			else {
				res=res+s1;
			}
		}
		System.out.println(res);
	}
	
	public static int  stringValue(char c) {
		
		if(c=='I')
			return 1;
		else if(c=='V')
			return 5;
		else if(c=='X')
			return 10;
		else if(c=='L')
			return 50;
		else if(c=='C')
			return 100;
		else if(c=='D')
			return 500;
		else if(c=='M')
			return 1000;
		else
			return -1;
		
	}
}
