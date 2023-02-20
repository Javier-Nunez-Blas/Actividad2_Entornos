package Requerimiento1;

import java.util.Objects;

/**
 * Esta clase define el objeto Soldado
 * @author Ana Nunez Blas
 * @version 18/02/2023/A
 */

public class Soldado {
	
	//Atributos de la clase
	/**
	* Estado vital del soldado, especifica si esta muerto
	*/
	private boolean estaMuerto;
	/**
	* Numero de balas que posee el soldado
	*/
	private int numeroBalas;
	
	//Constructores
	/**
	 * Constructor con dos parametros
	 * @param estaMuerto: estado vital del soldado
	 * @param numeroBalas: numero de balas que posee el soldado
	 */
	public Soldado(boolean estaMuerto, int numeroBalas) {
		super();
		this.estaMuerto = estaMuerto;
		this.numeroBalas = numeroBalas;
	} // Cierre del constructor

	/**
	* Constructor vacio, sin ningun parametro
	*/
	public Soldado() {
		super();
	} // Cierre del constructor

	
	//Métodos públicos Getters & setters
	/**
    * Metodo publico que devuelve el estado vital del soldado
    * @return estado vital del soldado
    */
	public boolean isEstaMuerto() {
		return estaMuerto;
	} //Cierre del métoo
	/**
    * Metodo publico que modifica el estado vital del soldado mediante boolean. 
    * @param estaMuerto: el soldado esta muerto
    * 
    */
	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	} //Cierre del métoo
	/**
    * Metodo publico que devuelve el numero de balas del soldado
    * @return numero de balas que posee el soldado
    */
	public int getNumeroBalas() {
		return numeroBalas;
	} //Cierre del métoo
	/**
    * Metodo publico que modifica el numero de balas de balas del soldado
    * @param numeroBalas: numero de balas que posee el soldado
    */
	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	} //Cierre del método

	//toString
	/**
	* Metodo publico para sobreescribir el metodo toString de la clase Soldado.
	* @param estaMuerto: indica el estado vital del soldado, especificando si el soldado esta muerto
	* @param numeroBalas: numero de balas que tiene el soldado
	* @return devuelve todas las propiedades de la clase Soldado
	*/
	@Override
	public String toString() {
		return "Soldado [estaMuerto=" + estaMuerto + ", numeroBalas=" + numeroBalas + "]";
	} //Cierre del método

	//método hasCode
	/**
	* Metodo publico que compara si dos objetos son iguales mediante estructuras Hash.
	* Si los metodos hashcode() de cada objeto devuelven diferente hash no seguira comparando y considerará 
	* a los objetos distintos. En el caso en el que ambos objetos compartan el mismo hashcode Java invocará
	* al metodo equals() y revisara a detalle si se cumple la igualdad.
	* @param estaMuerto: el soldado está muerto
	* @param numeroBalas: numero de balas que posee el soldado
	* @return devuelve numero entero
	*/
	@Override
	public int hashCode() {
		return Objects.hash(estaMuerto, numeroBalas);
	} //Cierre del métoo

	//método equals
	/**
	* Metodo publico para saber si dos objetos de la clase Soldado son del mismo tipo y tienen los
	* mismos valores. Por lo tanto, comprueba si son iguales
	* @param estaMuerto: estado vital del soldado
	* @param numeroBalas: numero de balas que posee el soldado
	* @return <ul>
    * 		  <li>true: los objetos soldado son iguales </li>
    *   	  <li>false: los objetos soldado son diferentes </li>
    *  	   	  </ul>
	*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Soldado other = (Soldado) obj;
		return estaMuerto == other.estaMuerto && numeroBalas == other.numeroBalas;
	} //Cierre del métoo
	
	//métodos públicos própios de la clase
	/**
    * Metodo que devuelve booleam (true o false) e indica si un soldado puede disparar en función del número de
    * balas del que disponga. Si el numero de balas es mayor de cero podra disparar
    * @param numeroBalas: numero de balas que posee el soldado
    * @return <ul>
    * 		  <li>true: el soldado puede disparar </li>
    *   	  <li>false: el soldado no puede disparar </li>
    *  	 	  </ul>
    */
	public boolean puedeDisparar() {
		if(this.numeroBalas>0) {
			return true;
		}
		return false;
	} //Cierre del método
	
	/**
    * Metodo publico que descontara una bala al soldado despues de cada disparo. 
    * En funcion de las balas de las que disponga podremos saber si ha podido ejecutar el disparo y en consecuencia
    * si ha matado al otro soldado. 
    * @param numeroBalas: numero de balas que posee el soldado
    * @param estaMuerto: el soldado esta muerto
    */
	public void disparar(Soldado sol) {
		this.numeroBalas--;
		sol.estaMuerto=true;
	} //Cierre del método

} // Cierre de la clase
