import java.util.Scanner;

public class CalculoHabilidade {
	public static void main(String[] args) {
		System.out.println("Insira o nome do jogador: ");
		Scanner sc = new Scanner(System.in);
		String nome = sc.nextLine();
		System.out.println("\nInsira o atributo técnico do jogador: ");
		double tec = sc.nextDouble();
		System.out.println("\nInsira o atributo físico do jogador: ");
		double fis = sc.nextDouble();
		System.out.println("\nInsira o atributo mental do jogador: ");
		double men = sc.nextDouble();
		double media = (tec + fis + men) / 3;
		System.out.println("\nO " + nome + " é um jogador de " + media + " estrelas");
	}
}
