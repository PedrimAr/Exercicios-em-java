public class SomaImpares {
	
	public static void main(String[] args) {
		SomaImpares[] si = new SomaImpares[10000];
		System.out.println("A soma é: " +  soma(si));
	}
	public static int soma(SomaImpares[] si) {
		int soma = 0;
		for(int n = 1; n < si.length; n++) {
			if(n % 2 != 0) {
				soma += n;
			}
		}
		return soma;
	}
}
