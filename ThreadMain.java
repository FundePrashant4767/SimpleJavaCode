package com.jspiders.multithreading.threads;

public class MyThread1 extends Thread{
@Override
public void run() {
	for(int i=1;i<=5;i++){
	System.out.println("Name of Thread:"+this.getName());
	System.out.println("Priority of Thread:"+getPriority());
	}
}
}
//------------------------------------------------------------------------------------------------------------------
//package com.jspiders.multithreading.threads;

public class MyThread2 implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("Name of Thread :"+Thread.currentThread().getName());
		System.out.println("Priority of Thread:"+Thread.currentThread().getPriority());
		}
	}
}
//-------------------------------------------------------------------------------------------------------------------------------------
/* package com.jspiders.multithreading.main;

import com.jspiders.multithreading.threads.MyThread1;
import com.jspiders.multithreading.threads.MyThread2;
 -->*/
 class ThreadMain {
public static void main(String[] args) {
	MyThread1 myThread1=new MyThread1();
	myThread1.setName("Thread-1");
	myThread1.setPriority(9);
	MyThread2 myThread2=new MyThread2();
	Thread thread=new Thread(myThread2);
	thread.setName("Thread-2");
	thread.setPriority(10);
	myThread1.start();
	thread.start();
	
}
}
/*-----------------------OUTPUT------------------------------------------------------------------------------
Name of Thread:Thread-1
Name of Thread :Thread-2
Priority of Thread:9
Priority of Thread:10
Name of Thread :Thread-2
Name of Thread:Thread-1
Priority of Thread:10
Name of Thread :Thread-2
Priority of Thread:10
Name of Thread :Thread-2
Priority of Thread:10
Name of Thread :Thread-2
Priority of Thread:10
Priority of Thread:9
Name of Thread:Thread-1
Priority of Thread:9
Name of Thread:Thread-1
Priority of Thread:9
Name of Thread:Thread-1
Priority of Thread:9*/
