package jav.fileio;

public class RunnableExample implements Runnable {
	
	public void run() {
		System.out.println("Thread running");
	}

	public static void main(String[] args) {
		
		RunnableExample m1 = new RunnableExample();
		Thread t1 = new Thread(m1);
		t1.start();
		
		for(int i = 0; i < 10; i++) {
			new Thread(m1).start();
		}

	}

}
