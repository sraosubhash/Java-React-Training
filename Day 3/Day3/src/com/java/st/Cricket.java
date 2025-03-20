package com.java.st;

public class Cricket {
	
	static int score;
	static {
		score = 0;
	}
	
	public void incr(int x) {
		score+=x;
		
	}
	
	public static void main(String[] args) {
		Cricket fb = new Cricket();
		Cricket sb = new Cricket();
		Cricket ex = new Cricket();
		
		fb.incr(22);
		sb.incr(12);
		ex.incr(0);
		System.out.println("Total score "+Cricket.score);
	}

}
