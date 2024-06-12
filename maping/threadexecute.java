package maping;

public class threadexecute {
	public static void main(String[] args)
	{
		mythread A1 = new mythread();
		System.out.println("Before runnable stage Thread is alive or not  "+A1.isAlive());
		A1.start();
		try
		{
			Thread.sleep(4000);
		}catch(Exception e)
		{
			System.out.println("Thread Exception");
		}
		System.out.println("Before runnable stage Thread is alive or not  "+A1.isAlive());
	}
}
