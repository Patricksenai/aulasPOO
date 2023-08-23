package com.poo.poo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poo.poo.classes.Aluno;
import com.poo.poo.classes.Veiculo;

@SpringBootApplication
public class PooApplication {

	public static void main(String[] args) {
		SpringApplication.run(PooApplication.class, args);

		Aluno aluno1 = new Aluno();

		System.out.println("-------------------------------------");

		System.out.println("Nome do aluno =  " + aluno1.getAluno());
		System.out.println("Nascimento = " + aluno1.getNascimento());
		System.out.println("Matricula  = " + aluno1.getMatricula());
		System.out.println("-------------------------------------");


		

		
		

	}
}
