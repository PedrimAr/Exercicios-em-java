import java.util.Scanner;

public class ClassificacaoNumero {
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Insira um número inteiro para ser verificado");
		int num = sc.nextInt();
		if(par(num) == true) {
			System.out.println("\nO número " + num + " é par!");
		}
		else {
			System.out.println("\nO número " + num + " é ímpar!");
		}
		if(primo(num) == true) {
			System.out.println("O número " + num + " é primo!");
		}
		else {
			System.out.println("O número " + num + " não é primo!");
		}
	}
	
	public static boolean par(int num) {
		if(num % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean primo(int num) {
		int count = 0;
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				count ++;
			}
		}
		if(count == 2) {
			return true;
		}
		else {
			return false;
		}
	}
}
