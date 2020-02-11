import java.util.*;

class Main {

	public static double area (double base, double altura) {
		return (base*altura);
	}
	
	public static double perimetro (double base, double altura) {
		return (2*base+2*altura);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a base: ");
		Double base = sc.nextDouble();
		System.out.println("Informe a altura: ");
		Double altura = sc.nextDouble();
		
		sc.close();
		
		double Vlarea = area (base, altura);
		double VlPerimetro = perimetro (base, altura);
		
		System.out.println("Area: " + Vlarea );
		System.out.println ("Perimetro: " + VlPerimetro);
	}

}
