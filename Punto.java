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

	void setCoordenadas(int nuevoCoordX, int nuevoCoordY){
		coordX=nuevoCoordX;
		coordY=nuevoCoordY;
	}

	public int getCoordX() {
		return coordX;
	}

	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}

	public int getCoordY() {
		return coordY;
	}

	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}
}
