package br.com.calculoimc.geral;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa objP = new Pessoa("jefferson",92,1.90);
		System.out.println("Esse é uma pessoa que nao pratica esporte "+objP.calculoIMC());
		Pessoa objA = new Atleta("lucas",92,1.90);
		System.out.println("Esse é um atleta "+objA.calculoIMC());
	}

}
