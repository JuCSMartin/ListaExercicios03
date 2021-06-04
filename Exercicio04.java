package Lista03;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade, sexo, humor, i=0;
		int condicao1=0, condicao2=0, condicao3=0, condicao4=0, condicao5=0, condicao6=0;
		
		while (i < 3) {
			System.out.println("Informe sua idade: ");
			idade = ler.nextInt();
			
			System.out.println("Informe seu sexo (1-Masculino, 2-Feminimo, 3-Outros): ");
			sexo = ler.nextInt();
			
			System.out.println("Informe seu humor (1-Calmo(a), 2-Nervoso(a), 3-Agressivo(a)): ");
			humor = ler.nextInt();
			
			if (humor == 1) {
				condicao1++;
			}
			if (sexo == 2 && humor == 2) {
				condicao2++;
			}
			if (sexo == 1 && humor == 3) {
				condicao3++;
			}
			if (sexo == 3 && humor == 1) {
				condicao4++;
			}
			if (idade >= 40 && humor == 2) {
				condicao5++;
			}
			if (idade <= 18 && humor == 1) {
				condicao6++;
			}
		
			i++;
		}
		
		System.out.println("O número de pessoas calmas é: " + condicao1);
		System.out.println("O número de mulheres nervosas é: " + condicao2);
		System.out.println("O número de homens agressivos é: " + condicao3);
		System.out.println("O número de outros calmos é: " + condicao4);
		System.out.println("O número de pessoas nervosas com mais de 40 anos é: " + condicao5);
		System.out.println("O número de pessoas calmas com menos de 18 anos é: " + condicao6);
		ler.close();
	}

}
