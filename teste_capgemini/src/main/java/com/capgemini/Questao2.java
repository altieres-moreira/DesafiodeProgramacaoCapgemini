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
	 * Esse é o método principal da classe , o objetivo é receber uma senha de entrada , 
	 * chamar o método de validação e printar uma mensagem no log informando se a senha recebida é válida
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
	 * @return Este método retorna um boolean que define se a senha recebida é válida ou não
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
	 * @param password Este método recebe a senha e faz as validações de caracteres faltantes e tamanho da string e depois exibe uma mensagem ao usuário
	 * @return Este método retorna um boolean que define se a senha recebida é válida ou não
	 */
	public  Boolean validaString(String password) {
			
		if(!Pattern.compile("\\d").matcher(password).find()) {
			System.out.println("Senha inválida , faltou digitar caracteres númericos "+ password);
			return false;
		}
		
		if(!Pattern.compile("[A-Z]").matcher(password).find()) {
			System.out.println("Senha inválida , faltou digitar caracteres maiúsculos "+ password);
			return false;
		}
		
		if(!Pattern.compile("[a-z]").matcher(password).find()) {
			System.out.println("Senha inválida , faltou digitar caracteres minúsculos "+ password);
			return false;
		}
		
		if(!Pattern.compile("[!@#$%^&*()-+]").matcher(password).find()) {
			System.out.println("Senha inválida , faltou digitar caracteres especiais "+ password);
			return false;
		}
		
		if(password.length()<6) {
			System.out.println("Senha inválida , a senha deve ter no mínimo 6 caracteres mas só tem "+ password.length());
			return false;
		}
		
		System.out.println("Senha validada com sucesso "+ password);
					
		return true;
	}

}
