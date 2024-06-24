package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.contaController;
import conta.model.contaCorrente;
import conta.model.contaPoupanca;
import conta.util.cores;

public class menu {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		contaController contas = new contaController();

		int opcao, numero, agencia, tipo, aniversario, numeroDestino;
		String titular;
		float saldo,limite, valor;
		
		System.out.println("\nCriar Contas\n");
		
		contaCorrente cc1 = new contaCorrente(contas.gerearNumero(), 123, 1, "João da Silva", 1000f, 100.0f);
		contas.cadastrar(cc1);
		
		contaCorrente cc2 = new contaCorrente(contas.gerearNumero(), 124, 1, "Maria da Silva", 2000f, 100.0f);
		contas.cadastrar(cc2);
		
		contaPoupanca cp1 = new contaPoupanca(contas.gerearNumero(), 125, 2, "Mariana dos Santos", 4000f, 12);
		contas.cadastrar(cp1);
		
		contaPoupanca cp2 = new contaPoupanca(contas.gerearNumero(), 125, 2, "Juliana Ramos", 8000f, 15);
		contas.cadastrar(cp2);
		
		contas.listaTodas();
		

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

			try {
				opcao = ler.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				ler.nextLine();
				opcao = 0;
			}

			if (opcao == 9) {
				System.out.println(cores.TEXT_WHITE_BOLD + "\nBanco do Brazil com Z - O seu Futuro começa aqui! ");
				sobre();
				ler.close();
				System.exit(0);
			}

			try{
				
			
			switch (opcao) {
			case 1:
				System.out.println(cores.TEXT_WHITE_BOLD + "Criar Conta\n\n");
				
				System.out.println("Digite o número da Agência: ");
				agencia = ler.nextInt();
				System.out.println("Digite o Nome do titular: ");
				ler.skip("\\R?");
				titular = ler.nextLine();
				
				do {
					System.out.print("Digite o tipo da Conta (1-CC ou 2-CP): ");
					tipo = ler.nextInt();
				}while(tipo < 1 && tipo > 2);
				
				System.out.println("Digite o Saldo da Conta(R$): ");
				saldo = ler.nextFloat();
				
				switch(tipo) {
				case 1 -> {
					System.out.println("Digite o Limite da Crédito (R$): ");
					limite = ler.nextFloat();
					contas.cadastrar(new contaCorrente(contas.gerearNumero(), agencia, tipo, titular, saldo, limite));
				}
				case 2 ->{
					System.out.println("Digite o dia do Aniversario da Conta: ");
					aniversario = ler.nextInt();
					contas.cadastrar(new contaPoupanca(contas.gerearNumero(), agencia, tipo, titular, saldo, aniversario));
					}
				}
				
				keyPress();
				break;
			case 2:
				System.out.println(cores.TEXT_WHITE_BOLD + "Listar todas as Contas\n\n");
				contas.listaTodas();
				keyPress();
				break;
			case 3:
				System.out.println(cores.TEXT_WHITE_BOLD + "Consultar dados da Conta - por número\n\n");
				
				System.out.println("Digite o númer da conta: ");
				numero = ler.nextInt();
				
				contas.procurarPorNumero(numero);
				keyPress();
				break;
			case 4:
				System.out.println(cores.TEXT_WHITE_BOLD + "Atualizar dados da Conta\n\n");
				
				System.out.println("Digite o número da conta: ");
				numero = ler.nextInt();
				
				var buscarConta  = contas.buscarNaCollection(numero);
				
				if(buscarConta != null) {
					tipo = buscarConta.getTipo();
					System.out.println("Digiete o Numero da Agência: ");
					agencia = ler.nextInt();
					System.out.println("Digite o Nome do titular: ");
					ler.skip("\\R?");
					titular = ler.nextLine();
					
					System.out.println("Digite o Saldo da Conta(R$): ");
					saldo = ler.nextFloat();
					
					switch(tipo) {
					case 1 -> {
						System.out.println("Digite o limite de Crédito (R$): ");
						limite = ler.nextFloat();
						
						contas.atualizar(new contaCorrente(numero, agencia, tipo, titular, saldo, limite));
					}
					case 2 -> {
						System.out.println("Digite o dia do Aniversario da Conta: ");
						aniversario = ler.nextInt();
						
						contas.atualizar(new contaPoupanca(numero, agencia, tipo, titular, saldo, aniversario));
					}
					default ->{
						System.out.println("Tipo de conta invalido!");
					}
					}
				}else {
					System.out.println("A Conta não foi encontrada!");
				}
				keyPress();
				break;
			case 5:
				System.out.println(cores.TEXT_WHITE_BOLD + "Apagar a Conta\n\n");
				
				System.out.println("Digite o número da conta: ");
				numero = ler.nextInt();
				
				contas.deletar(numero);
				
				keyPress();
				break;
			case 6:
				System.out.println(cores.TEXT_WHITE_BOLD + "Saque\n\n");
				
				System.out.println("Digite o numero da conta: ");
				numero = ler.nextInt();
				
				do {
					System.out.println("Digite o Valor do Saque (R$): ");
					valor = ler.nextFloat();
				}while(valor <= 0);
				
				contas.sacar(numero, valor);
				
				keyPress();
				break;
			case 7:
				System.out.println(cores.TEXT_WHITE_BOLD + "Depósito\n\n");
				
				System.out.println("Digite o Numero da conta: ");
				numero = ler.nextInt();
				
				do {
					System.out.println("Digite o Valor do Deposito (R$): ");
					valor = ler.nextFloat();
				}while(valor <= 0);
				
				contas.depositar(numero, valor);
				keyPress();
				break;
			case 8:
				System.out.println(cores.TEXT_WHITE_BOLD + "Tranferencia entre Contas\n\n");

				System.out.println("Digite o Numero da Conta de Origem: ");
				numero = ler.nextInt();
				System.out.println("Digite o Numero da Conta de Destino: ");
				numeroDestino = ler.nextInt();
				
				do {
					System.out.println("Digite o Valor da Transferencia (R$): ");
					valor = ler.nextFloat();
				}while(valor <= 0);
				
				contas.transferir(numero, numeroDestino, valor);
				keyPress();
				break;
			case 9:
				System.out.println(cores.TEXT_RED_BOLD + "\nOpção invalida!\n" + cores.TEXT_RESET);
				keyPress();
				break;

			}
			} catch(InputMismatchException e) {
				System.out.println("Entarda invalida! Por favor, digite um numero inteiro.");
				ler.next();
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

	public static void keyPress() {
		try {
			System.out.println(cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Voce precionou uma tecla diferente de enter!");
		}
	}

}
