//Pacote(organizar)
package br.com.jefferson.veiculo;
//Forma(classe)
public class Veiculo {
	//MARCA SO PODE SER VISTO DENTRO DA CLASSE VEICULO
	//Caracteristicas(Atributos,propriedades)
	private String marca;
	private String modelo;
	private int ano;
	
	
	//Serve para inicializar as características(atributos) da classe
	public Veiculo(String marca, String modelo, int ano) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}

	//ações(Metodos)
	public void acelerar() {
		//Comando para imprimir uma mensagem
		System.out.println(modelo+" acelerando...");
		
	}
	
	public void freiar() {
		//Comando para imprimir uma mensagem
		System.out.println(modelo+" freiando");
	}
	public void exibirInformacoes() {
		System.out.println("marca: "+this.marca);
		System.out.println("modelo: "+this.modelo);
		System.out.println("ano: "+this.ano);
	}
}
