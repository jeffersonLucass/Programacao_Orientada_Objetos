package br.com.jefferson.observador;

public class Televisao implements Observador {

	@Override
	public void atualizar(float temperatura) {
		// TODO Auto-generated method stub
		System.out.println("Televisão: A temperatura atual é  "+temperatura+"°C");
	}
	
}
