package com.nt.practice;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B implements Cloneable{
	
	B(){
		System.out.println("Bs Constructor");
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
		 //defining fields  
//		final int id;//field or data member or instance variable  
//		 String name; 
//		   B(int i){
//			 this.id=i;
//			 
//		 }
//		   public void m1() {
//			   System.out.println("m1 in TestJava");
//		   }
//		  void m2(B T){
//			  if(T instanceof C)
//			  C c=(C)T;
//		   }
//		 //creating main method inside the Student class  
		  public static void main(String[] args) throws Exception {
				
//				B t=new B();
//				B b=(B)t.clone()

//			   String s="mdcpeeek";
//				/*String s2=s.join("-", s.split(" "));
//				System.out.println(s2);*/
//			   Pattern pat=Pattern.compile("[aeiouAEIOU]");
//			   
//			  Matcher mat= pat.matcher(s);
//			  System.out.println(Pattern.matches(".*[k].*", s));
//			   System.out.println(mat.find());
//			  // System.out.println(s.contains("s"));
			   
			   //String str = new String("Welcome to JavaTpoint"); // statement - 1  
			   String str1 = new String("Welcome to JavaTpoint").intern();
			   //String str2 = new String("Welcome to JavaTpoint").intern();// statement - 2
			   String st="Welcome to JavaTpoint";
			   System.out.println(str1 == st); 
			   //System.out.println(str1==str2);
			   System.out.println();
			   
			   List<Integer> lst=List.of(1,2,3,4,5,5,6);
			   
			   lst.stream().forEach(a->{
				   if(a%2!=0)
					   System.out.println(a);
			   });
			}
		  
}

class C extends B{ 
	
	public void m1() {
		System.out.println("m1 in B");
	
	}
	
}
