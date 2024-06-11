package lacosCondicionais;

import java.util.Scanner;

public class numerosInteirosDoWhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int soma = 0, numero;

		System.out.println("Digite numeros inteiros (digite 0 para encerrar!!)");

		do {
			System.out.println("Digite  um numero: ");
			numero = ler.nextInt();

			if (numero > 0) {
				soma += numero;
			}
		} while (numero != 0);
		System.out.println("A soma dos numeros positivos é: " + soma);
		ler.close();
	}

}
