class MultiThreading extends Thread
{
	@Override
	public void start(){
		for(int i=1;i<=5;i++){
		System.out.println("Thread 1 is now running.....!!!");
	}
	}

	public static void main(String[] args) 
	{
		MultiThreading m1=new MultiThreading();
		m1.start();
	}
}
