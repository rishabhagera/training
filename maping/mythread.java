package maping;

public class mythread extends Thread {
	
	public void run()
	{
		System.out.println("Inside run() thread is alive or not   "+this.isAlive());
		int no=0;
		while(no<4)
		{
			no++;
			System.out.println("number "+no);
			try
			{
				sleep(500);
			}
			catch(Exception e)
			{
				System.out.println("thread Exception");
			}
		}
		}
	
	}
