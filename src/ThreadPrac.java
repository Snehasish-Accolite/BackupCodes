
public class ThreadPrac implements Runnable {
	public void run()
	{
		for(int i=1;i<5;i++)  
        {    
            try 
            {  
                Thread.sleep(500);  
            }catch(InterruptedException e){System.out.println(e);}    
            System.out.println(i);    
        }    
	}

	public static void main(String[] args) {
		
		ThreadPrac t1= new ThreadPrac();
		Thread mythread= new Thread(t1);
		mythread.start();
		
		try {
			mythread.join();
		}
		catch(Exception e){System.out.println(e);}
		Thread mythread2= new Thread(t1);
		mythread2.start();
		Thread mythread3= new Thread(t1);
		mythread3.start();
	
		
		
	}

}
