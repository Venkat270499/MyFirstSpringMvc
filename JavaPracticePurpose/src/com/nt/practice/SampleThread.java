package com.nt.practice;

public class SampleThread {
	
	public static void main(String[] args) {
		K k=new K();
		Thread t1=new Thread(k);
		t1.start();
	}

}

class K implements Runnable{
	@Override
	public void run() {
		System.out.println("Thread got started");
	}
	
}
