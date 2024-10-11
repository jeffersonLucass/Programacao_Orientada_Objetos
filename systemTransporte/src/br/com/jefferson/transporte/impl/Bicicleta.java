package br.com.jefferson.transporte.impl;

import br.com.jefferson.transporte.Transporte;

public class Bicicleta implements Transporte{

	@Override
	public void mover() {
		System.out.println("A bicicleta está sendo pedalada");
		
	}

}
