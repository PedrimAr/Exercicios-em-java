package teguinha;

public class Pessoa {
	private String nome;
	private int idade;
	public Pessoa() {
		System.out.println("Criando objeto!");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String n) {
		nome = n;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int i) {
		idade = i;
	}
}
