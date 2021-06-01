//NOTES: Refer Multi Threading Example
public class JoiningThreadsExample {
	static Thread th;
	static void ThreadFunc() {
		Runnable threadFunc = ()->{
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
					System.out.println(String.format("Thread Beep# %d" , i));
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		th = new Thread(threadFunc);
		th.setDaemon(true);//How to set a thread as Daemon thread?
		th.start();
	}
	public static void main(String[] args) throws Exception {
		ThreadFunc();
//		try{
//			th.join();
//		}catch(Exception ex) {
//			ex.printStackTrace();
//		}//This feature is done implicitly by the main function. Main waits for the threads to be completed before it closes.
		for(int i = 0; i < 5; i++) {
			System.out.println("Main Thread Beep #" + i);
			Thread.sleep(1000);
		}
		System.out.println("Main has completed the task");//When the main completes its operation, it will look for any USer threads to complete, however it will not wait for daemon threads. daemon threads are also called as background threads. 		
	}
}
