import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class Fish extends Thread
{
	function f;

	public Fish(function f) {

		this.f = f;
	}

	public void run()
	{
		int i=0;
		while(true)
		{
			f.activity();
			try { Thread.sleep(1000);} catch(Exception e) {}
		}


	}
}



class function
{

	List<Integer> l = new ArrayList<Integer>(Arrays. asList(1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0));
	//	
	//	for(int i=0;i<10;i++)
	//	{
	//		l.add(0);
	//		l.add(1);
	//	}
	synchronized void activity()
	{

		Random r=new Random();

		int a=r.nextInt(l.size());
		int b=r.nextInt(l.size());
		System.out.println(a+" "+b);

		if(l.get(a)==0 && l.get(b)==0)
		{
			l.remove(a);
			l.remove(b);
			//System.out.println(l.size());



		}

		else if(l.get(a)==1 && l.get(b)==1)
		{
			l.remove(new Random().nextBoolean()?a:b);

		}
		else if(l.get(a)==0 && l.get(b)==1 || l.get(a)==1 && l.get(b)==0 )
		{
			int child1=r.nextInt(l.size());
			int child2=r.nextInt(l.size());
			l.add(l.get(child1));
			l.add(l.get(child2));



		}
		System.out.println(l + " "+ l.size());
	}


}
public class FishPond {

	public static void main(String[] args) throws Exception  {


		function func=new function();
		Fish f1=new Fish(func);
		f1.start();
		f1.join();
		Fish f2=new Fish(func);
		f2.start();
		f2.join();
		Fish f3=new Fish(func);
		f3.start();
		f3.join();
		Fish f4=new Fish(func);
		f4.start();
		f4.join();
		Fish f5=new Fish(func);
		f5.start();
		f5.join();
	}

}
