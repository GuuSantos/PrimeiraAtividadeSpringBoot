package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping ("/hello-world")
public class HelloWorldController {
	@GetMapping
	public String helloWorld() {
		return "Hello World!!";
				
	}
	
	@GetMapping("/bsm")
	public String Bsm() {
		return "Mentalidades: "
				+ "\nOrientação ao Futuro"
				+ "\nResponsabilidade Pessoal"
				+ "\nMentalidade de Crescimento"
				+ "\nPersistência"
				+ "\n\nHabilidades:"
				+ "\nTrabalho em Equipe"
				+ "\nAtenção aos Detalhes"
				+ "\nProatividade"
				+ "\nComunicação";	
	}
	
	@GetMapping("/objsemanal")
	public String ObjetivoSemanal() {
		return "Meu principal objetivo dessa semana é sem dúvidas alguma maximizar e aprender ao máximo a teoria sobre CRUD e SPRINGBOOT"
				+ " para conseguir praticar sempre que eu puder e ir treinando um pouco toda semana";
				
	}
	
	
}
