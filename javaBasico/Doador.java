package javaBasico;

import java.util.Scanner;

public class Doador {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.print("Informe o nome do Doador: ");
		String nome = ler.next();
		System.out.print("Informe a idade do Doador: ");
		int idade = ler.nextInt();

		System.out.print("É a primeira doação de sangue? ");
		boolean primeiraDoacao = ler.nextBoolean();
		
		boolean aptoDoar = verificaAptidao(idade, primeiraDoacao);
		if (aptoDoar) {
			System.out.println(nome + " está apto(a) para doar sangue!");
		} else {
			System.out.println(nome + " NÃO esta apto para doar sangue!");
		}

		ler.close();
	}

	private static boolean verificaAptidao(int idade, boolean primeiraDoacao) {
		if (idade >= 18 && idade <= 60) {
			if (idade < 50 || primeiraDoacao) {
				return true;
			}
		}
		return false;
	}
}