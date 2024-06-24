package conta.model;

public class contaCorrente extends conta {

	private float limite;

	public contaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
//  super refere-se a uma superclasse. Ela indica a chamada ao Método Construtor da superclasse
		super(numero, agencia, tipo, titular, saldo);
//reservada this para diferenciar o Atributo da Classe ContaCorrente do parâmetro do Método Construtor ContaCorrente
		this.limite = limite;
	}
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}

	@Override      //indicando que o Método foi sobrescrito.
	public boolean sacar(float valor) {

		if (this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\nSaldo Insulficiente!");
			return false;
		}

		this.setSaldo(this.getSaldo() - valor);
		System.out.println("Saque realizado com sucesso!!");
		return true;

	}
// super pode ser utilizado na Classe filha pra chamar qualquer Método da Classe pai.
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Limite de Crédito: " + this.limite);
	}
}
