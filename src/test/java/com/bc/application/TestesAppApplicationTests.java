package com.bc.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.bc.entities.Nota;

@SpringBootTest
class TestesAppApplicationTests {

	@Test
	void deveCalcularMediaCorretamente01() {
		double nota1 = 5.0;
		double nota2 = 6.0;
		double nota3 = 7.0;
		
		Assertions.assertEquals(6.3, Nota.calculaMedia(nota1, nota2, nota3));
		
	}

}
