package br.com.honda.main;

import br.com.honda.veiculo.Carro;
import br.com.honda.veiculo.Moto;

public class Main {

	public static void main(String[] args) {
		
		Carro objCarro = new Carro("Tesla","Cyber Truck","chumbo",5,5);
		objCarro.acelerar();
		objCarro.freiar();
		objCarro.capota();
		
		System.out.println("================================");
		
		Moto objMoto = new Moto("bmw","B1000","branca","titanio","CR288");
		objMoto.acelerar();
		objMoto.cair();
		objMoto.freiar();
	}

}
