package br.com.jefferson.main;
import br.com.jefferson.transporte.Transporte;
import br.com.jefferson.transporte.impl.Bicicleta;
import br.com.jefferson.transporte.impl.Carro;
import br.com.jefferson.transporte.impl.Onibus;

public class Main {

	public static void main(String[] args) {
		Transporte objcarro = new Carro();
		Transporte objbicicleta = new Bicicleta();
		Transporte objOnibus = new Onibus();
		
		objcarro.mover();
		System.out.println("==============");
		objbicicleta.mover();
		System.out.println("============");
		objOnibus.mover();
		
		
	}

}
