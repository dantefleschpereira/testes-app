package com.bc.application;

import java.util.Locale;
import java.util.Scanner;

import com.bc.entities.Nota;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestesAppApplication.class, args);

		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Nota nota = new Nota();

        System.out.println("Nota1: ");
        nota.nota1 = sc.nextDouble();

        System.out.println("Nota2: ");
        nota.nota2 = sc.nextDouble();

        System.out.println("Nota3: ");
        nota.nota3 = sc.nextDouble();

        System.out.println("Média = " + nota.calculaMedia());
        sc.close();
	}

}
