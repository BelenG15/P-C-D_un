
public class Principal {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mesa m= new Mesa();
		Thread th0=new Thread(new Fumadores(m, 0));
		Thread th1=new Thread(new Fumadores(m, 1));
		Thread th2=new Thread(new Fumadores(m, 2));
		
		th0.start();
		th1.start();
		th2.start();
		
	}

}
