package com.capgemini;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 
 * @author altieres.moreira.servulo
 * Essa classe se refere ao teste 2 que valida uma senha de entrada
 *
 */
public class Questao2 {
		
	/**
	 * 
	 * 
	 * Esse � o m�todo principal da classe , o objetivo � receber uma senha de entrada , 
	 * chamar o m�todo de valida��o e printar uma mensagem no log informando se a senha recebida � v�lida
	 *
	 */
	public void executaQuestao2() {
		
		System.out.println("\n**********Executando teste 2**********");
		Questao2 questao2 = new Questao2();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma senha");
		String password = sc.nextLine();
		
		questao2.validaSenha(password);
		
	}
	
	/**
	 * 
	 * @param password Este parametro recebe a senha a ser validada
	 * @return Este m�todo retorna um boolean que define se a senha recebida � v�lida ou n�o
	 */
	
	public  Boolean validaSenha(String password) {
					
		if(validaString(password)) {
			return true;
		}else {
			
			return false;
			
		}
			
	}
	
	/**
	 * 
	 * @param password Este m�todo recebe a senha e faz as valida��es de caracteres faltantes e tamanho da string e depois exibe uma mensagem ao usu�rio
	 * @return Este m�todo retorna um boolean que define se a senha recebida � v�lida ou n�o
	 */
	public  Boolean validaString(String password) {
			
		if(!Pattern.compile("\\d").matcher(password).find()) {
			System.out.println("Senha inv�lida , faltou digitar caracteres n�mericos "+ password);
			return false;
		}
		
		if(!Pattern.compile("[A-Z]").matcher(password).find()) {
			System.out.println("Senha inv�lida , faltou digitar caracteres mai�sculos "+ password);
			return false;
		}
		
		if(!Pattern.compile("[a-z]").matcher(password).find()) {
			System.out.println("Senha inv�lida , faltou digitar caracteres min�sculos "+ password);
			return false;
		}
		
		if(!Pattern.compile("[!@#$%^&*()-+]").matcher(password).find()) {
			System.out.println("Senha inv�lida , faltou digitar caracteres especiais "+ password);
			return false;
		}
		
		if(password.length()<6) {
			System.out.println("Senha inv�lida , a senha deve ter no m�nimo 6 caracteres mas s� tem "+ password.length());
			return false;
		}
		
		System.out.println("Senha validada com sucesso "+ password);
					
		return true;
	}

}
