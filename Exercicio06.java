package Lista03;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero;
		int multiplo = 0;
		int soma = 0;
		int media;
		
		do {
			System.out.println("Digite um n�mero: ");
			numero = ler.nextInt();
			
			if(numero % 3 == 0 && numero != 0) {
				multiplo++;
				soma = soma + numero;
			}
			
		} while(numero != 0); 
	
		media = soma / multiplo;
		System.out.println("A m�dia dos n�meros m�ltiplos de 3 �: " + media);
		ler.close();
	}
}
