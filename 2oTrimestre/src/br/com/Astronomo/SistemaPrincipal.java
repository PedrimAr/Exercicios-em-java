package br.com.Astronomo;
import java.util.*;

public class SistemaPrincipal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ID do Corpo Celeste a ser procurado: ");
		String id = sc.nextLine();
		sc.close();
		CorpoCeleste c = new CorpoCeleste(id);
		if(Utils.existe(Utils.retornaDados(LerArquivo.retornaStrings()).values(), c)) {
			System.out.println(Utils.retornaDados(LerArquivo.retornaStrings()).get(id));
		}
		else {
			System.out.println("A estrela co ID " + id + " não existe. Considere que o ID " + id + " será inserido");
		}
	}
}
