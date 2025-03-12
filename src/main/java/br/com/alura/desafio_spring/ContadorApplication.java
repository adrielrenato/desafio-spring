package br.com.alura.desafio_spring;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.util.Scanner;

@SpringBootApplication
public class ContadorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ContadorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Bem vindo ao contador!");
		System.out.println("----------------------");
		System.out.println("Digite um número para contagem: ");
		Scanner entrada = new Scanner(System.in);
		var numero = entrada.nextInt();

		for(int i = 1; i<=numero; i++){
			System.out.print(i + " ");
		}

		Tarefa tarefa = new Tarefa("assistir aula 1", false, "João");
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.writeValue(new File("tarefa.json"), tarefa);
		System.out.println("Dados salvos no arquivo tarefa.json!");
	}
}
