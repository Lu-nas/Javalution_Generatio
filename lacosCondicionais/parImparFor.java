package lacosCondicionais;

import java.util.Scanner;

public class parImparFor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i, numerosPares = 0, numerosImpares = 0;
		System.out.println(" Digite 10 numeros inteiros: ");

		for (i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "º número: ");
			int numero = ler.nextInt();

			if (numero % 2 == 0) {
				numerosPares++;
			} else {
				numerosImpares++;
			}
		}

		System.out.println("Total de números pares: " + numerosPares);
		System.out.println("Total de números Impares: " + numerosImpares);

	}

}
