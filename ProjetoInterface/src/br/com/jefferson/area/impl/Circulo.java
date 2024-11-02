package br.com.jefferson.area.impl;

import br.com.jefferson.area.AreaCalculavel;

public class Circulo implements AreaCalculavel{

	private double raio;
	
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(raio,2);
	}

}
