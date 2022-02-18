package com.capgemini;

import java.util.Scanner;

/**
 * 
 * @author altieres.moreira.servulo
 * Essa classe se refere ao teste 1 que printa uma escada na tela
 *
 */
public class Questao1 {
	
	/**
	 * 
	 * Este é o método principal da classe , o objetivo dele é receber 
	 * um valor para "n" e montar uma escada de espaços e asteriscos 
	 * e mostrar no log a escada de acordo com o número recebido.
	 * 
	 *
	 */
	public void executaQuestao1() {
		
		System.out.println("\n********Executando teste 1**************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de n para montar a escada ");
		Integer n = sc.nextInt();
		
		
		System.out.println(montaEscada(n));
		
	}
	
	/**
	 * 
	 * @param n Esse valor se refere ao tamanho da escada a ser montada
	 * @return Este método retorna linhas do tipo string com a escada montada
	 */
	public static String montaEscada(Integer n) {

		StringBuffer stringBuffer = new StringBuffer();

		for (int i = 1; i <= n; i++) {

			for (int j = n - i; j > 0; j--) {

				stringBuffer.append(" ");
			}

			for (int j = 1; j <= i; j++) {

				stringBuffer.append("*");
			}

			stringBuffer.append("\n");
		}

		return stringBuffer.toString();

	}

}
	

