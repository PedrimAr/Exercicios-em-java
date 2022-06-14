import java.util.Scanner;

public class Mochilas {
	String cor;
	double anoFab;
	
	public static void main(String[] args) {
		Mochilas[] x = new Mochilas[4];
		for(int i = 0; i < x.length; i++) {
			x[i] = new Mochilas();
			System.out.println("Insira a cor da mochila: ");
			Scanner sc = new Scanner(System.in);
			x[i].cor = sc.nextLine();
			System.out.println("Insira o ano de fabricação: ");
			x[i].anoFab = sc.nextDouble();
		}
		System.out.println("A média é: " + media(x));
	}
	public static double media(Mochilas[] x) {
		int soma = 0;
		for(int i = 0; i < x.length; i++) {
			soma += x[i].anoFab;
		}
		return soma / x.length;
	}
}
