package PruebasUnitarias;

public class OperacionesDerivadas {
	
	 @SuppressWarnings("unused")
	public int multiplicacion(int numeroUno, int numeroDos) {
		 		 String palabra="multiplicacion";
		    return numeroUno * numeroDos;
		  }
	 @SuppressWarnings("unused")
		  public int potenciacion(int numeroUno, int numeroDos) {
				String palabra="potencia";
				int resultado = 1;
		   for (int i = 0; i<numeroDos;i++) {
			   resultado=resultado * numeroUno;
		   }
		return resultado;
		  }
	 @SuppressWarnings("unused")
		  public int factorial (int numeroUno,int numeroDos) {
		 String palabra="factorial";
				 int resultado = numeroUno;
					for (int i = 1; i < numeroUno; i++) {
						 resultado =resultado * i;
					}
					return resultado;
			  }
	
}
