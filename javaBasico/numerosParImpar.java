package javaBasico;

import java.util.Scanner;

public class numerosParImpar {

	/* Exercicio 2 laco de repeticao */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		
		
		while (true) {
			System.out.print("Digite  um numero (0 para sair):  ");
			int numero = ler.nextInt();

			if (numero  == 0) {
				System.out.println("Programa Encerrado pelo usuario!! ");
				break ;
			}
			if(numero % 2 == 0 ) {
				if(numero > 0) {
					System.out.println("O número " + numero + " é par e positivo!\n");
				}else {
					System.out.println("O número " + numero + " é par e negativo!\n");
				}
					
				}else {
					if(numero > 0) {
						System.out.println("O número " + numero + " é impar e positivo!\n");
					}else {
						System.out.println("O número " + numero + " é impar e positivo!\n");
					}
					
				}
				
			}
			ler.close();	
	}
}
