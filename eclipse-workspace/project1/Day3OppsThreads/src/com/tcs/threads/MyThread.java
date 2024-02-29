package com.tcs.threads;
 
public class MyThread extends Thread{
	String name;
	public MyThread(String name) {
		super();
		this.name=name;
	}public MyThread() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		for(int i=1;i<=5; i++) {
			System.out.println(name+"is executing task @"+i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
 
}