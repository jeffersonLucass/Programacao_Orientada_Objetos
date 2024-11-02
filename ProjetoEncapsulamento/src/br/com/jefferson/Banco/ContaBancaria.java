package br.com.jefferson.Banco;

public class ContaBancaria {
	private double saldo;
	private String titular;
	
	
	public ContaBancaria(double saldo, String titular) {
		super();
		this.saldo = saldo;
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void depositar(double valor) {
		 if (valor > 0) {
	            saldo += valor;
	            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
	        } else {
	            System.out.println("Valor de depósito inválido.");
	        }
	}
	
	public void sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para o saque.");
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }
	
	public void visualizarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
	
	// // VERIFICA SE O NOVO TITULAR NÃO É NULO E NÃO ESTÁ VAZIO APÓS REMOVER ESPAÇOS EM BRANCO.
	public void alterarTitular(String novoTitular) {
	        setTitular(novoTitular);
	        if (novoTitular != null && !novoTitular.trim().isEmpty()) {
	            System.out.println("Titular alterado com sucesso para: " + titular);
	        }
	        else {
	        	System.out.println("Nome do titular invalido.");
	        }
	    }
	
	
}
