import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Aire {

	Lock l;
	Condition nomol;
	Condition mol;
	int cont;
	int numH;
	int numO;


	Aire(){

		l= new ReentrantLock();
		nomol=l.newCondition();
		mol=l.newCondition();
		cont=0;
		numH=0;
		numO=0;
	}


	public void combinar(int id){
		l.lock();
		if (id==0){
			while(numO>0){
				System.out.println(id+" Esperando para formar parte de una mol");
				try {
					nomol.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			numO++;
		}
		if(id==1){
			while (numH>1){
				System.out.println(id+" Esperando para formar parte de una mol");
				try {
					nomol.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}
			numH++;
		}
		
		cont++;
		if(cont<3){
			System.out.println(id+" Esperando a compi-atomos");
			try {
				mol.await();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
		
		if(cont==3) {System.out.println(id+" Molecula formada!!");}
		
		System.out.println(id+" Saliendo!!");
		cont--;
		mol.signal();
		if(cont==0) {
			numO=0;
			numH=0;
			nomol.signal();
			
		}
		
			
		l.unlock();
	}


}


