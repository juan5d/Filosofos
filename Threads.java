/**
 *
 * @author Juan David Zapata Y Andres Barragan
 */
public class Threads extends Thread {

	private String nombre,estado1="Pensando",estado2="Comiendo",estado3="Esperando",estado4="Satisfecho"
                ,Etenedor1="suelto",Etenedor2="ocupado", p;
        private String[][] arreglo=new String[5][3];
	private Filosofo filosofo;
        public int [][] elementos;
        int imp;
        

	private long initialTime;

        
	public Threads() {
	}

	public Threads(String nombre, Filosofo filosofo, long initialTime, int imp) {
		this.nombre = nombre;
		this.filosofo = filosofo;
		this.initialTime = initialTime;
                this.imp=imp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getInitialTime() {
		return initialTime;
	}

	public void setInitialTime(long initialTime) {
		this.initialTime = initialTime;
	}

	public Filosofo getCliente() {
		return filosofo;
	}

	public void setCliente(Filosofo cliente) {
		this.filosofo = cliente;
	}

	@Override
	public void run() {   
      
        
		for (int i = 0; i < this.filosofo.getTiempo().length; i++) {
			// Se procesa el pedido en X segundos
                    
                            String[][] estado = null;
                    
			this.esperarXsegundos(filosofo.getTiempo()[i]);
                        
		llenar();
               

                estado(imp);     
                for (int m = 0; m < 5;m++){
                         
                    System.out.println(" Filosofo" + arreglo[m][0] + " esta  " 
						+ arreglo[m][1]); 
                    
                        
                            
                }System.out.print("\n");
                }
                
                
		System.out.println(this.filosofo.getFilosofo() + " Esta: Satisfecho a los " 
						+ (System.currentTimeMillis() - this.initialTime) / 1000 
						+ "seg");
	}

	private void esperarXsegundos(int segundos) {
            
		try {
			Threads.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Threads.currentThread().interrupt();
		}
	}
        
        public void llenar(){
             for (int n = 0; n < 5;n++){
                arreglo[n][0]=String.valueOf(n+1);
                arreglo[n][1]=estado1;
                arreglo[n][2]=Etenedor1;
    
            }
        }
   
        
        public String[][] estado(int w){
try {
    int []arregloFilosofo=new int[5];
        
        
    if(w==0){
    
    arregloFilosofo[0]=0;
    arregloFilosofo[1]=1;
    arregloFilosofo[2]=2;
    arregloFilosofo[3]=3;
    arregloFilosofo[0]=4;
    }
    if(w==1){
    arregloFilosofo[0]=1;
    arregloFilosofo[1]=0;
    arregloFilosofo[2]=2;
    arregloFilosofo[3]=3;
    arregloFilosofo[0]=4;
    }
    if(w==2){
    arregloFilosofo[0]=1;
    arregloFilosofo[1]=2;
    arregloFilosofo[2]=3;
    arregloFilosofo[3]=4;
    arregloFilosofo[0]=0;
    }
    if(w==3){
    arregloFilosofo[0]=2;
    arregloFilosofo[1]=1;
    arregloFilosofo[2]=3;
    arregloFilosofo[3]=4;
    arregloFilosofo[0]=0;
    }
    if(w==4){
    arregloFilosofo[0]=2;
    arregloFilosofo[1]=3;
    arregloFilosofo[2]=4;
    arregloFilosofo[3]=0;
    arregloFilosofo[0]=1;
    }
    for(int j=0;j<5;j++){
        if(arregloFilosofo[j]!=0 && arregloFilosofo[j]!=4){
             if(((System.currentTimeMillis() - this.initialTime) / 1000)<62 ){
                 if(arreglo[arregloFilosofo[j]-1][2]==Etenedor1 && arreglo[arregloFilosofo[j]][2]==Etenedor1){
                     arreglo[arregloFilosofo[j]][1]=estado2;
                     arreglo[arregloFilosofo[j]-1][2]=Etenedor2;
                     arreglo[arregloFilosofo[j]][2]=Etenedor2;
            }
            if(arreglo[arregloFilosofo[j]-1][2]==Etenedor2 && arreglo[arregloFilosofo[j]][2]==Etenedor1){
                arreglo[arregloFilosofo[j]][1]=estado3;
            }}
            if(((System.currentTimeMillis() - this.initialTime) / 1000)>=62){
                arreglo[2][1]=estado4;
                arreglo[4][1]=estado4;
                arreglo[1][1]=estado4;
                arreglo[0][1]=estado4;
                arreglo[3][1]=estado4;
            }
            if(((System.currentTimeMillis() - this.initialTime) / 1000)>=48 ){
                
                arreglo[0][1]=estado4;
                arreglo[2][1]=estado4;
                arreglo[4][1]=estado4;
            }
            
        }
        if(arregloFilosofo[j]==0){
            if(((System.currentTimeMillis() - this.initialTime) / 1000)<59 ){
            if(arreglo[4][2]==Etenedor1 && arreglo[0][2]==Etenedor1){
                arreglo[arregloFilosofo[j]][1]=estado2;
                arreglo[4][2]=Etenedor2;
                arreglo[0][2]=Etenedor2;
            }
            if(arreglo[4][2]==Etenedor2 && arreglo[0][2]==Etenedor1){
                arreglo[arregloFilosofo[j]][1]=estado3;
            }}
            if(((System.currentTimeMillis() - this.initialTime) / 1000)>=59 ){
                arreglo[0][1]=estado4;
                arreglo[2][1]=estado4;
                arreglo[4][1]=estado4;
                arreglo[3][1]=estado4;
            }
        }
        if(arregloFilosofo[j]==4){
            if(((System.currentTimeMillis() - this.initialTime) / 1000)<45 ){
            if(arreglo[arregloFilosofo[j]-1][2]==Etenedor1 && arreglo[4][2]==Etenedor1){
                arreglo[arregloFilosofo[j]][1]=estado2;
                arreglo[arregloFilosofo[j]-1][2]=Etenedor2;
                arreglo[4][2]=Etenedor2;
            }
            if(arreglo[arregloFilosofo[j]-1][2]==Etenedor2 && arreglo[4][2]==Etenedor1){
                arreglo[arregloFilosofo[j]][1]=estado3;
            }}
            if(((System.currentTimeMillis() - this.initialTime) / 1000)>=45 ){
                arreglo[4][1]=estado4;}
        }
        
                
                
    
    }} catch (Exception ex) {
            
        }
            return arreglo;
        }
        

}