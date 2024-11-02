package br.com.jefferson.Main;

import br.com.jefferson.Veiculo.Caminhao;
import br.com.jefferson.Veiculo.Carro;
import br.com.jefferson.Veiculo.Moto;

public class Main {

	public static void main(String[] args) {
		Carro objCarro = new Carro("Toyota",2024,"Corolla", 4);
		Moto objMoto = new Moto("Honda",2021,"CB 1000",true);
		Caminhao objCaminhao = new Caminhao("Volvo",2023,"FH",20.5);
		
		System.out.println("Informações do carro:");
		objCarro.exibirInformacoes();
		System.out.println("=======================");
		System.out.println("Informações da Moto:");
	    objMoto.exibirInformacoes();
		System.out.println("=======================");
		System.out.println("Informações do Caminhão:");
		objCaminhao.exibirInformacoes();
	}

}
