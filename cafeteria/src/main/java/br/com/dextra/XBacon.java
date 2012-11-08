package br.com.dextra;

import java.util.ArrayList;
import java.util.List;

public class XBacon extends Lanche{

	public XBacon() {
		super(ingredientesXBacon());
	}

	private static List<Ingrediente> ingredientesXBacon() {
		List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
		ingredientes.add(Ingrediente.HamburguerCarne);
		ingredientes.add(Ingrediente.Bacon);
		ingredientes.add(Ingrediente.Queijo);
		ingredientes.add(Ingrediente.Alface);
		return ingredientes;
	}
}
