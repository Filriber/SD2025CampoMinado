package br.com.serDev.cm.visao;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import br.com.serDev.cm.excecao.ExplosaoException;
import br.com.serDev.cm.excecao.SairException;
import br.com.serDev.cm.modelo.Tabuleiro;

public class TabuleiroConsole {

	private Tabuleiro tabuleiro;
	private Scanner entrada = new Scanner(System.in);

	public TabuleiroConsole(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;

		executarJogo();
	}

	private void executarJogo() {
		try {
			boolean continuar = true;

			while (continuar) {
				cicloDoJogo();

				System.out.println("Outra partida? (S/n) ");
				String resposta = entrada.nextLine();

				if ("n".equalsIgnoreCase(resposta)) {
					continuar = false;
				} else {
					tabuleiro.reiniciar();
				}
			}
		} catch (SairException e) {
			System.out.println("Tchau!");
		} finally {
			entrada.close();
		}
	}

	private void cicloDoJogo() {
		try {

			while (!tabuleiro.objetivoAlcançado()) {
				System.out.println(tabuleiro);

				String digitado = capturarValorDigitado("Digite (x, y): ");
				
				
			Iterator<Integer>xy = Arrays
					.stream(digitado.split(","))
					.map(e -> Integer.parseInt(e.trim())).iterator();
			capturarValorDigitado("Digite (x, y): ");
			System.out.println("1 - Abrir ou 2 - (Des)marcar: ");
			}

			System.out.println("Voce ganhos!");
		} catch (ExplosaoException e) {
			System.out.println("Voce perdeu!");
		}

	}

	private String capturarValorDigitado(String texto) {
		System.out.print(texto);
		String digitado = entrada.nextLine();

		if ("sair".equalsIgnoreCase(digitado)) {
			throw new SairException();
		}
		return digitado;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
