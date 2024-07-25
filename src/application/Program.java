package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		//usando o withdraw do Account
		Account sub = new Account(900, "Alex", 1000.0);
		sub.withdraw(200.0); //pega o bjeto e faz saque de 200.0
		System.out.println(sub.getBalance());
		
		//usando o withdraw do Savings, a SOBREPOSIÇÃO  - SEM TAXA DE JUROS DIFERENTE DA OPERAÇÃO DO ACCAUT
		Account sub1 = new SavingsAccount(1000, "Eduarda", 1000.0, 0.01);
		sub1.withdraw(200.0);
		System.out.println(sub1.getBalance());
		
		Account sub2 = new BusinessAccount(800, "Bob", 1000.0, 500.0);
		sub2.withdraw(200.0);
		System.out.println(sub2.getBalance());
		
	
		
		
		//POLIMOSFISMO 
		//varias formas, mesma operação MAS com comportamento diferente,
		Account x = new Account(1020,"Alex", 1000.0);
		Account y = new SavingsAccount(1030, "Alexandre", 1000.0, 0.01);		
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
		
		
		
		//intanciando um novo objeto
		Account acc = new Account(1001,"Alex", 0.0);//conta, recebe conta e os dados
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);//conta empresa recebe contra empresa com os dados
		
		//UMA CONTA EMPRESARIAL , É UMA CONTA  - (É UM)
		
		//UPCASTING  converter um objeto da SUBclass para SUPERclass
		//o tipo dessas variaveis são ACCOUNT
		Account acc1 = bacc; //subclasse é atribuido a uma variavel da superclass
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.00);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		
		//converter objeto da SUPERclasse para SUBclasse
		//DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount) acc2;
		
		
		
		//se o que estiver na var acc3 for um obj que seja instancia BusinessAccount ai faz o casting
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Emprestimo feito!");
		}
		//se o acc3 for instancia de SavingAccount
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("update");
		}
		
		
		
	}

}
