//Ejemplo Singleton
package ejemplo;

public class Main {

	public static void main(String[] args) {
		
		Saludo instancia1=Saludo.getinstancia();
		Saludo instancia2=Saludo.getinstancia();
		Saludo instancia3=Saludo.getinstancia();
		Saludo instancia4=Saludo.getinstancia();
		
		//Invocaci�n del m�todo setDatos de la instancia 1
		instancia1.setDatos(4,9);
		
		//Invocaci�n del m�todo setMensaje de la instancia 2
		instancia2.setMensaje("La suma es: ");
		
		//Invocaci�n del m�todo hacerSuma de la instancia 3
		instancia3.hacerSuma();
		
		//Invocaci�n de los m�todos getMensaje y getSuma de la instancia 4
		System.out.println(instancia4.getMensaje()+instancia4.getSuma());
		
		
		

	}

}
