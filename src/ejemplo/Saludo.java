package ejemplo;

public class Saludo {
	
	private static Saludo saludo;
	private String mensaje;
	private int a,b,suma;
	
	private Saludo() {
		
	}
	
	public static Saludo getinstancia() {
		
		if(saludo==null) {
			saludo=new Saludo();
		}
		return saludo;
	}
	
	public void setMensaje(String mensaje) {
		this.mensaje=mensaje;
	}
	public String getMensaje() {
		return mensaje;
	}
	
	public void setDatos(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public void hacerSuma() {
		suma=a+b;
	}
	public int getSuma() {
		return suma;
	}
	
	
}
