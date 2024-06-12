package operadores;

import java.util.Scanner;

public class Matriz3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int matriz [][] = new int [3][3];
		int soma = 0;
		int somaDiagoPincipal = 0;
		int somaDiagoSecundaria = 0;
		// leitura matriz
		System.out.println("Digite os elementos da matriz 3X3?");
		for(int i =0; i < 3; i++) { 
			for(int j =0; j<3; j++) {
				System.out.print("Elemento [" + i +" ][" + j + "]:");
				matriz[i][j] = ler.nextInt();	
			}
		}
		// somaDiagonalprincipal
		System.out.println("Elementos da Diagonal Principal: ");
		for(int i =0; i< 3; i++) {
			
			System.out.print(matriz[i] [i] + " ");
			somaDiagoPincipal +=matriz [i] [i] ;
		}
		System.out.println();
		
		// somaDiagonalSecundaria
		System.out.println("Elementos da diagonal Secundaria: ");
		for (int i= 0; i <3; i++){
			System.out.print(matriz[i][2 - i] + " ");
			somaDiagoSecundaria += matriz [i] [2- i];
		}
		System.out.println();
		
		// exibir a soma dos diagonais
		
		System.out.println("Soma dos Elementos da Diagonal Principal: "+ somaDiagoPincipal);
		System.out.println("Soma dos Elementos da Diagonal Secundaria: "+ somaDiagoSecundaria);	

	}

}
