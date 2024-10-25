package br.com.jefferson.main;
import br.com.jefferson.padrao.impl.Interruptor;
import br.com.jefferson.padrao.impl.Luz;

public class Main {

	public static void main(String[] args) {
		
		Interruptor objInterruptor = new Interruptor();
		Luz objLuz = new Luz();
		
		objInterruptor.adicionarListener(objLuz);
		objInterruptor.ligar();
		

	}

}
