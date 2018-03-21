import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Mesa {

	Lock l;
	Condition papel;
	Condition tabaco;
	Condition cerilla;
	
	int ing1;
	int ing2;
	
	
	
	public Mesa(){
		
		l= new ReentrantLock();
		papel=l.newCondition();
		tabaco=l.newCondition();
		cerilla=l.newCondition();
		
		ing1=(int) (Math.random() * 3);
		ing2=(int) (Math.random() * 3);
		while(ing1==ing2){ing2=(int) (Math.random() * 3);}
		
	}
	
	
	
	public void ponerIngrediente(){
		
		ing1=(int) (Math.random() * 3);
		ing2=(int) (Math.random() * 3);
		while(ing1==ing2){ing2=(int) (Math.random() * 3);}
		
		if(ing1==0 && ing2==1) cerilla.signal();
		if(ing1==1 && ing2==2) papel.signal();
		if(ing1==2 && ing2==0) tabaco.signal();
		
	}
	
	public void fumar(int id){
		
		l.lock();
		while(ing1==id || ing2==id){
			if(id==0){
				try {
					papel.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}
			
			else if(id==1){
				try {
					tabaco.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}
			else{
				try {
					cerilla.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}
		}
		System.out.println(ing1+" + "+ ing2+ ", esta fumando "+ id);
		ponerIngrediente();
		l.unlock();
		
		
		
		
	}
	
	
}
