package PrimerasClases;

public class Punto {
	//variables=atributos
	int coordX;
	int coordY;
	
	//constructor
	public Punto(int nuevaCoordX, int nuevaCoordY){
		coordX=nuevaCoordX;
		coordY=nuevaCoordY;
	}
	
	//métodos
	float devuelveDistanciaOrigen(){
		double distancia;
		distancia=Math.sqrt(coordX*coordX+coordY*coordY);
		return();
	}
}
