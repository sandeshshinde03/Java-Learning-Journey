public class MyThread extends Thread{

	@Override
	public void run() {
		int i=1;
		while(i<=50) {
		System.out.println("My thread "+i);
		i++;
		}
	}
}
