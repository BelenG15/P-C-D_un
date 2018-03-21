import java.util.concurrent.Semaphore;

public class Prueba1 extends Thread{
	
	Semaphore s;
	static int x=0;
	
	public Prueba1 (Semaphore _s){
		s=_s;
		}
	
	public void run(){
		
		try{
			s.acquire();
			}
		catch(Exception e){}
		x=x+1;
		s.release();
		System.out.println(x);
			
	}
	
	public static void main (String arg[]){
		
		Semaphore s= new Semaphore(1);
		Thread t1= new Prueba1(s);
		Thread t2=new Prueba1(s);
		t1.start();t2.start();
		
	}
	
	

}
