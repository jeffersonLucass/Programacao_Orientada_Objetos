package br.com.jefferson.main;
import java.util.ArrayList;
import java.util.List;
import br.com.jefferson.area.AreaCalculavel;
import br.com.jefferson.area.impl.Circulo;
import br.com.jefferson.area.impl.Retangulo;
import br.com.jefferson.area.impl.Triangulo;

public class Main {

	public static void main(String[] args) {
		 // Criação de uma lista que armazena objetos do tipo AreaCalculavel
		List<AreaCalculavel> formas = new ArrayList<>();
		// Adicionando diferentes objetos que implementam a interface AreaCalculavel à lista
        formas.add(new Retangulo(5.0, 4.0));
        formas.add(new Circulo(3.0));
        formas.add(new Triangulo(6.0, 2.5));
        
        // Iteração sobre a lista para calcular e exibir a área de cada forma
        for (AreaCalculavel forma : formas) {
            System.out.println("Área calculada: " + forma.calcularArea());
        }

	}

}
