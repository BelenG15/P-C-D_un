
public class Fumadores implements Runnable {

	//0-papel
	//1-tabaco
	//2-cerilla
	int id;
	Mesa m;
	
	
	
	
	public Fumadores(Mesa _m, int _id) {
		// TODO Auto-generated constructor stub
		m=_m;
		id=_id;
	}


	public void run(){
		for(int i=0;i<30;i++){
			m.fumar(id);}
	}
	
	
}
