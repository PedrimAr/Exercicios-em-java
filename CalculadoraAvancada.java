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
		System.out.println("[1] SOMA\n[2] SUBTRAÇÃO\n[3] MULTIPLICAÇÃO\n[4] DIVISÃO\n[5] POTENCIAÇÃO\n[6] RADICIAÇÃO");
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
		else if(op == 5) {
			if(y == 0) {
				System.out.println("\nResultado:\n1");
			}
			else if(y == 1) {
				System.out.println("\nResultado:");
				System.out.format("%.2f", x);
			}
			else {
				double res = Math.pow(x, y);
				System.out.println("\nResultado:");
				System.out.format("%.2f", res);
			}
		}
		else if(op == 6) {
			double res = Math.pow(x, (1 / y));
			System.out.println("\nResultado:");
			System.out.format("%.2f", res);
		}
		else {
			System.out.println("\nNúmero Inválido!");
		}
	}
}
