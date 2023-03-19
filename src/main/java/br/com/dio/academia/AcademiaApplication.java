package br.com.dio.academia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AcademiaApplication {

	public static void main(String[] args) {
		System.out.println("Iniciando aplicação.....");
		
		SpringApplication.run(AcademiaApplication.class, args);
		
		System.out.println("Aplicação iniciada.....");
	}

}
