package entities;



//herança da SUPERCLASS
public class BusinessAccount extends Account {
	
	private Double loanLimit;


	public BusinessAccount() {
		// TODO Auto-generated constructor stub
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
		
	}

	
	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount); // usando o withdraw da superclasse
		balance -= 2.0; 
	}
	
	
	//emprestando dinheiro que vai entra na conta
	public void loan(Double amont) {
		if(amont <= loanLimit) { // testanto se o valor que quero empresta é menor ou igual ao meu limite de emprestimo
			balance = balance + amont - 10.00;  //saldo + emprestimo + juros
	  }
	}
	
}
