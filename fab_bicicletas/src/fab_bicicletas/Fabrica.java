package fab_bicicletas;

public class Fabrica {
	
	int numMarco;
	int numRueda;
	Object o;
	
	public Fabrica(){
		
		
	}
	
	//0-marco 1-ruedas
	public void montarBici(int id){
		
		synchronized(o){
			
			if(id==0){
				while (numMarco>3){
					try {
						o.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}}
				numMarco++;
			}
			else numRueda++;
			
		}
		
		
		
		
		
	}

	
	
	
}
