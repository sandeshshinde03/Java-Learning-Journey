public class MyThread2 implements Runnable{

	@Override
	public void run() {
		int i=50;
		while(i<=100) {
		System.out.println("My thread "+i);
		i++;
		}
	}

}
