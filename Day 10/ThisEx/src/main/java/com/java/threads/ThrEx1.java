package com.java.threads;

import java.awt.Event;

class facts extends Thread{
	
	@Override
	public void run() {
		int f=1;
		for (int i=1; i<8;i++) {
			f = f*i;
			System.out.println("Factorial of "+i+" is "+f);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class even extends Thread {
	@Override
	public void run() {
		for (int i=0; i<20;i+=2) {
			System.out.println("Even "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


class odd extends Thread{
	@Override
	public void run() {
		for(int i = 1; i<20; i+=2) {
			System.out.println("Odd "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThrEx1 {
	
	public static void main(String[] args) {
		even ev = new even();
		odd o = new odd();
		facts fact = new facts();
		
		Thread t1 = new Thread(ev);
		Thread t2 = new Thread(o);
		Thread t3 = new Thread(fact);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
