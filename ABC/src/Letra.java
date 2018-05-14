
public class Letra implements Runnable {

	//Object o;
	
	static Turno tr=new Turno();
	char letra;
	
	Letra(char _l){
		letra=_l;
		
		
		
	}
	public void run(){
		for (int i=0;i<100;i++){
			synchronized(tr){
							
				while (letra!=tr.getT()){
					try {
						tr.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(letra);
				if(letra=='A') tr.setT('B');
				else if(letra=='B') tr.setT('C');
				else tr.setT('A');
				tr.notifyAll();
			}
				
			
				
		}
				
			}
		
	}
	

