
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Enlace en= new Enlace();
		
			
			Emisor e1= new Emisor(1, en);
			Emisor e2= new Emisor(2, en);
			Emisor e3= new Emisor(3, en);
			Emisor e4= new Emisor(4, en);
			Emisor e5= new Emisor(5, en);
			Receptor r1= new Receptor(1, en);
			Receptor r2= new Receptor(2, en);
			Receptor r3= new Receptor(3, en);
			Receptor r4= new Receptor(4, en);
			Receptor r5= new Receptor(5, en);
			
			Thread thE1=new Thread(e1);
			Thread thE2=new Thread(e2);
			Thread thE3=new Thread(e3);
			Thread thE4=new Thread(e4);
			Thread thE5=new Thread(e5);
			Thread thR1=new Thread(r1);
			Thread thR2=new Thread(r2);
			Thread thR3=new Thread(r3);
			Thread thR4=new Thread(r4);
			Thread thR5=new Thread(r5);
			
		
			thE1.start();
			thE2.start();
			thE3.start();
			thE4.start();
			thE5.start();
			thR1.start();
			thR2.start();
			thR3.start();
			thR4.start();
			thR5.start();
			
		
		
		
	}

}
