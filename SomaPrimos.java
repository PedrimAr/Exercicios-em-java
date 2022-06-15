public class SomaPrimos {
	public static void main(String[] args) {
		int soma =  0;
		int count = 0;
		for(int i = 2; i < 10000; i++) {
			for(int n = 1; n < 10000; n++) {
				if(n / i == 2) {
					count ++;
				}
				if(count == 2) {
					soma += n;
				}
			}
		}
		System.out.println("A soma de todos os números primos até 10.000 é : " + soma);
	}
}
