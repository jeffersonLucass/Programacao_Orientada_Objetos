package br.com.jefferson.sujeito;

import br.com.jefferson.observador.Observador;

public class EstacaoMeteorologica {
	private Observador observador;
	private float temperatura;
	
	public void setObservador(Observador obs) {
        this.observador = obs;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
        notificarObservador();
    }

    private void notificarObservador() {
        if (observador != null) {
            observador.atualizar(temperatura);
        }
	
    }
	
	
}
