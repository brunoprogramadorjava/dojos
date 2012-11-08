package br.com.dextra;

import java.util.ArrayList;
import java.util.List;

public abstract class Lanche {

	private List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();

	public Lanche(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	private double somarPrecoIngredientes() {
		double calc = 0.0;

		for (Ingrediente ingredientes : this.ingredientes) {
			calc += ingredientes.preco();
		}
		
		return calc;
	}
	
	public int contarIngrediente(Ingrediente ingrediente) {
		int contador = 0;
		for (Ingrediente ingredientes : this.ingredientes) {
			if(ingredientes.equals(ingrediente)) {
				contador++;
			}
		}
		
		return contador;
	}
	
	public double getPreco() {
		int countHamburguerCarne = contarIngrediente(Ingrediente.HamburguerCarne);
		int countBacon = contarIngrediente(Ingrediente.Bacon);
		
		countHamburguerCarne = countHamburguerCarne / 2;
		
		double precoBacon = Ingrediente.Bacon.preco();
		
		return somarPrecoIngredientes() - precoBacon*Math.min(countBacon, countHamburguerCarne);
	}

	public void add(Ingrediente ingrediente){
		this.ingredientes.add(ingrediente);
	}

	public void remove(Ingrediente ingrediente){
		this.ingredientes.remove(ingrediente);
	}
	
	public boolean hasIngrediente(Ingrediente ingrediente){
		return ingredientes.contains(ingrediente);
	}
	

}
