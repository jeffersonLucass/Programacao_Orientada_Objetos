package br.com.jefferson.Banco;

public class Main {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria(500.0,"João Silva");

        conta.visualizarSaldo();
        
        conta.depositar(200.0);
        conta.visualizarSaldo();

        conta.sacar(100.0);
        conta.visualizarSaldo();

        conta.sacar(700.0); 

        conta.alterarTitular("Maria Oliveira");
        System.out.println("Novo titular: " + conta.getTitular());

	}

}
