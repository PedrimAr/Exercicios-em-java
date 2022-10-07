package jamal.polvilho.banco.com.br;

public class CaixaEletronico {
	public static void main(String[] args) {
		Conta c = new Conta();
		c.depositar(100);
		double valor = 500;
		try {
			c.sacar(valor);
			Utils.liberarDinheiro(valor);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim!");
	}
}
