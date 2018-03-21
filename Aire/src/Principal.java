import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aire air=new Aire();
//		List<Thread> atomos=new ArrayList<Thread> ();
//		int i=0;
		
		for (int i = 0; i < 30; i++) {
			
		
			
			Thread h, hh,o;
			
			h=new Thread (new Atomo(0,air));
			hh=new Thread (new Atomo(1,air));
			o=new Thread (new Atomo(0,air));
			
			h.start();
			hh.start();
			o.start();
			//i=i+3;
			
		}
	

	}

}
