package clases;

/**
 * Esta clase define al objeto Jugador
 * @author Javier Nuñez
 * @version 1.0
 */

public class Jugador {
	
	//Atributos de la clase
	
    /**
    * numero del doral
    */
    private int dorsal;
    
    /**
     * numero de tarjetas amarillas
     */

    private int numeroTarjetasAmarillas;
    
    /**
     * numero de tarjetas rojas
     */
    
    private int numeroTarjetasRojas;

    
    //Generamos los getter and settter
	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}

	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}

	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}

	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
    
	
	/**
	 * 
	 * @param recibe un int dorsal, si esta comprendido entre el 1 y el 30
	 * ambos incluidos, le pone ese valor en el dorsal. Sino le pone -1
	 * 
	 * @author Javier Nuñez
	 */
    
	  public void ponerDorsal(int dorsal) {

          if(dorsal >= 1 && dorsal <= 30) {

                        this.dorsal = dorsal;

          }else {

                        this.dorsal = -1;

          }

}

	/**
	 * @param Si recibe dos tarjetas amarillaso o  una tarjeta roja, cambia el 
	 * estado de expulsado a true.
	 * 
	 * @return devuelde el valor de expulsado
	 * 
	 * @author Javier Nuñez
	 */
	
	public boolean estaExpulsado() {
	
	          boolean expulsado = false;                                                  
	
	          if(numeroTarjetasAmarillas == 2) {
	
	                        expulsado = true;
	
	          }                          
	
	          if(numeroTarjetasRojas == 1) {
	
	                        expulsado = true;
	
	          }                          
	
	          return expulsado;

}   
}
