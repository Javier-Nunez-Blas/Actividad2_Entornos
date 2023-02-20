
	/*
	* declaracion de la clase soldado
	*la clase soldado va a representar si el soldado esta muerto o el numero de balas utilizadas
	**  david aprea
	*/

public class Soldado {


	/*
	*declarar los atribvutios privados 
	* devolviendo un atrivuto privado boolean estaMuerto, Asigna un objeto booleano que representa el valor verdadero
	si el argumento de cadena no es nulo y es igual, ignorando mayúsculas y minúsculas, a la cadena "verdadero".
	* devolviendo otro atributo privado int numeroBalas, devuelve el valor de este Integer como un int.

	        private boolean estaMuerto;

	        private int numeroBalas;
	/*
	* Se crean los métodos getter & setter 

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

	/*
	* Se crea un método que establece el numero de balas utilizdadas
	* @return boolean
	* @param if

	public boolean puedeDisparar() {

	    if(this.numeroBalas > 0) {

	                  return true;

	    }                          

	    return false;

	    
	}


	/*
	* Método que establece el valor al atributo <b>solado sol</b>

	public void disparar(Soldado sol) {

	              this.numeroBalas--;

	              sol.estaMuerto = true;

	}


	

}
