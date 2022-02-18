package com.capgemini;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Questao3Test {
	
	@Test
	public void testAnagramaOvo() throws Exception {
		
		assertEquals(2, Questao3.anagrams("ovo"));
	
		
	}
	
	@Test
	public void testAnagramaIfailuhkqq() throws Exception {
		
		assertEquals(3, Questao3.anagrams("ifailuhkqq"));
	
		
	}
	
	

}
