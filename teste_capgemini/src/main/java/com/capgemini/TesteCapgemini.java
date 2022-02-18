package com.capgemini;

import java.util.Scanner;

public class TesteCapgemini {

	public static void main(String[] args) {

		Questao1 questao1 = new Questao1();
		Questao2 questao2 = new Questao2();
		Questao3 questao3 = new Questao3();

		boolean executarTeste = true;

		do {
			
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("\n\nDigite uma das opcoes para acessar o teste");
				System.out.println("Digite 1 para o primeiro teste - Escadinha");
				System.out.println("Digite 2 para o segundo teste - Validacao de senha ");
				System.out.println("Digite 3 para o terceiro teste - Anagrama ");
				Integer opcaoTeste = sc.nextInt();

					switch (opcaoTeste) {
					case 1:
						questao1.executaQuestao1();
						break;
					case 2:
						questao2.executaQuestao2();
						break;
					case 3:
						questao3.executaQuestao3();
						break;
					default:
						executarTeste = false;
						System.out.println("Opcao Invalida");
					}
			}catch(Exception erro) {
				executarTeste = false;
				System.out.println("Opcao Invalida");
			}
				

		} while (executarTeste);

	}

}
