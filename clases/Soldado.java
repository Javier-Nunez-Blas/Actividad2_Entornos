package clases;

/**
 * 
 * @author Javier Nuñez
 * @version 1.0
 */

public class Soldado {
	   private boolean estaMuerto;
	   private int numeroBalas;
	   
	   
	public boolean getEstaMuerto() {
		return estaMuerto;
	}
	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}
	public int getNumeroBalas() {
		return numeroBalas;
	}
	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}
	
	
	/**
	 * @param Realiza una comprobacion para saber si el objeto tiene mas de 0 balas y puede disparar.
	 * 
	 * @return Si tiene mas de 0 devuelve true, y si tiene menos de 0, devuelve false
	 * 
	 * @author JavierNuñez
	 *@version v1.0
	 */
	  public boolean puedeDisparar() {

       if(this.numeroBalas > 0) {

                     return true;

       }                          

       return false;

	  	}
	  
	  /**
	   * 
	   * @param recibe como parametro un objeto "Soldado", se resta 1 al valor de numeroBalas
	   * y se cambia el estado  estaMuerto a true.
	   * 
	   * @author JavierNuñez
	   *@version v1.0
	   */
	  public void disparar(Soldado sol) {

       this.numeroBalas--;

       sol.estaMuerto = true;

	  }


}
