package com.tcs.threads;
 
public class MyRunnable implements Runnable {
 
	@Override
	public void run() {
		for(int i=1;i<=5; i++) {
			System.out.println(Thread.currentThread().getName()+"is executing task @"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
 
}
