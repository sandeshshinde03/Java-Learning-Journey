
public class MainDemo {

	public static void main(String[] args) {
		MyThread1 m1=new MyThread1();
		Thread t1=new Thread(m1);
		t1.start();
		
		MyThread2 m2= new MyThread2();
		Thread t2=new Thread(m2);
		t2.start();
	}

}
