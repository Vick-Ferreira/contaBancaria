package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Transferencias;

public class ContaBancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Transferencias transferencias; // declarar fora do escopo

		System.out.print("Numero conta do titular:");
		int numeroConta = sc.nextInt();// variavel temporaria
		System.out.print("Por favor, digite o nome do titular:");
		String nomeTitular = sc.next();

		System.out.print("Tem deposito inicial? (y/n)");
		char resp = sc.next().charAt(0);// criada para as opções

		if (resp != 'n') {
			System.out.println("Coloque o valor de deposito inicial: ");
			double valorDepositoInicial = sc.nextDouble();// variavel temporaria
			// utilizando o contrutor de 3 argumentos - sobrecarga-
			transferencias = new Transferencias(nomeTitular, numeroConta, valorDepositoInicial);

		} else {
			// utilizando construtor com 2 argumentos
			transferencias = new Transferencias(nomeTitular, numeroConta);
		}

		System.out.println();// pula linha
		System.out.println("Dados da conta:");
		System.out.println(transferencias); // tostring
		System.out.println();

		// criada para as opções
		int acao = 0;
		while (acao != 3) {// condição de parada
			System.out.printf("O que deseja fazer?  (%d)Deposito, (%d)Saque, (%d)sair", 1, 2, 3);
			acao = sc.nextInt();

			if (acao == 1) {
				System.out.println("ESCOLHEU FAZER DEPOSITO");
				System.out.println("Qual valor quer depositar?");
				double deposito = sc.nextDouble();

				transferencias.ValorSomaDeposito(deposito);// realiza o deposito na conta

				System.out.println("Atualização de dados na conta:");
				System.out.println(transferencias);
				// voltar para a coindição

			} else if (acao == 2) {
				System.out.println("ESCOLHEU FAZER SAQUE");
				System.out.println("Qual o valor do saque?");
				double saque = sc.nextDouble();

				transferencias.ValorSaqueDeposito(saque);

				System.out.println("Atualização DosFileAttributes dados:");
				System.out.println(transferencias);

			} else if (acao == 3) {
				System.out.println("Saindo do sistema...");
			} else {
				System.out.println("Numeros não aceitos!");

			}

		}

		sc.close();

	}

}
