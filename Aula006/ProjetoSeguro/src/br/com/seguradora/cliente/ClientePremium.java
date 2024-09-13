package br.com.seguradora.cliente;

public class ClientePremium extends Cliente {
		
	public ClientePremium(String nome) {
		super(nome);
		
	}

	@Override
	public double contratarSeguro(int idade) {
		// TODO Auto-generated method stub
		double valorBase =  super.contratarSeguro(idade);
		double valorComDesconto = valorBase * 0.90;
		
		return valorComDesconto;
	}
	
	//O metodo acima é um polimorfismo,ou seja, sobescreve um metodo ja feito anteriormente em outra classe
	
}
