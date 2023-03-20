package PrimerasClases;

public class ManejaPuntos {

	public static void main(String[] args) {
		// Esta clase sirve para  ver si he pensado bien 
		//la clase punto
		int x=2;
		double y=3.1416;
		char l='a';
		boolean respuesta=true;
		String palabra;
		Punto miPrimerPuntito; //declaro un objeto de la clase Punto
		miPrimerPuntito=new Punto(2,3); //utilizo su constructor para inicializarlo
		System.out.println("Este punto dista del origen: ");
		System.out.print(miPrimerPuntito.devuelveDistanciaOrigen());
		
	}

}
