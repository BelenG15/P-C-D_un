
public class Atomo implements Runnable{

	//0=Oxigeno
	//1=Hidrogeno
	
	int id;
	Aire a;
	
	Atomo(int _id, Aire _a){
		id=_id;
		a=_a;
		
	}
	
	public void run() {
		// TODO Auto-generated method stub
		a.combinar(id);
	}
	
	

}
