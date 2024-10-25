package br.com.jefferson.main;

import br.com.jefferson.veiculo.LigarVeiculo;
import br.com.jefferson.veiculo.VeiculoFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VeiculoFactory objVeiculoFactory = new VeiculoFactory();
		LigarVeiculo carro = objVeiculoFactory.criarVeiculo("carro");
		carro.ligar();
		
		LigarVeiculo moto = objVeiculoFactory.criarVeiculo("moto");
		moto.ligar();
		
		
	}

}
