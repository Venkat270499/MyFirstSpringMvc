package com.nt.StringPractice;

import java.util.Arrays;

public class K_GramNumbers {
	
	public static void main(String[] args) {
		String s="abcdefghijklmnopqrstuvwxyz";
		
		char c[]=new char[26];
		
		Arrays.fill(c, '-');
		int index=-1;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z') {
				index=s.charAt(i)-'A';
				c[index]=s.charAt(i);
			}
			else if(s.charAt(i)>='a'&& s.charAt(i)<='z') {
				index=s.charAt(i)-'a';
				c[index]=s.charAt(i);
			}
			
		}
		boolean temp=false;
		for(char k:c) {
			if(k=='-') {
				temp=false;
				break;
			}
			else
				temp=true;
			
		}
		System.out.println(temp);
		}
	}

