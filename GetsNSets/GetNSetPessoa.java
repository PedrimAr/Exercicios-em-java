package teguinha;
import java.util.Scanner;

public class GetNSetPessoa {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira seu nome: ");
		String nome = sc.nextLine();
		p1.setNome(nome);
		System.out.println("Insira sua idade: ");
		int idade = sc.nextInt();
		p1.setIdade(idade);
		System.out.println("\nNovo cadastro:\n" + p1.getNome() + "\n" + p1.getIdade() + " anos");
	}
}
