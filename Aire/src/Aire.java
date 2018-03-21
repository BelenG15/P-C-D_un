
public class Aire {

	int numH, numO,cont;
	Object nomol, mol;
	

	Aire(){
		numH=0;
		numO=0;
		cont=0;
		nomol=new Object();
		mol=new Object();
		
	}

	public void combinar(int id){

		synchronized(nomol) {
			if(id==0){
				while(numO>0){
					try {
						System.out.println(id+" bloqueado en nomol");
						nomol.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}}
				numO++;
			}
			else{
				while(numH>1){
					try {
						System.out.println(id+" bloqueado en nomol");
						nomol.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}}
				numH++;

			}
		}

		synchronized (mol) {
			cont++;
			if(cont<3 ){
				try {
					System.out.println(id+" bloqueado en mol");
					//nomol.notifyAll();
					mol.wait();

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			
			if(cont==3)	System.out.println(id+" Molecula Formada");
		
			mol.notifyAll();
			cont--;
			
			if(cont==0){
				numO=0;
				numH=0;
				
				synchronized (nomol) {
					nomol.notifyAll();
				}

			}


		}	









	}




}




