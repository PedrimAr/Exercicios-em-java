import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número para calcular sua tabuada: ");
		int x = sc.nextInt();
		System.out.println("\nTABUADA: ");
		for(int y = 1; y <= 10; y++) {
			System.out.println(x + "x" + y + " = " + (x * y));
		}
	}
}
