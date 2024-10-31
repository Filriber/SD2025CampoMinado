package br.com.serDev.cm;

import br.com.serDev.cm.modelo.Tabuleiro;
import br.com.serDev.cm.visao.TabuleiroConsole;

public class Aplicacao {
	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 7);
		
		new TabuleiroConsole(tabuleiro);
		
		
		
	}
}
