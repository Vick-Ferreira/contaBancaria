package entidade;

public class Transferencias {

	// por serem privados precisamos do getters e setters
	private String nomeTitular;
	private int numeroConta;// nunca pode ser alterado
	private double valorInicial; // inicia 0

	// contrutor
	public Transferencias(String nomeTituar, int numeroConta) {
		this.nomeTitular = nomeTituar;
		this.numeroConta = numeroConta;

	}

	public Transferencias(String nomeTituar, int numeroConta, double valorDepositoInicial) {
		this.nomeTitular = nomeTituar;
		this.numeroConta = numeroConta;
		ValorSomaDeposito(valorDepositoInicial);
	}

	// metodos get e set
	public int getNumeroConta() { // apenas recuperar
		return numeroConta;
	}

	public double getValorInical() { // apenas recuperar
		return valorInicial;
	}

	public String getNomeTitular() {// recuperar
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {// atualizar
		this.nomeTitular = nomeTitular;
	}

	public void ValorSomaDeposito(double deposito) {// so aumenta por meio de deposito
		valorInicial += deposito;

	}

	public void ValorSaqueDeposito(double deposito) {
		valorInicial -= deposito + 5.00;
	}

	public String toString() {
		return "Conta " + numeroConta + ", Titular: " + nomeTitular + ", Valor inicias: R$ "
				+ String.format("%.2f", valorInicial);
	}
}
