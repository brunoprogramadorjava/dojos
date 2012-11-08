package br.com.dextra;

import java.util.ArrayList;
import java.util.List;


public class XFrango extends Lanche{

	public XFrango() {
		super(ingredientesXFrango());
	}

	private static List<Ingrediente> ingredientesXFrango() {
		List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
		ingredientes.add(Ingrediente.HamburguerFrango);
		ingredientes.add(Ingrediente.Queijo);
		ingredientes.add(Ingrediente.Alface);

		return ingredientes;
	}
}
