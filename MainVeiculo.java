package br.com.jefferson.main;

import br.com.jefferson.veiculo.Veiculo;

public class Main {

	public static void main(String[] args) {
		//tirar o carro da forma(instanciar)
		
		Veiculo objVeiculo1 = new Veiculo("Fiat","Uno",1997);
		objVeiculo1.acelerar();
		objVeiculo1.freiar();
		
		Veiculo objVeiculo2 = new Veiculo("Chevrolet","Opala",1968);
		objVeiculo2.acelerar();
		objVeiculo2.freiar();
		objVeiculo2.exibirInformacoes();
	}

}
