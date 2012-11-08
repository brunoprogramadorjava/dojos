package br.com.dextra;

import java.util.ArrayList;
import java.util.List;


public class XTudo extends Lanche{

	public XTudo() {
		super(ingredientesXTudo());
	}

	private static List<Ingrediente> ingredientesXTudo() {
		List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
		ingredientes.add(Ingrediente.HamburguerCarne);
		ingredientes.add(Ingrediente.HamburguerFrango);
		ingredientes.add(Ingrediente.Bacon);
		ingredientes.add(Ingrediente.Queijo);
		ingredientes.add(Ingrediente.Ovo);
		ingredientes.add(Ingrediente.Alface);

		return ingredientes;
	}
}
