package Requerimiento2;

import java.util.Objects;

/**
 * Esta clase define el objeto Jugador
 * @author: Ana Núñez Blas
 * @version: 18/02/2023/B
 * @see Visitar <a href = "https://github.com/fdepablo/WorkspaceJava/tree/master/20_JavaDocCapas" /> github.com – Repositorio de JavaDoc </a>
 */

public class Jugador {
	
	//Atributos de la clase
	/**
	* Número de dorsal del jugador
	*/
	private int dorsal;
	/**
	* Número de tarjetas amarillas del jugador
	*/
	private int numeroTarjetasAmarillas;
	/**
	* Número de tarjetas rojas del jugador
	*/
	private int numeroTarjetasRojas;
	
	//Constructores
	/**
	* Constructor con tres parámetros
	* @param dorsal: número de dorsal del jugador
	* @param numeroTarjetasAmarillas: número de tarjtas amarillas
	* @param numeroTarjetasRojas: número de tarjetas rojas
	*/
	public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) {
		super();
		this.dorsal = dorsal;
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	} // Cierre del constructor

	/**
	 * Constructor vacío, sin ningún parámetro
	 */
	public Jugador() {
		super();
	} // Cierre del constructor

	//Métodos públicos Getters & setters
	/**
	 * Devuelve el número del dorsal del jugador
	 * @return número dorsal
	 */
	public int getDorsal() {
		return dorsal;
	} //Cierre del métoo
	/**
     * Modifica el número del dorsal del jugador
     * @param dorsal
     */
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	} //Cierre del métoo
	/**
     * Devuelve el número de tarjetas amarillas del jugador
     * @return número de tarjetas amarillas
     */
	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	} //Cierre del métoo
	/**
     * Modifica el número de tarjtas amarillas del jugador
     * @param numeroTarjetasAmarillas
     */
	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	} //Cierre del métoo
	/**
     * Devuelve el número de tarjetas rojas del jugador
     * @return número de tarjetas rojas
     */
	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	} //Cierre del métoo
	/**
     * Modifica el número de tarjtas rojas del jugador
     * @param numeroTarjetasRojas
     */
	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	} //Cierre del métoo

	//toString
	/**
	 * Método público para sobreescribir el método toString de la clase Jugador
	 * @param dorsal: número de dorsal del jugador
	 * @param numeroTarjetasRojas: número de tarjetas rojas del jugador
	 * @param numeroTarjetasAmarillas: número de tarjetas amarillas del jugador
	 * @return devuelve todas las propiedades de la clase Jugador
	 */
	@Override
	public String toString() {
		return "Jugador [dorsal=" + dorsal + ", numeroTarjetasAmarillas=" + numeroTarjetasAmarillas
				+ ", numeroTarjetasRojas=" + numeroTarjetasRojas + "]";
	} //Cierre del método
	
	//método hashCode
	/**
	 * Método público que compara si dos objetos son iguales mediante estructuras Hash.
	 * Si los métodos hashcode() de cada objeto devuelven diferente hash no seguirá comparando y considerará 
	 * a los objetos distintos. En el caso en el que ambos objetos compartan el mismo hashcode Java invocará
	 * al método equals() y revisará a detalle si se cumple la igualdad.
	 * @param dorsal: número de dorsal del jugador
	 * @param numeroTarjetasAmarillas: número de tarjetas amarillas del jugador
	 * @param numeroTarjetasRojas: número de tarjetas rojas del jugador
	 * @return devuelve número entero
	 */
	@Override
	public int hashCode() {
		return Objects.hash(dorsal, numeroTarjetasAmarillas, numeroTarjetasRojas);
	} //Cierre del métoo

	//método equals
	/**
	 * Método público para saber si dos objetos de la clase Jugador son del mismo tipo y tienen los
	 * mismos valores, por lo tanto si son iguales
	 * @param dorsal número de dorsal del jugador
	 * @param numeroTarjetasAmarillas número de tarjetas amarillas del jugador
	 * @param numeroTarjetasRojas número de tarjetas rojas del jugador
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
	} //Cierre del métoo
	
	/**
	* Método público que devuelve un número de dorsal para el jugador, si está es mayor o igual a 1 ó
	* igual a 30 el jugador está dentro del equipo y podrá jugar.
	* De lo contrario se habrá producido un error.
	* @param dorsal número de dorsal del jugador
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
	* Método público que devuelve boolean (true o false) que indica si el jugador está expulsado en función de 
	* las tarjetas que haya recibido durante el partido.
	* Será expulsado cuando haya recibido dos tarjtas amarillas o una tarjeta roja.
	* De lo contrario, si no ha recibido dichas tarjetas podrá jugar.
	* @param numeroTarjetasAmarillas número de tarjetas amarillas del jugador
	* @param numeroTarjetasRojas número de tarjetas rojas del jugador
	* @return <ul>
    * 		  <li>true: el jugador está expulsado </li>
    *   	  <li>false: el jugador puede continuar el partido, no está expulsado</li>
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
