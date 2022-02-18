package com.capgemini;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Questao1Test {
	

	@Test
	public void testNumeroEtapa() throws Exception {
				
		String escadaTeste = Questao1.montaEscada(8);
		
		System.out.println(escadaTeste);
		
	
		
	}
	
}
