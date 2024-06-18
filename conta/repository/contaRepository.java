package conta.repository;

import conta.model.conta;

public interface contaRepository {
	//CRUD da Conta
	public void procurarPorNumero(int numero);
	public void listaTodas();
	public void cadastrar(conta Conta);
	public void atualizar(conta Conta);
	public void deletar(int numero);
	
	//Metodos Bancários
	public void sacar(int numero, float valor);
	public void depositar(int numero, float valor);
	public void transferir(int numeroOrigem, int numeroDestino, float valor);
}

