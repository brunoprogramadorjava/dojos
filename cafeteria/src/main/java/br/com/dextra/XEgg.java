package br.com.dextra;

import java.util.ArrayList;
import java.util.List;


public class XEgg extends Lanche{

	public XEgg() {
		super(ingredienterXEgg());
	}

	private static List<Ingrediente> ingredienterXEgg() {
		List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
		ingredientes.add(Ingrediente.HamburguerCarne);
		ingredientes.add(Ingrediente.Queijo);
		ingredientes.add(Ingrediente.Ovo);
		ingredientes.add(Ingrediente.Alface);

		return ingredientes;
	}
}
