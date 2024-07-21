package com.nt.StringPractice;

import java.util.HashMap;
import java.util.Map;

public class EncryptedString {
	
	
	
	public static void main(String[] args) {
		
		String s="abc";
		String ans="";
		//StringBuilder ans=new StringBuilder();
		Map<Character, Object> mp= new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			if(!mp.containsKey(s.charAt(i))) {
				mp.put(s.charAt(i), 1);
			}
			else {
				mp.put(s.charAt(i), (Integer)mp.get(s.charAt(i))+1);
			}
		}
		
		
		
		
		for(Map.Entry<Character, Object> m:mp.entrySet()) {
					
			String l=(Integer)m.getValue()>9?convertIntString((Integer)m.getValue()):m.getValue().toString();
			    ans=ans+m.getKey()+l;
		}
		StringBuilder ans2=new StringBuilder(ans);
		System.out.println(ans2.reverse());
	}
	
	public static String convertIntString(int k) {
		if(k==10)
			return "a";
		else if(k==11)
			return "b";
		else if(k==12)
			return "c";
		else if(k==13)
			return "d";
		else if(k==14)
			return "e";
		else if(k==15)
			return "f";
		else
			return "";
	}
}
