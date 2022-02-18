package com.capgemini;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class Questao2Test {
		
	@InjectMocks
	Questao2 questao2;
	
	
	@Test
	public void testSenhaSemNumero() throws Exception {
		
		assertEquals(false, questao2.validaSenha("Thor%J"));
	
		
	}
	
	@Test
	public void testSenhaSemCaractereEspecial() throws Exception {
		
		assertEquals(false, questao2.validaSenha("Thor9P"));
	
		
	}
	
	@Test
	public void testSenhaSemLetraMaiuscula() throws Exception {
		
		assertEquals(false, questao2.validaSenha("thor9&"));
	
		
	}
	
	@Test
	public void testSenhaSemLetraMinuscula() throws Exception {
		
		assertEquals(false, questao2.validaSenha("THOR9&"));
	
		
	}
	
	@Test
	public void testSenhaMenorQue6Caracteres() throws Exception {
		
		assertEquals(false, questao2.validaSenha("THOR9"));
	
		
	}
	
	@Test
	public void testSenhaValida() throws Exception {
		
		assertEquals(true, questao2.validaSenha("Thor9%"));
	
		
	}
}
