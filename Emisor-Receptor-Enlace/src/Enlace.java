
public class Enlace {

	int total;
	int cap=3;
	
	//static Object o=new Object();
	

	
	
	synchronized public void enviar(int id){
		
		//synchronized (o) {
			
			while(total==cap){
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Esperando enviar "+ id);
			}
			System.out.println("Enviado por "+ id);
			total++;
			this.notifyAll();
			
			
		//}
		
	}
	
	synchronized public void  recibir(int id){
		
//		synchronized (o) {
			
			while(total==0){
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Esperando recibir "+ id);
			}
			
			System.out.println("Recibido en "+id);
			total--;
			this.notifyAll();
			
		//}
		
		
	}
	
}
