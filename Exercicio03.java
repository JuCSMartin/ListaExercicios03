package Lista03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade = 0;
		int menor21 = 0;
		int maior50 = 0;
		
		while(idade != -99) {
			System.out.println("Informe sua idade: ");
			idade = ler.nextInt();
			
			if(idade == -99) {
				System.out.println("Programa finalizado.");
			}
			else if(idade < 21) {
				menor21++;
			}
			else if( idade > 50) {
				maior50++;
			}
		}
		System.out.println("O total de pessoas com menos de 21 anos é: " + menor21);
		System.out.println("O total de pessoas com mais de 50 anos é: " + maior50);
		
		ler.close();
	}

}
