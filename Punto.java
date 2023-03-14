package PrimerasClases;

public class Punto {
	//variables=atributos
	private int coordX;
	private int coordY;
	
	//constructor
	public Punto(int nuevaCoordX, int nuevaCoordY){
		coordX=nuevaCoordX;
		coordY=nuevaCoordY;
	}
	
	//métodos
	double devuelveDistanciaOrigen(){
		double distancia;
		distancia=Math.sqrt(coordX*coordX+coordY*coordY);
		return(distancia);
		
	}
	//Métodos setter&getter:
	//Método set: Sirve para fijar el valor de un atributo
	
	void setCoordX(int nuevoCoordX){
		coordX=nuevoCoordX;
	}
	
	
}
