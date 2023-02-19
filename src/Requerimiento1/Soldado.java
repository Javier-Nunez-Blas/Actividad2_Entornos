package Requerimiento1;

import java.util.Objects;

/**
 * Esta clase define el objeto Soldado
 * @author: Ana Núñez Blas
 * @version: 18/02/2023/A
 * @see Visitar <a href = "https://github.com/fdepablo/WorkspaceJava/tree/master/20_JavaDocCapas" /> github.com – Repositorio de JavaDoc </a>
 */

public class Soldado {
	
	//Atributos de la clase
	/**
	* Estado vital del soldado
	*/
	private boolean estaMuerto;
	/**
	* Número de balas que posee el soldado
	*/
	private int numeroBalas;
	
	//Constructores
	/**
	 * Constructor con dos parámetros
	 * @param estaMuerto: estado vital del soldado
	 * @param numeroBalas: número de balas que posee el soldado
	 */
	public Soldado(boolean estaMuerto, int numeroBalas) {
		super();
		this.estaMuerto = estaMuerto;
		this.numeroBalas = numeroBalas;
	} // Cierre del constructor

	/**
	* Constructor vacío, sin ningún parámetro
	*/
	public Soldado() {
		super();
	} // Cierre del constructor

	
	//Métodos públicos Getters & setters
	/**
    * Devuelve el estado vital del soldado
    * @return estado vital del soldado
    */
	public boolean isEstaMuerto() {
		return estaMuerto;
	} //Cierre del métoo
	/**
    * Modifica el estado vital del soldado
    * @param estaMuerto el soldado está muerto
    */
	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	} //Cierre del métoo
	/**
    * Devuelve el número de balas del soldado
    * @return número de balas del soldado
    */
	public int getNumeroBalas() {
		return numeroBalas;
	} //Cierre del métoo
	/**
    * Modifica el número de balas de balas del soldado
    * @param numeroBalas número de balas que posee el soldado
    */
	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	} //Cierre del métoo

	//toString
	/**
	* Método público para sobreescribir el método toString de la clase Soldado.
	* @param estaMuerto el soldado está muerto
	* @param numeroBalas núméro de balas que tiene el soldado
	* @return devuelve todas las propiedades de la clase Soldado
	*/
	@Override
	public String toString() {
		return "Soldado [estaMuerto=" + estaMuerto + ", numeroBalas=" + numeroBalas + "]";
	} //Cierre del método

	//método hasCode
	/**
	* Método público que compara si dos objetos son iguales mediante estructuras Hash.
	* Si los métodos hashcode() de cada objeto devuelven diferente hash no seguirá comparando y considerará 
	* a los objetos distintos. En el caso en el que ambos objetos compartan el mismo hashcode Java invocará
	* al método equals() y revisará a detalle si se cumple la igualdad.
	* @param estaMuerto el soldado está muerto
	* @param numeroBalas número de balas que posee el soldado
	* @return devuelve número entero
	*/
	@Override
	public int hashCode() {
		return Objects.hash(estaMuerto, numeroBalas);
	} //Cierre del métoo

	//método equals
	/**
	* Método público para saber si dos objetos de la clase Soldado son del mismo tipo y tienen los
	* mismos valores. Por lo tanto, si son iguales
	* @param estaMuerto estado vital del soldado
	* @param numeroBalas número de balas que posee el soldado
	* @return <ul>
    * 		  <li>true: los objetos son iguales </li>
    *   	  <li>false: los objetos son diferentes </li>
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
    * Método que devuelve booleam (true o false) e indica si un soldado puede disparar en función del número de
    * balas del que disponga. Si el número de balas es mayor de cero podrá disparar
    * @param numeroBalas número de balas que posee el soldado
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
    * Método público que descontará una bala al soldado después de cada disparo. 
    * En función de las balas de las que disponga podremos saber si ha podido ejecutar el disparo y en consecuencia
    * si ha matado al otro soldado. 
    * @param numeroBalas número de balas que posee el soldado
    * @param estaMuerto el soldado está muerto
    */
	public void disparar(Soldado sol) {
		this.numeroBalas--;
		sol.estaMuerto=true;
	} //Cierre del método

} // Cierre de la clase
