package br.com.jefferson.main;

import br.com.jefferson.observador.Televisao;
import br.com.jefferson.sujeito.EstacaoMeteorologica;

public class Main {

	 public static void main(String[] args) {
	        EstacaoMeteorologica estacao = new EstacaoMeteorologica();
	        Televisao tv = new Televisao();

	        estacao.setObservador(tv);
	        estacao.setTemperatura(25.0f);
	        estacao.setTemperatura(30.0f);
	        estacao.setTemperatura(40.1f);
	    }

}
