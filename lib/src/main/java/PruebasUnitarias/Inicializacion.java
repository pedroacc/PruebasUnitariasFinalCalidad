package PruebasUnitarias;

public class Inicializacion {
	public int Operaciones(String obtener, int arreglo[]) {
		int numeroUno = arreglo[0];
		int numeroDos = arreglo[1];
		OperacionesBase OperacionBase = new OperacionesBase();
		OperacionesDerivadas OperacionDerivadas = new OperacionesDerivadas();
		
		if(obtener == "suma") {
			return OperacionBase.suma(numeroUno, numeroDos);
		}
		if(obtener == "resta") {
			return OperacionBase.resta(numeroUno, numeroDos);
		}
		if(obtener == "multiplicacion") {
			return OperacionDerivadas.multiplicacion(numeroUno, numeroDos);
		}
		if(obtener == "potencia") {
			return OperacionDerivadas.potenciacion(numeroUno, numeroDos);
		}
		if(obtener == "factorial") {
			return OperacionDerivadas.factorial(numeroUno,numeroDos);
		}
		return 0;
		
	}

}
