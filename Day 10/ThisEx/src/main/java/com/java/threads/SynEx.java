package com.java.threads;

class Data{
	synchronized void disMsg(String name) {
		System.out.println("Hello "+name);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("How are you.. ");
	}
}

class Ash implements Runnable {
	
	Data data;
	Ash(Data data){
		this.data = data;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		data.disMsg("Ash");
		
	}
}

class Prasanna implements Runnable{
	
	Data data;
	Prasanna (Data data){
		this.data = data;
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		data.disMsg("Prasanna");
		
	}
}

class Venki implements Runnable{
	
	Data data;
	Venki (Data data){
		this.data = data;
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		data.disMsg("Venki");
		
	}
}

public class SynEx {
	
	public static void main(String[] args) {
		Data data = new Data();
		
		Ash ash = new Ash(data);
		Prasanna press = new Prasanna(data);
		Venki venks = new Venki(data);
		Thread t1 = new Thread(ash);
		Thread t2 = new Thread(press);
		Thread t3 = new Thread(venks);
		t1.start();t2.start();t3.start();
	}

}
