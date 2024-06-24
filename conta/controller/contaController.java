package conta.controller;

import java.util.ArrayList;
import conta.model.conta;
import conta.repository.contaRepository;

public class contaController implements contaRepository{
	
		private ArrayList<conta> listaContas = new ArrayList<conta>();
		int numero = 0;
		
	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollection(numero);
		
		if(conta!= null)
			conta.visualizar();
		else
			System.out.println("\nA Conta número: " + numero + " não foi encontrada!");
	}

	@Override
	public void listaTodas() {
		for(var conta : listaContas) {
			conta.visualizar();
		}
		
	}

	@Override
	public void cadastrar(conta conta) {
		listaContas.add(conta);
		System.out.println("\nA conta número: " + conta.getNumero() + " foi criada com sucesso!");
		
	}

	@Override
	public void atualizar(conta conta) {
		var buscaConta = buscarNaCollection(conta.getNumero());
		
		if(buscaConta != null) {
			listaContas.set(listaContas.indexOf(buscaConta), conta);
			System.out.println("\nA Conta numero: " + conta.getNumero() + " foi atualizada com sucesso!");
		}else System.out.println("\nA Conta numero: " + conta.getNumero() + " não foi atualizada!");
	}

	@Override
	public void deletar(int numero) {
	var conta = buscarNaCollection(numero);
	
	if(conta!= null) {
		
		if(listaContas.remove(conta)==true)
			System.out.println("\nA Conta numer: " + numero + " foi deletada com sucesso!");
	}else {
		System.out.println("\nA Conta numero: " + numero + " não foi encontrada!");
	}
		
	}

	
	@Override
	public void sacar(int numero, float valor) {
		var conta = buscarNaCollection(numero);
		
		if(conta != null) {
			
			if(conta.sacar(valor)== true)
				System.out.println("\nO Saque na Conta numero: " + numero + " foi efetuado com sucesso");
		
		}else
			System.out.println("\nA Conta numero: " + numero + " não foi encontrada!");
	}

	@Override
	public void depositar(int numero, float valor) {
		
		var conta = buscarNaCollection(numero);
		
		if(conta != null) {
			 conta.depositar(valor);
			 System.out.println("\nO Deposito na Conta numero: " + numero + " foi efetuado com sucesso!");
		 }else
			 System.out.println("\nA conta numero: " +
					 numero + " não foi encontrada ou a Conta destino não é uma conta Correnete!");
	
	}
	
	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		var contaOrigem = buscarNaCollection(numeroOrigem);
		var contaDestino = buscarNaCollection(numeroDestino);
		
		if(contaOrigem != null && contaDestino != null) {
			
			if(contaOrigem.sacar(valor) == true) {
				contaDestino.depositar(valor);
				System.out.println("\nA Transferencia foi efetuada com sucesso!");
			}
		}else
			System.out.println("\nA Conta de Origem e /ou Destino não foram encontradas!");
	}
	public int gerearNumero() {
		return ++ numero;
	}
	
	public conta buscarNaCollection(int numero) {
		for (var conta: listaContas) {
			if(conta.getNumero() == numero) {
				return conta;
			}
		}
		return null;
	}
}