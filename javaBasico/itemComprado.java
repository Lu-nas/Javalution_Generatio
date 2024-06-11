package javaBasico;

import java.util.Scanner;

public class itemComprado {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String produto = " ";
		double precoUnitario = 0.0;

		System.out.println("Digite o codigo do produto de 1 a 6 : ");
		int codigo = ler.nextInt();
		
		System.out.println("Digite a quantidade comprada: ");
		int quantidade = ler.nextInt();

		// laco switch para determinar o produto com base no código

		switch (codigo) {
		case 1:
			produto = "Cachorro Quente: ";
			precoUnitario = 10.00;
			break;
		case 2:
			produto = "X-Salada";
			precoUnitario = 15.00;
			break;
		case 3:
			produto = "X- Bacom";
			precoUnitario = 18.00;
			break;
		case 4:
			produto = "Bauru";
			precoUnitario = 12.00;
			break;
		case 5:
			produto = "refrigerante";
			precoUnitario = 8.00;
			break;
		case 6:
			produto = "suco de laranja";
			precoUnitario = 13.00;
			break;
		default:
			System.out.println("Codigo do produto invalido. ");
			return;
		// Encerrar o programa caso o codigo seja invalido // Em seguida se for valido
		// Calcula o valor da compra
		}
		double valorTotal = quantidade * precoUnitario;
		System.out.println("\nProduto comprado: " + produto);
		System.out.println("\nvalor totala da conta:" + valorTotal);

		ler.close();
	}

}
