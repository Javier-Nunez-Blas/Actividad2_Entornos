package Requerimiento2;

import java.util.Objects;

/**
 * Esta clase define el objeto Jugador
 * @author Ana Nunez Blas
 * @version 18/02/2023/B
 */

public class Jugador {
	
	//Atributos de la clase
	/**
	* Numero de dorsal del jugador
	*/
	private int dorsal;
	/**
	* Numero de tarjetas amarillas del jugador
	*/
	private int numeroTarjetasAmarillas;
	/**
	* Numero de tarjetas rojas del jugador
	*/
	private int numeroTarjetasRojas;
	
	//Constructores
	/**
	* Constructor con tres parametros
	* @param dorsal numero de dorsal del jugador
	* @param numeroTarjetasAmarillas: numero de tarjtas amarillas que posee el jugador
	* @param numeroTarjetasRojas: numero de tarjetas rojas que posee el jugador
	*/
	public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) {
		super();
		this.dorsal = dorsal;
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	} // Cierre del constructor

	/**
	 * Constructor vacio, sin ningun parametro de la clase Jugador
	 */
	public Jugador() {
		super();
	} // Cierre del constructor

	//Métodos públicos Getters & setters
	/**
	 * Metodo publico que devuelve el numero del dorsal del jugador
	 * @return numero de dorsal del jugador
	 */
	public int getDorsal() {
		return dorsal;
	} //Cierre del método
	/**
     * Metodo publico que modifica el numero del dorsal del jugador
     * @param  dorsal: numero de dorsal del jugador
     */
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	} //Cierre del método
	/**
     * Metodo publico que devuelve el numero de tarjetas amarillas del jugador
     * @return numero de tarjetas amarillas que posee el jugador
     */
	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	} //Cierre del método
	/**
     * Metodo que modifica el numero de tarjtas amarillas del jugador
     * @param numeroTarjetasAmarillas numero de tarjetas amarillas del jugador
     */
	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	} //Cierre del métoo
	/**
     * Metodo publico que devuelve el numero de tarjetas rojas del jugador
     * @return numero de tarjetas rojas
     */
	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	} //Cierre del método
	/**
     * Metodo publico que modifica el numero de tarjtas rojas del jugador
     * @param numeroTarjetasRojas: numero de tarjetas rojas que posee el jugador
     */
	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	} //Cierre del método

	//toString
	/**
	 * Metodo publico para sobreescribir el metodo toString de la clase Jugador
	 * @return devuelve todas las propiedades de la clase Jugador
	 */
	@Override
	public String toString() {
		return "Jugador [dorsal=" + dorsal + ", numeroTarjetasAmarillas=" + numeroTarjetasAmarillas
				+ ", numeroTarjetasRojas=" + numeroTarjetasRojas + "]";
	} //Cierre del método
	
	//método hashCode
	/**
	 * Metodo publico que compara si dos objetos son iguales mediante estructuras Hash.
	 * Si los metodos hashcode() de cada objeto devuelven diferente hash no seguira comparando y considerara 
	 * a los objetos distintos. En el caso en el que ambos objetos compartan el mismo hashcode Java invocara
	 * al metodo equals() y revisara a detalle si se cumple la igualdad.
	 * @return devuelve numero entero
	 */
	@Override
	public int hashCode() {
		return Objects.hash(dorsal, numeroTarjetasAmarillas, numeroTarjetasRojas);
	} //Cierre del método

	//método equals
	/**
	 * Metodo publico que devuelve boolean (true o false) para saber si dos objetos de la clase Jugador son del mismo tipo 
	 * y tienen los mismos valores, por lo tanto si son iguales
	 * @return <ul>
	 * 		   <li>true: los objetos son iguales </li>
	 *   	   <li>false: los objetos son diferentes </li>
	 *  	   </ul>
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		return dorsal == other.dorsal && numeroTarjetasAmarillas == other.numeroTarjetasAmarillas
				&& numeroTarjetasRojas == other.numeroTarjetasRojas;
	} //Cierre del método
	
	/**
	* Metodo publico que devuelve un numero de dorsal para el jugador, si está es mayor o igual a uno o
	* igual a 30 el jugador esta dentro del equipo y podra jugar. De lo contrario se habra producido un 
	* error.
	* @param dorsal: numero de dorsal del jugador
	* 
	*/
	public void ponerDorsal(int dorsal) {
		if(dorsal >= 1 && dorsal <=30) {
			this.dorsal = dorsal;	
		}else {
			this.dorsal =-1;
		}
	} //Cierre del método
	
	/**
	* Metodo publico que devuelve boolean (true o false) indica si el jugador esta expulsado en función de 
	* las tarjetas que haya recibido durante el partido.
	* Sera expulsado cuando haya recibido dos tarjtas amarillas o una tarjeta roja.
	* De lo contrario, si no ha recibido dichas tarjetas podra jugar.
	* @param numeroTarjetasAmarillas: numero de tarjetas amarillas del jugador
	* @param numeroTarjetasRojas: numero de tarjetas rojas del jugador
	* @return <ul>
    * 		  <li>true: el jugador esta expulsado del partido </li>
    *   	  <li>false: el jugador puede continuar el partido, no esta expulsado</li>
    *  	 	  </ul>
	*/
	public boolean estaExpulsado() {
		boolean expulsado = false;
		if(numeroTarjetasAmarillas == 2) {
			expulsado = true;
		}
		if(numeroTarjetasRojas == 1) {
			expulsado =true;
		}
		return expulsado;
	} //Cierre del método
	
} //Cierre de la clase
