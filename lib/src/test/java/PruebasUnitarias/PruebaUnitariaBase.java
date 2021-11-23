package PruebasUnitarias;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PruebaUnitariaBase {

		  OperacionesBase operacionesBase = new OperacionesBase();  
		  

		  @Test
		  void reciboTresYCincoYObtengoOcho() {
		  
		    int numeroUno = 3;
		    int numeroDos = 5;
  
		    int resultado;
		    resultado = operacionesBase.suma(numeroUno, numeroDos);
		   
		    assertEquals(8, resultado);

		   		  }
		  @Test
		  void reciboCincoYTresYObtengoDos() {
		  
		    int numeroUno = 5;
		    int numeroDos = 3;
  
		    int resultado;
		    resultado = operacionesBase.resta(numeroUno, numeroDos);
		   
		    assertEquals(2, resultado);

		   		  }
	}

