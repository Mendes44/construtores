package program;

import java.util.Locale;
import java.util.Scanner;

import dados.DadosCliente;

public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DadosCliente cliente;

		System.out.println("::::::PROGRAMA BANCO:::::::::");
		System.out.print("Entre com numero da conta: ");
		int conta = sc.nextInt();
		System.out.print("Entre com o Titular da Conta: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Gostaria de fazer um deposito s/n? ");
		char resp = sc.next().charAt(0);

		if (resp == 's') {
			System.out.print("Entre com o valor Inicial de Deposito: ");
			double inicialDeposito = sc.nextDouble();
			cliente = new DadosCliente(nome, conta, inicialDeposito);
		} else {
			cliente = new DadosCliente(nome, conta);
		}

		System.out.println("CONTA ATUALIZADA: ");
		System.out.println(cliente);
		System.out.println();
		System.out.println(">>>>>>>>>>INFORMAÇÕES<<<<<<<<<<");
		System.out.print("DIGITE 's' ou 'n': ");
		resp = sc.next().charAt(0);

		while (resp == 's') {

			System.out.println(">>>>>>>>>>O que deseja Fazer?<<<<<<<<<<");
			System.out.println("1 PARA DEPOSITO - \n2 PARA SAQUE - \n3 PARA SAIR");
			int x = sc.nextInt();
			switch (x) {
			case 1:
				System.out.println(":::::DEPOSITO::::::");
				System.out.print("Entre com o valor do Deposito: ");
				double valorDeposito = sc.nextDouble();
				cliente.Deposito(valorDeposito);
				System.out.println("CONTA ATUALIZADA: ");
				System.out.println(cliente);
				System.out.println();
				break;

			case 2:
				System.out.println(":::::::SAQUE:::::::");
				System.out.print("Entre com o valor do Saque: ");
				double valorSaque = sc.nextDouble();
				cliente.Saque(valorSaque);
				System.out.println("CONTA ATUALIZADA: ");
				System.out.println(cliente);
				System.out.println();
				break;

			default:
				System.out.println("OPÇÃO INVALIDA!!!! \n DIGITE OUTRA OPÇÃO\n");
				break;
			}
			System.out.println("DEJEJA FAZER MAIS ALGUME OPERAÇÃO? s/n >>>> ");
			resp = sc.next().charAt(0);
		}
		System.out.println(">>>>>> OBRIGADO POR USAR NOSSO PROGRAMA! <<<<<<<<<<");

		sc.close();
	}
}
