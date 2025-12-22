public class ThreadsFunctions extends Thread{
	
	@Override
	public void run() {
		int i=1;
		while(i<=50) {
			System.out.println("My thread "+i);
//			try {
//				sleep(100);
//				if(i==10) {
//					stop();
//				}
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			i++;
		}
		
//		System.out.println(getId());//getting id of thread
//		System.out.println(isAlive()); //checking thread is alive
//		setName("Faster Thread");  //setting name for thread
//		System.out.println(getName());// getting name of thread
//		System.out.println(getState());//life stage of that thread
//		System.out.println(getThreadGroup());
//		System.out.println(getClass());
//		System.out.println(toString());
//		System.out.println(hashCode());//memory location of thread
	}
	
	public static void main(String[] args) {
		ThreadsFunctions tf=new ThreadsFunctions();
		tf.start();
		
//		try {
//			tf.join(1000); 
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		MyThread2 m2=new MyThread2();
		m2.start();
		m2.setPriority(MAX_PRIORITY);//setting priority to thread max->10  normal->5[default]  min->1
	}
}
