
public class ClasePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		Letra A= new Letra('A');
		Letra B= new Letra('B');
		Letra C= new Letra('C');
		
		Thread ha=new Thread(A);
		Thread hb=new Thread(B);
		Thread hc=new Thread(C);
		ha.start();
		hb.start();
		hc.start();
		
	}

}
