package com.capgemini;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * @author altieres.moreira.servulo
 * Esta classe se refere ao teste 3 no qual está implementado o método que 
 * recebe uma string e calcula a quantidade de anagramas
 *
 */
public class Questao3  {
	
	/**
	 * O objetivo do método principal é receber a string de entrada e chamar o método que 
	 *  calcula os anagramas pares para depois printar no log a quantidade de anagramas 
	 * 
	 */
	 public void executaQuestao3 () {
	        
		System.out.println("\n************Executando teste 3****************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma string");
		String string = sc.nextLine();
					
		int result = Questao3.anagrams(string);

		System.out.println("A quantidade de anagramas para a string " + string + " e "+ result );
	               

	}
	 
	 /**
	  * 
	  * @param s O parametro de entrada é a string no qual vai ser extraída os anagramas pares
	  * @return é a quantidade de anagramas calculados a partir da string de entrada 
	  */
	static int anagrams(String s) {
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				char[] c = s.substring(i, j + 1).toCharArray();
				Arrays.sort(c);
				String k = new String(c);

				if (hashMap.containsKey(k)) {
					hashMap.put(k, hashMap.get(k) + 1);
				} else {
					hashMap.put(k, 1);
				}
			}
		}

		int anagramPairs = 0;
		for (String k : hashMap.keySet()) {
			int v = hashMap.get(k);
			anagramPairs += (v * (v - 1)) / 2;
		}

		return anagramPairs;

	}

}

   
	
	
   

