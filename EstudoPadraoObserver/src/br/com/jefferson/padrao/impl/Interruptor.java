package br.com.jefferson.padrao.impl;

import br.com.jefferson.padrao.InterruptorListerner;

public class Interruptor {
	
	
	private InterruptorListerner listerner;
	
	
	public void adicionarListener(InterruptorListerner listerner) {
		this.listerner = listerner;
		
		
	}
	
	public void ligar() {
		listerner.aoligar();
	}
	
	public void desligar() {
		listerner.aodesligar();
	}
	
	
}
