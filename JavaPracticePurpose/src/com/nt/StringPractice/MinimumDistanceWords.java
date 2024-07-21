package com.nt.StringPractice;

public class MinimumDistanceWords {
	
	
	
	public static void main(String[] args) {
		String arr[]= {"the", "quick", "brown", "fox", "quick"};
		String word1="the";
		String word2="fox";
		String x="Venkat";
		int ans=Integer.MAX_VALUE;
		int d1=-1; 
		int d2=-1;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i].equals(word1))
				d1=i;
			if(arr[i].equals(word2))
				d2=i;
			if(d1!=-1&&d2!=-1)
				ans=Math.min(ans,Math.abs(d1-d2));
		}
		//System.out.println(ans);
		
		System.out.println(x.substring(3,5));
		
		
		
		
		
				
		
	}

}

