package com.java.threads;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Thr3 implements Runnable{
	@Override
	public void run() {
		
		LinkedList<String> names  = new LinkedList<String>();
		names.add("Subhash");
		names.add("Ash");
		names.add("Zoro");
		names.add("Kirito");
		
		for (String s : names) {
			System.out.println("LinkedList Data "+s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
		
	}



class Thr2 implements Runnable{
	@Override
	public void run() {
		
		SortedSet<String> names = new TreeSet<String>();
		names.add("Subhash");
		names.add("Ash");
		names.add("Zoro");
		names.add("Kirito");
		
		for (String s : names) {
			System.out.println("Treeset Data "+s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class Thr1 implements Runnable{
	@Override
	public void run() {
		List<String> names = new ArrayList<String>();
		names.add("Subhash");
		names.add("Ash");
		names.add("Zoro");
		names.add("Kirito");
		
		for (String s : names) {
			System.out.println("ArrayList Data "+s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class ThrEx2 {
	
	 public static void main(String[] args) {
		
		 Thread t1 = new Thread(new Thr1());
		 Thread t2 = new Thread(new Thr2());
		 Thread t3 = new Thread(new Thr3());
		 
		 t1.start();
		 t2.start();
		 try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 t3.start();
	}
	
	
	

}
