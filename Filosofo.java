/**
 *
 * @author Juan David Zapata Y Andres Barragan
 */
public class Filosofo {
    	private String filosofo;
	private int[] tiempo;
        

	public Filosofo(String filosofo, int[] tiempo){
            this.filosofo = filosofo;
            this.tiempo = tiempo;
        }

    public String getFilosofo() {
        return filosofo;
    }

    public int[] getTiempo() {
        return tiempo;
    }

    public void setFilosofo(String filosofo) {
        this.filosofo = filosofo;
    }

    public void setTiempo(int[] tiempo) {
        this.tiempo = tiempo;
    }
}