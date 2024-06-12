package maping;

public class runnablemethod
{
    public static void main(String[] args)
    {
        Runnable obj1 = () ->
        {
            for(int i = 0; i < 5; i++)
            {
                System.out.println("print thread one");
                try
                {
                    Thread.sleep(500);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }; 

        Runnable obj2 = () ->
        {
            for(int i = 0; i < 5; i++)
            {
                System.out.println("print thread two");
                try
                {
                    Thread.sleep(1000);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }; 

        Thread t1 = new Thread(obj1); 
        Thread t2 = new Thread(obj2); 
        
        t1.start();
        t2.start();
    }
}
