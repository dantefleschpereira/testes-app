package com.bc.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.bc.entities.Nota;

@SpringBootTest
class TestesAppApplicationTests {

 	@Test
	void deveCalcularMediaCorretamente01() {
		//cenário		
		Nota nota = new Nota();
		nota.setNota1(5.0);
		nota.setNota2(6.0);
		nota.setNota3(7.0);
		
		//ação
		double media = nota.calculaMedia();
		
		//validação
		Assertions.assertEquals(6.3, nota.calculaMedia());
		
	}

	@Test
	void deveCalcularMediaCorretamente02() {
		//cenário		
		Nota nota = new Nota();
		nota.setNota1(5.0);
		nota.setNota2(10.0);
		nota.setNota3(10.0);
				
		//ação
		double media = nota.calculaMedia();
				
		//validação
		Assertions.assertEquals(9.0, nota.calculaMedia());
	}
}
