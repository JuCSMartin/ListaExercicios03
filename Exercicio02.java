package Lista03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int i;
		int par = 0;
		int impar = 0;
		
		for (i=1; i <=10; i++) {
			System.out.println("Digite o um n�mero: ");
			i = ler.nextInt();
			
			if(i % 2 == 0) {
				par++;
			}
			else if(i % 2 != 0 ) {
				impar++;
			}
			
		}
			System.out.println("A quantidade de n�mero pares �: " + par);
			System.out.println("A quantidade de n�meros �mpares �: " + impar);
			ler.close();
	}

}
