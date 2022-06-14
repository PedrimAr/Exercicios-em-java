import java.util.Scanner;

public class HabilidadeAvancada {
	public static void main(String[] args) {
		System.out.println("Insira o nome do jogador: ");
		Scanner sc = new Scanner(System.in);
		String nome = sc.nextLine();
		System.out.println("\nInsira a posicao do jogador: ");
		System.out.println("\n[1] ATACANTE\n[2] MEIO CAMPO\n[3] DEFENSOR");
		int pos = sc.nextInt();
		System.out.println("\nInsira o atributo de finalizacao do jogador: ");
		double chu = sc.nextDouble();
		System.out.println("\nInsira o atributo de passe do jogador: ");
		double pas = sc.nextDouble();
		System.out.println("\nInsira o atributo de drible do jogador: ");
		double dri = sc.nextDouble();
		System.out.println("\nInsira o atributo de velocidade do jogador: ");
		double vel = sc.nextDouble();
		System.out.println("\nInsira o atributo de desarme do jogador: ");
		double des = sc.nextDouble();
		System.out.println("\nInsira o atributo de forca do jogador: ");
		double forca = sc.nextDouble();
		System.out.println("\nInsira o atributo mental do jogador: ");
		double men = sc.nextDouble();
		double media;
		if(pos == 1){
		    media = ((chu * 1.2) + pas + dri + vel + (des * 0.8) + forca + men) / 7;
		    System.out.println("\nA habilidade media do jogador " + nome + " e:");
		    System.out.format("%.2f", media);
		}
		else if(pos == 2){
		    media = (chu + (pas * 1.2) + dri + vel + des + forca + men) / 7.2;
		    System.out.println("\nA habilidade media do jogador " + nome + " e:");
		    System.out.format("%.2f", media);
		}
		else if(pos == 3){
		    media = ((chu * 0.8) + pas + (dri * 0.8) + vel + (des * 1.2) + (forca * 1.2) + men) / 7;
		    System.out.println("\nA habilidade media do jogador " + nome + " e:");
		    System.out.format("%.2f", media);
		}
		else{
		    System.out.println("\nNumero invalido!");
		}
	}
}
