package com.sistema.relogio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class RelogioApplication {

	public static void main(String[] args) {
		new RelogioApplication().run();
	}

	public void run(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bem-vindo ao Sistema de Relógios!");

		System.out.println("Criando Relógio Brasileiro...");
		RelogioBrasileiro relogioBrasileiro = new RelogioBrasileiro(15, 30, 45);
		System.out.println("Hora no Brasil: " + relogioBrasileiro.getHoraFormatada());

		System.out.println("Criando Relógio Americano...");
		RelogioAmericano relogioAmericano = new RelogioAmericano(15, 30, 45);
		System.out.println("Hora nos EUA: " + relogioAmericano.getHoraFormatada());

		System.out.println("Sincronizando relógio brasileiro com o americano...");
		relogioBrasileiro.sincronizar(relogioAmericano);
		System.out.println("Hora no Brasil após sincronização: " + relogioBrasileiro.getHoraFormatada());

		scanner.close();
	}

}
