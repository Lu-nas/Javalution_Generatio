package lacosCondicionais;

import java.util.Scanner;

public class numerosMultiplos {
	
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int inteiro1, inteiro2, i;

		System.out.println("Digite o Primeiro numero do intervalo: ");
		inteiro1 = ler.nextInt();
		System.out.println("Digite o Ultimo numero do intervalo: ");
		inteiro2 = ler.nextInt();
		
		if (inteiro1 >= inteiro2) {
			System.out.println("intervalo invalido! ");
			System.exit(0);
		}
//		 verificar os multiplos de 3 e 5 
		
		System.out.println("No intervalo entre" + inteiro1 + " e " + inteiro2 + " : ");
		for (i = inteiro1; i<= inteiro2; i++){
			 if (i % 3 == 0 && i % 5 == 0) {
				 System.out.println(i+ " è múltiplo de 3 e 5 ");
			 }
		}
	}
}


