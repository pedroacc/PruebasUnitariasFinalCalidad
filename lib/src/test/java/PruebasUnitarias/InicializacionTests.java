package PruebasUnitarias;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class InicializacionTests {
	 Inicializacion test = new Inicializacion();  
	
	
	@Test
	public void Resultado() {
		// Arrange
		String obtener = "suma";
		int[] valor = {3,5};
		
		
		// Act
		int resultado = test.Operaciones(obtener, valor);
		
		// Assert
		assertEquals(8, resultado);
	}
	
	@Test
	public void Resultado2() {
		// Arrange
		String obtener = "resta";
		int[] valor = {5,3};
		
		// Act
		int resultado = test.Operaciones(obtener, valor);
		
		// Assert
		assertEquals(2, resultado);
	}
	
	@Test
	public void Resultado3() {
		// Arrange
		String obtener = "multiplicacion";
		int[] valor = {4,5};
		
		// Act
		int resultado = test.Operaciones(obtener, valor);
		
		// Assert
		assertEquals(20, resultado);
	}
	
	@Test
	public void Resultado4() {
		// Arrange
		String obtener = "potencia";
		int[] valor = {2, 3};
		
		// Act
		int resultado = test.Operaciones(obtener, valor);
		
		// Assert
		assertEquals(8, resultado);
	}
	
	@Test
	public void Resultado5() {
		// Arrange
		String obtener = "factorial";
		int[] valor = {3,0};
		
		// Act
		int resultado = test.Operaciones(obtener, valor);
		
		// Assert
		assertEquals(6, resultado);
	}
}
