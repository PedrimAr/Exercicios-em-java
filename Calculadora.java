import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("= CALCULADORA DO POLVO =");
		System.out.println("\nDigite o primeiro número: ");
		double x = sc.nextDouble();
		System.out.println("Digite o segundo número: ");
		double y = sc.nextDouble();
		System.out.println("\nEscolha a operação que quer efetuar: ");
		System.out.println("[1] SOMA\n[2] SUBTRAÇÃO\n[3] MULTIPLICAÇÃO\n[4] DIVISÃO");
		int op = sc.nextInt();
		if(op == 1) {
			System.out.println("\nResultado:");
			System.out.format("%.2f", (x + y));
		}
		else if(op == 2) {
			System.out.println("\nResultado:");
			System.out.format("%.2f", (x - y));
		}
		else if(op == 3) {
			System.out.println("\nResultado:");
			System.out.format("%.2f", (x * y));
		}
		else if(op == 4) {
			System.out.println("\nResultado:");
			System.out.format("%.2f", (x / y));
		}
		else {
			System.out.println("\nNúmero Inválido!");
		}
	}
}
