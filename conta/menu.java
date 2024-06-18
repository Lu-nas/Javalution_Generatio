package conta;

import java.util.Scanner;
import conta.model.conta;
import conta.model.contaCorrente;
import conta.model.contaPoupanca;
import conta.util.cores;

public class menu {

	public static void main(String[] args) {
// Teste da Classe conta
		conta c1 = new conta(1, 123, 1, "Adriana", 10000.0f);
		c1.visualizar();
		c1.sacar(12000.0f);
		c1.visualizar();
		c1.depositar(5000.0f);
		c1.visualizar();
		
		// Teste da Classe contaCorrente
		contaCorrente cc1 = new contaCorrente(2, 123, 1, "Mariana", 15000.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
		
		// Teste da Classe contaPoupanca
		contaPoupanca cp1 = new contaPoupanca(3, 123, 2,"Vitor", 10000.0f, 15);
		cp1.visualizar();
		cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();
		
		Scanner ler = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println(
					cores.TEXT_YELLOW + cores.ANSI_BLACK_BACKGROUND + "**********************************  	");
			System.out.println("						   				");
			System.out.println("	BANCO DO BRAZIL COM Z  				");
			System.out.println("						   				");
			System.out.println("****************************************");
			System.out.println("						   				");
			System.out.println("	1- Criar Conta		   				");
			System.out.println("	2- Listar todas as Contas			");
			System.out.println("	3- Buscar contas por Numero			");
			System.out.println("	4- Atualizar os Dados da Conta		");
			System.out.println("	5- Apagar Conta						");
			System.out.println("	6- Sacar							");
			System.out.println("	7- Depositar						");
			System.out.println("	8- Transferir valores entre Contas	");
			System.out.println("	9- Sair								");
			System.out.println("										");
			System.out.println("****************************************");
			System.out.println("Entre com a opção desejada: 			");
			System.out.println("										" + cores.TEXT_RESET);

			opcao = ler.nextInt();

			if (opcao == 9) {
				System.out.println(cores.TEXT_WHITE_BOLD + "\nBanco do Brazil com Z - O seu Futuro começa aqui! ");
				sobre();
				ler.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				
				System.out.println(cores.TEXT_WHITE_BOLD + "Criar Conta\n\n");

				break;
			case 2:
				System.out.println(cores.TEXT_WHITE_BOLD + "Listar todas as Contas\n\n");

				break;
			case 3:
				System.out.println(cores.TEXT_WHITE_BOLD + "Consultar dados da Conta - por número\n\n");

				break;
			case 4:
				System.out.println(cores.TEXT_WHITE_BOLD + "Atualizar dados da Conta\n\n");
				break;
			case 5:
				System.out.println(cores.TEXT_WHITE_BOLD + "Apagar a Conta\n\n");

				break;
			case 6:
				System.out.println(cores.TEXT_WHITE_BOLD + "Saque\n\n");

				break;
			case 7:
				System.out.println(cores.TEXT_WHITE_BOLD + "Depósito\n\n");

				break;
			case 8:
				System.out.println(cores.TEXT_WHITE_BOLD + "Tranferencia entre Contas\n\n");

				break;
			case 9:
				System.out.println(cores.TEXT_RED_BOLD + "\nOpção invalida!\n" + cores.TEXT_RESET);
				break;

			}

		}

	}

	private static void sobre() {
		System.out.println("\n**********************************************");
		System.out.println("Projeto desenvolvido por: Luana Silva");
		System.out.println("Generation Brasil - luana.ss9497@gmail.com");
		System.out.println("github.com/Lu-nas/Javalution_Generation");
		System.out.println("\n**********************************************");

	}

}
