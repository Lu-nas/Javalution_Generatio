package exerVetores;

import java.util.Scanner;

public class naoOrdenados {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int vetor [] = { 10, 7, 5, 1, 4, 2, 6, 8, 3, 9};
		// vetor[] = ler.nextInt();
		for(int soma: vetor) {
			System.out.println(soma);
		}
		System.out.println("\nDigite o número que você deseja encontrar: ");
		int valor = ler.nextInt();
		
		boolean encontrado = false;
		for(int i = 0; i< vetor.length; i++) {
			if(vetor[i] == valor) {
				System.out.println("O número " + valor+ " está localizado na posição: " + i);
				encontrado = true;
				break ;
			}
		
		}
			if (!encontrado) {
				System.out.println("O  número "+ valor+ " Não foi encontrado!");
			}
		
	}

}
