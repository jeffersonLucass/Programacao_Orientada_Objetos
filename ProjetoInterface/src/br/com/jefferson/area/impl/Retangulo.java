package br.com.jefferson.area.impl;

import br.com.jefferson.area.AreaCalculavel;

public class Retangulo implements AreaCalculavel {
	private double largura;
    private double altura;
   
	public Retangulo(double largura, double altura) {
		super();
		this.largura = largura;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		
		return largura * altura; 
	}

}
