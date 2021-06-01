/*
 * Topics:
 * What is Multi Threading?
 * Multi Threading vs. Multi-Tasking
 * Thread life cycle in Java
 * How to create threads in Java?
 * How to handle data synchronization using Threads?
 * 
 * NOTES: 
 * Any app can have threads which is path of execution. Each App instance will execute at least one such path, thread. Thread is nothing but a path of execution within UR Application. 
 * If UR Application executes as a single path, it is called as SINGLE THREADED Application. In this case, UR App will run on one thread only where UR functions will be executed in a sequence one after the other. Even if any one of the functions take a long time to execute, it will still do so in an ordered manner. Most of the Apps in real time are fine with Single threaded environments. 
 * 
 * What is a Single thread?
 * A Single thread is a light weight unit of process or UR Application. It is said to be the smallest unit of UR App process. It is the execution path of UR program. 
 * In Java, a Thread is represented by a class called "Thread". There are 2 types of threads: User Threads, daemon threads(threads that run on background) GC is a daemon thread that runs behind the scenes while UR App is executing. 
 * When an app first executes, a user thread will be created and is associated with a function(Main Function). However, post this operation, programmers can create as many no of threads they want for their requirements. Once the user thread completes its operations, it terminates and ends the application.  
 * It has no overhead(no extra work related to execution) in the application as it goes smoothly and will have only one path of execution and no confusion, easy for debugging and maintenance too.  
 * Problems of Single Threaded Code: Some functions or tasks might take a lot of time and might occupy a resource and will allow other part of the app to access it. This might make the other functions that are called after this function to wait and might make the user feel that the application has stopped. 
 * Solution: So we could create a new path of execution that might do another task without interfering with the old path of execution. This is done by creating new Threads in UR code. Such apps are called as Multi Threaded Apps. 
 * Advantages of Multi Threads: Users are not blocked because the threads are independent and can perform multiple tasks simultaneously. Even if any of the threads have created problems(Raising an Exception), it wont affect the other threads.  
 *  In Java U can create thread by implementing an interface called Runnable. U can also create new Threads by extending the Thread class. 
 *  If a small task is to be performed as a new thread, then U can go for implementing Runnable interface, as this interface has only one method, U can implement the method using lambda Expression or anonymous method and complete the task. 
 *  For large size tasks, we recommend to extend the Thread class, override the method called RUN and implement the logic as per the requirement. 
 * start: start is a function in the Thread class used to start the execution of the thread and internally JVM will call the run function of that thread to make the thread begin its work...
 * */
///////////////////////Extending the Thread Class and creating Threads////////////////////////////////////
class URClass extends Thread{
	//If U extend a class, U should override the run function which defines the functionality of the Thread that U Create. 
	@Override
	 public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("File reading is going on a separate Thread!!!");	
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////
public class MultiThreadingExample {
	
	//Simulation(Imitation) of performing a very large task..
	static void readLargeCode() throws Exception {
		for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);//Function that will delay UR execution by a sec.....
				System.out.println("File reading is going on in the Main function!!!");			
		}
	}
	
	static void usingThreadClass() {
		URClass cls = new URClass();//Create the instance of the class U have extended. 
		cls.start();//Starts the thread...
	}
	
	//This function will create a Thread using RUNNABE INTERFACE.
	static void usingLambdaExpression() {
		Runnable method = () ->{
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);//Function that will delay UR execution by a sec.....
					System.out.println("File reading is going on in the Lambda function!!!");		
				}catch(InterruptedException ex) {
					ex.printStackTrace();
				}
			}
		};
		Thread newThread  = new Thread(method);
		newThread.start();//Make the JVM to internally call the run function of the interface and invoke it parallelly..
	}
	
	public static void main(String[] args) throws Exception {
		usingThreadClass();//Run on seperate thread
		usingLambdaExpression();//Runs on separate thread
		readLargeCode();//THis is running on the Main thread
		System.out.println("This will run after the function is completed");
	}
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
PTR:
 * Do not call the run function from UR Thread class directly. run function is not invoked thru a Thread, rather it will be called by the creating thread. So no asynchronous(occurring at the same time) operation will happen. So a thread function will behave async only thru a thread object and with which U call the start method. start method will make the JVM invoke Ur function in an asynchronous manner. 
 * join method is a function in thread programming that makes a function wait for a thread to die. It causes the current executing thread to stop executing until the thread it joins completes its tasks. 
 * Daemon Threads are threads that are executed similar to normal threads but the function that created this thread will not wait for it to complete its operation. 
 * User threads(Normal Threads) will make the function that has created them to wait till it completes its operations whereas the daemon threads don't have that mechanism. In this case, if the function completes its operation and closes, the daemon thread will also get terminated even if it has not completed its task. 
 * Thread pools can be used when U want to do small tasks in UR program without a need of a new thread creation by yourself. Java thread Pool is a group of daemon threads that are created by Java Runtime to manage itself. As programmers U could use these threads instead of creating new ones. In case of thread Pool, a group of threads of a fixed size is created. A thread from that group could be utilized by the programmers and assign a task to it. Once the task is completed, the thread joins the thread pool again. Advantage is that U don't have to create new threads and it is a better performance. 
 * If U want multiple threads to be controlled as a group, then U create ThreadGroups. It is a convenient way of controlling multiple threads with single call when U want to suspend, resume or interrupt these threads. 
 * suspend is similar to sleep but will wait indefinitely till U call resume. Now suspend, resume and stop are deprecated.  
 *********************************************************************************************************************/











