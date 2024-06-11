package javaBasico;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CalculadoraSwitch {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.ROOT);
		
		float resultado = 0;
		char continuar = 0;

		System.out.print("Digite o primeiro numero: ");
		float numero1 = ler.nextFloat();
		System.out.print("Digite o segundo numero: ");
		float numero2 = ler.nextFloat();

		// leitura do codigo
		System.out.println("Escolha o codigo da operação (1: soma, 2: Multiplicação, 3:Subtraçao, 4: Divisão: )");
		int codigoOperacao = ler.nextInt();

		// executando OP

		switch (codigoOperacao) {
		case 1:
			resultado = numero1 + numero2;
			System.out.println(numero1 + " + " + numero2 + " = " + resultado);

			break;
		case 2:
			resultado = numero1 - numero2;
			System.out.println(numero1 + "_" + numero2 + "=" + resultado);
			break;
		case 3:
			resultado = numero1 * numero2;
			System.out.println(numero1 + "*" + numero2 + "=" + resultado);
			break;

		// verificar se o divisor é difernte de zero
		case 4:
			if (numero2 != 0) {
				resultado = numero1 / numero2;
				System.out.println(numero1 + "/" + numero2 + "=" + resultado);
			} else {
				System.out.println("NÃO é possivel fazer um divisão por zero.");
				// continue ;
			}
			break;
		default:
			System.out.println("Operação invalida!");

		}
	}
}
