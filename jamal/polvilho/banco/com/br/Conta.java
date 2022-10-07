package jamal.polvilho.banco.com.br;

public class Conta {
	private double saldo;
	
	public void sacar (double valor) {
		if(valor > saldo) {
			System.out.println("Nao e possivel sacar");
			throw new SDException("Valor: " + valor);
		}
		else {
			saldo -= valor;
		}
	}
	
	public void depositar (double valor) {
		saldo += valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
}
