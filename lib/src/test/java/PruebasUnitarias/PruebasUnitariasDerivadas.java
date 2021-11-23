package PruebasUnitarias;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PruebasUnitariasDerivadas {
	  OperacionesDerivadas operacionDerivada = new OperacionesDerivadas();  
	  

	  @Test
	  void reciboCuatroYCincoYObtengoVeinte() {
	  
	    int numeroUno = 4;
	    int numeroDos = 5;

	    int resultado;
	    resultado = operacionDerivada.multiplicacion(numeroUno, numeroDos);
	   
	    assertEquals(20, resultado);

	   		  }
	  @Test
	  void reciboDosYTresYObtengoOcho() {
	  
	    int numeroUno = 2;
	    int numeroDos = 3;

	    int resultado;
	    resultado = operacionDerivada.potenciacion(numeroUno, numeroDos);
	   
	    assertEquals(8, resultado);

	   		  }
	  @Test
	  void reciboTresyObtengoSeis() {
	  
		  int numero=3;
	  

	    double resultado;
	   
		resultado = operacionDerivada.factorial(numero, numero);
	   
	    assertEquals(6, resultado);

	   		  }
}
