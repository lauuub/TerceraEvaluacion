package EjerciciosClases;

public class Cuenta {
	private String titular;
	private double cantidad;
	//priemer constructor
	public Cuenta(String titular, double cantidad) {
		//titular=nuevoTitular;
		//cantidad=nuevaCantidad;
		this.titular=titular;
		this.cantidad=cantidad;
	}
	//segundo constructor
	public Cuenta(String titular) {
		this.titular=titular;
	}
	//métodos 
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
	
	
}
