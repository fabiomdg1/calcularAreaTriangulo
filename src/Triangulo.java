import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		double base;
		double altura;
				
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			System.out.print("Digite a base do triangulo "+(i+1)+": ");
			base = scan.nextDouble();
			
			System.out.print("Digite a altura do triangulo "+(i+1)+": ");
			altura = scan.nextDouble();		
			
			CalculoTriangulo calc = new CalculoTriangulo(base,altura);
			
			System.out.println("A área do Triângulo "+(i+1)+" é: "+calc.Area()+"\n");
		}
	}
}
		