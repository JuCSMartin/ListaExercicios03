package Lista03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int i = 0, soma = 0;
		
		do {
			System.out.println("Digite um n?mero: ");
			i = ler.nextInt();
			soma = soma + i;
		} while(i != 0);
		
		System.out.println("A soma dos n?meros ?: " + soma);
		ler.close();
	}
}
