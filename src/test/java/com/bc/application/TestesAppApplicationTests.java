package com.bc.application;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.bc.entities.Nota;

@SpringBootTest
class TestesAppApplicationTests {

	@Test
	void deveCalcularMediaCorretamente01() {
		// cenário
		Nota nota = new Nota();
		nota.setNota1(5.0);
		nota.setNota2(6.0);
		nota.setNota3(7.0);

		// ação
		double media = nota.calculaMedia();

		// validação
		Assertions.assertEquals(6.3, nota.calculaMedia());

	}

	@Test
	void deveCalcularMediaCorretamente02() {
		// cenário
		Nota nota = new Nota();
		nota.setNota1(5.0);
		nota.setNota2(10.0);
		nota.setNota3(10.0);

		// ação
		double media = nota.calculaMedia();

		// validação
		Assertions.assertEquals(9.0, nota.calculaMedia());
	}

	@Test
	void deveCalcularMediaCorretamente03() {
		// cenário
		Nota nota = new Nota();
		nota.setNota1(10.0);
		nota.setNota2(10.0);
		nota.setNota3(5.0);

		// ação
		double media = nota.calculaMedia();

		// validação
		Assertions.assertEquals(7.5, nota.calculaMedia());
	}

	@Test
	void deveCriarNotaComSucesso() {
		// cenário
		Nota nota = new Nota();

		// ação
		nota.setNota1(5.0);
		nota.setNota2(6.0);
		nota.setNota3(7.0);

		// validação
		Assertions.assertNotNull(nota);

	}

	@Test
	void deveCriarNotaPositiva() {
		// cenário
		Nota nota = new Nota();

		// ação
		nota.setNota1(5.0);
		nota.setNota2(6.0);
		nota.setNota3(7.0);

		// validação
		assertThat(nota.nota1, greaterThanOrEqualTo(0.0));
		assertThat(nota.nota2, greaterThanOrEqualTo(0.0));
		assertThat(nota.nota3, greaterThanOrEqualTo(0.0));
	}

	@Test
	void deveCriarNotaMenorOuIgualDez() {
		// cenário
		Nota nota = new Nota();

		// ação
		nota.setNota1(5.0);
		nota.setNota2(6.0);
		nota.setNota3(7.0);

		// validação
		assertThat(nota.nota1, lessThanOrEqualTo(10.0));
		assertThat(nota.nota2, lessThanOrEqualTo(10.0));
		assertThat(nota.nota3, lessThanOrEqualTo(10.0));
	}

}
