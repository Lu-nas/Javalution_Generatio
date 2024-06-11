package lacosCondicionais;

import java.util.Scanner;

public class mediaNumerosDoWhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int soma = 0, contador = 0, numero;
		System.out.println("Digite um numero inteiro:(Digite zero para encerrar): ");
		// laco para calcular a media dos multiplos de 3

		do {
			System.out.print("Digite um número: ");
			numero = ler.nextInt();

			if (numero % 3 == 0 && numero != 0) {
				soma += numero;
				contador++;
			}
		} while (numero != 0);
		double media = contador != 0 ? (double) soma / contador : 0;
		System.out.println("A media de todos os números Multiplos de 3 é " + media);
		ler.close();
	}
}
