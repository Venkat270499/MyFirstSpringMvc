package com.nt.practice;

public class MultiThreading extends Thread{

	@Override
	public void run() {
		for(int i=1;i<5; i++) {
			try {
			Thread.sleep(500);
			System.out.println(Thread.currentThread().getName()+" "+ Thread.currentThread().getPriority());
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws Exception{
		MultiThreading mt=new MultiThreading();
		MultiThreading mt2=new MultiThreading();
		mt2.setPriority(Thread.MIN_PRIORITY);
		mt.start();
	
		System.out.println(Thread.currentThread().getName());
		mt.setName("sai");
		
		//mt.join();
		mt2.setName("venkat");
		mt2.start();
		
		//mt2.join();
		//System.out.println(Thread.currentThread().getName());
		mt.setName("sai");
		mt2.setName("venkat");
		
	}
}
