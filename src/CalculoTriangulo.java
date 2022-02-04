
public class CalculoTriangulo {

	double base1;
	double altura1;
	
	//Método construtor
	public CalculoTriangulo(double base1, double altura1){
		this.base1 = base1;
		this.altura1 = altura1;		
	}
	
	public double Area() {
		return ((this.base1 * this.altura1)/2);
	}
}
	