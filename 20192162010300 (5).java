import java.util.Scanner;

class Main {

	public static double somar (double num1, double num2) {
		return (num1+num2);
	}
	
	public static double subtrair (double num1, double num2) {
		return (num1-num2);
	}
	
	public static double multiplicar (double num1, double num2) {
		return (num1*num2);
	}
	
	public static double dividir (double num1, double num2) {
		return (num1/num2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero: ");
		Double num1 = sc.nextDouble();
		System.out.println("Informe o segundo numero: ");
		Double num2 = sc.nextDouble();
		
		sc.close();
		
		double Soma = somar (num1, num2);
		double Subtracao = subtrair (num1, num2);
		double Multiplicacao = multiplicar (num1, num2);
		double Divisao = dividir (num1, num2);
		
		System.out.println("Soma: " + Soma );
		System.out.println("Subtracao: " + Subtracao );
		System.out.println("Multiplicacao: " + Multiplicacao );
		System.out.println ("Divisao: " + Divisao);
	}

}
