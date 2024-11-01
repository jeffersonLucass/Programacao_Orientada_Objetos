package br.com.jefferson.gerenciamentoPagamento;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diretor objDiretor = new Diretor("lucas",2000,0.75);
		Gerente objGerente = new Gerente("Luiz",1000,0.50);
		System.out.println(objDiretor.calcularSalario());
		System.out.println(objGerente.calcularSalario());
		
	}

}
