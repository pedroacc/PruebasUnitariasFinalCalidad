package PruebasUnitarias;

public class OperacionesBase {
	
	@SuppressWarnings("unused")
	public int suma(int numeroUno, int numeroDos) {
		 String palabra="suma";
		    return numeroUno + numeroDos;
		  }

    @SuppressWarnings("unused")
	public int resta(int numeroUno, int numeroDos) {
		  String palabra="resta";
		    return Math.abs(numeroUno - numeroDos);
		  }

}
