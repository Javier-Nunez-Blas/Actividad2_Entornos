
/*
* Declaración de la clase jugador
* La clase jugador va a representar que dorsal lleva el jugador, numero de tarjetas amarillas y numero de tarjetas rojas
* @autor David Aprea
*/

public class Jugador {

/*
* Declaramos atributos privados 
* @return
        private int dorsal;

        private int numeroTarjetasAmarillas;

        private int numeroTarjetasRojas;

}

/*
* Se crean los métodos getter and setter 

public int getDorsal() {
	return dorsal;
}
public void setDorsal(int dorsal) {
	this.dorsal = dorsal;
}
public int getNumeroTrajetasAmarillas(){
	return numeroTarjetasAmarillas;
}
public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
	this.numeroTarjetasAmarillas;
}
public int getNumerotarjetasRojas() {
	return numeroTarjetasRojas;
}
public void setNumeroTrajetasRojas(int numeroTarjetasRojas) {
	this.numerotarjetasRojas = numeroTarjetasRojas;
	
}

*/
* 
public void ponerDorsal(int dorsal) {

    if(dorsal >= 1 && dorsal <= 30) {

                  this.dorsal = dorsal;

    }else {

                  this.dorsal = -1;

    }

}



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
