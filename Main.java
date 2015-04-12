/**
 *
 * @author Juan David Zapata Y Andres Barragan
 */
public class Main {
	public static void main(String[] args) {
            int contador=0;

		Filosofo filosofo1 = new Filosofo("Filosofo 1", new int[] { 1, 5,5, 5, 5,5,5,5,5,5,5,5,5,0 });
		Filosofo filosofo2 = new Filosofo("Filosofo 2", new int[] { 2, 5,5, 5, 5,5,5,5,5,5,5,5,5,0 });
                Filosofo filosofo3 = new Filosofo("Filosofo 3", new int[] { 3, 5,5, 5, 5,5,5,5,5,5,5,5,5,0 });
		Filosofo filosofo4 = new Filosofo("Filosofo 4", new int[] { 4, 5,5, 5, 5,5,5,5,5,5,5,5,5,0  });
                Filosofo filosofo5 = new Filosofo("Filosofo 5", new int[] { 5, 5,5, 5,5 ,5,5,5,5,5,5,5,5,0});
                
		// Tiempo inicial de referencia
		long initialTime = System.currentTimeMillis();
		Threads estado1 = new Threads("1", filosofo1, initialTime,contador);
                if(contador==0){
                estado1.start();}
                contador=contador+1;
		Threads estado2 = new Threads("2", filosofo2, initialTime,contador);
                if(contador==1){
                estado2.start();}
                contador=contador+1;
                Threads estado3 = new Threads("3", filosofo3, initialTime,contador);
                if(contador==2){
                estado3.start();}
                contador=contador+1;
                Threads estado4 = new Threads("4", filosofo4, initialTime,contador);
                if(contador==3){
                estado4.start();}
                contador=contador+1;
                Threads estado5 = new Threads("5", filosofo5, initialTime,contador);
                if(contador==4){
                estado5.start();}
                contador=contador+1;

                
                
                try {
                    estado1.join();
                    estado2.join();
                    estado3.join();
                    estado4.join();
                    estado5.join();
                } 
                catch (InterruptedException ie) {
                }
	}
}