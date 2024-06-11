package javaBasico;

import java.util.Locale;
import java.util.Scanner;

public class reajusteSalaroSwitch {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.ROOT);
		String cargo;
		float percentualReajust = 0.0f;

		System.out.println("Digite o nome do colaborador: ");
		String nome = ler.nextLine();

		System.out.println("\nDigite o codigo do cargo (1 a 6) ");
		int codiCargo = ler.nextInt();

		System.out.print("\nDigite o salario atual: ");
		float salario = ler.nextFloat();

		// exibiçao cargo e do percentual de reajuste com base no código
		switch (codiCargo) {
		case 1:
			cargo = "Gerente";
			percentualReajust = 0.10f;
			break;
		case 2:
			cargo = "Vendedor";
			percentualReajust = 0.07f;
			break;
		case 3:
			cargo = "Supervisor";
			percentualReajust = 0.09f;
			break;
		case 4:
			cargo = "Motorista";
			percentualReajust = 0.06f;
			break;
		case 5:
			cargo = "Estoquista";
			percentualReajust = 0.05f;
			break;
		case 6:
			cargo = "técnico de TI";
			percentualReajust = 0.08f;
			break;
		default:
			System.out.println("O Codigo de cargo informado  invalido.");
			ler.close();
			return;
		}
		// resultados exibidos
		float aumento = salario * percentualReajust;
		float novoSalario = salario + aumento;
		System.out.println("\nNome do colaborador: " + nome);
		System.out.println("\nCargo: " + cargo);
		System.out.println("\nNovo salario: " + novoSalario);
		ler.close();

	}

}
