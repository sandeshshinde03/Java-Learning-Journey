public class MainThreadDemo {

	public static void main(String[] args) {
		
		MyThread m1=new MyThread();//new
		m1.start();//runnable
		
		MyThread2 m2=new MyThread2();//new
		m2.start();//runnable

	}

}
