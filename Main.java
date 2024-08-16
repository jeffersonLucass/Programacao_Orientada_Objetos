package br.com.jefferson.main;

import br.com.jefferson.animal.Animal;

public class Main {

	public static void main(String[] args) {
		
		Animal  test1 = new Animal("branco",20,"cachorro");
		test1.rugir();
		Animal  test2 = new Animal("branco",20,"gato");
		test2.rugir();
		Animal  test3 = new Animal("branco",20,"Leão");
		test1.exibirDados();
		test2.exibirDados();
		
	}

}
