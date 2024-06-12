package maping;

public class ThreadMethodDemo {
	public static void main(String[] args)
	{
		ThreadClass t1 = new ThreadClass(5,"First");
		ThreadClass t2 = new ThreadClass(8,"Second");
	
		System.out.println("Current thread"+Thread.currentThread());

		t1.start();
		t2.start();
		
		Thread.currentThread().setName("Parent thread");
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
	
		try
		{
			t1.join();
			t2.join();
		}
		catch(Exception e)
		{
			System.out.println("thread exception");
		}
		System.out.println("----end task-----");
	}

}
