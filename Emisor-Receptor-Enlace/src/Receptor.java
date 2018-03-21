public class Receptor implements Runnable {

	Enlace en;
	int id;
	public Receptor(int _id,Enlace _en){
		en=_en;
		id=_id;
	} 
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<20;i++)
		en.recibir(id);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
