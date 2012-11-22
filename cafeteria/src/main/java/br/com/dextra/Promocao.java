package br.com.dextra;

public class Promocao {

	private Lanche lanche;
	public static final double PROMOCAO_SEJA_LIGHT_DESC=0.9;
	public static final int PROMOCAO_DOUBLE_CARNE_QTD=2;
	public Promocao(Lanche lanche) {
		this.lanche = lanche;
	}

	public double aplicar(double precoSempromocao) {
		
		if (temPromocaoDoubleCarneGanhaBacon()) {
			return aplicaPromocaoDoubleCarneGanhaBacon(precoSempromocao);
		} else if (temPromocaoSejaLight()) {
			return aplicaPromocaoSejaLight(precoSempromocao);
		} else {
			return precoSempromocao;
		}
	}

	private double aplicaPromocaoSejaLight(double preco) {
		preco = preco * PROMOCAO_SEJA_LIGHT_DESC;
		return preco;
	}

	private boolean temPromocaoSejaLight() {
		return lanche.contarIngrediente(Ingrediente.Alface)>0;
	}

	private double aplicaPromocaoDoubleCarneGanhaBacon(double preco) {
		
		int countHamburguerCarne = lanche.contarIngrediente(Ingrediente.HamburguerCarne);
		int countBacon = lanche.contarIngrediente(Ingrediente.Bacon);
		countHamburguerCarne = countHamburguerCarne / PROMOCAO_DOUBLE_CARNE_QTD;
		
		double precoBacon = Ingrediente.Bacon.preco();
		
		preco -= precoBacon*Math.min(countBacon, countHamburguerCarne);
		return preco;
	}

	private boolean temPromocaoDoubleCarneGanhaBacon() {
		return lanche.contarIngrediente(Ingrediente.HamburguerCarne) >= 2 && lanche.contarIngrediente(Ingrediente.Bacon) >= 1;
	}

	public boolean seAplica() {
		return temPromocaoDoubleCarneGanhaBacon() || temPromocaoSejaLight();
	}
}
