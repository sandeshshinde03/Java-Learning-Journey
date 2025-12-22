public class MyThread2 extends Thread {
	
	

	@Override
	public void run() {
		int i=50;
		while(i<=100) {
		System.out.println("My thread "+i);
		i++;
		}
	}
}
