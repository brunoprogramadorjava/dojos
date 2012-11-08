package br.com.dextra.dilicia;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import br.com.dextra.Ingrediente;
import br.com.dextra.LanchePersonalizado;
import br.com.dextra.XBacon;
import br.com.dextra.XEgg;
import br.com.dextra.XFrango;
import br.com.dextra.XTudo;

public class CardapioTest {

	@Test
	public void testPrecosCardapio() {
		Assert.assertEquals(3.2, new XBacon().getPreco(), 0.01);
		Assert.assertEquals(2.7, new XEgg().getPreco(), 0.01);
		Assert.assertEquals(2.1, new XFrango().getPreco(), 0.01);
		Assert.assertEquals(4.9, new XTudo().getPreco(), 0.01);
	}

	@Test
	public void testCarneOvoAlface() {
		ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
		ingredientes.add(Ingrediente.Ovo);
		ingredientes.add(Ingrediente.Alface);
		ingredientes.add(Ingrediente.HamburguerCarne);

		LanchePersonalizado lancheNovo = new LanchePersonalizado(ingredientes);

		Assert.assertEquals(1.9, lancheNovo.getPreco(), 0.01);
	}

	@Test
	public void adicionarIngredienteLancheJaPronto() {
		ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
		ingredientes.add(Ingrediente.Ovo);

		LanchePersonalizado lancheNovo = new LanchePersonalizado(ingredientes);
		Assert.assertEquals(0.5, lancheNovo.getPreco(), 0.01);

		lancheNovo.add(Ingrediente.Alface);
		lancheNovo.add(Ingrediente.HamburguerCarne);

		Assert.assertEquals(1.9, lancheNovo.getPreco(), 0.01);
	}

	@Test
	public void removerIngredienteLancheJaPronto() {
		ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
		ingredientes.add(Ingrediente.Ovo);
		ingredientes.add(Ingrediente.Alface);
		ingredientes.add(Ingrediente.HamburguerCarne);

		LanchePersonalizado lancheNovo = new LanchePersonalizado(ingredientes);
		Assert.assertEquals(1.9, lancheNovo.getPreco(), 0.01);

		lancheNovo.remove(Ingrediente.Alface);
		lancheNovo.remove(Ingrediente.HamburguerCarne);

		Assert.assertEquals(0.5, lancheNovo.getPreco(), 0.01);
	}

	@Test
	public void promocaoDoubleCarneGanhaBacon(){
		ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
		ingredientes.add(Ingrediente.Alface);
		ingredientes.add(Ingrediente.HamburguerCarne);
		ingredientes.add(Ingrediente.Queijo);
		ingredientes.add(Ingrediente.HamburguerCarne);
		ingredientes.add(Ingrediente.Bacon);
		
		Double preco = Ingrediente.Alface.preco() + Ingrediente.Queijo.preco() 
					+ 2* Ingrediente.HamburguerCarne.preco();  
		LanchePersonalizado lancheNovo = new LanchePersonalizado(ingredientes);
		
		Assert.assertEquals(preco , lancheNovo.getPreco(), 0.01);		
	}
	

	@Test
	public void promocaoDoubleCarneSemBacon(){
		ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
		ingredientes.add(Ingrediente.Alface);
		ingredientes.add(Ingrediente.HamburguerCarne);
		ingredientes.add(Ingrediente.Queijo);
		ingredientes.add(Ingrediente.HamburguerCarne);
		
		Double preco = Ingrediente.Alface.preco() + Ingrediente.Queijo.preco() 
					+ 2* Ingrediente.HamburguerCarne.preco();  
		LanchePersonalizado lancheNovo = new LanchePersonalizado(ingredientes);
		
		Assert.assertEquals(preco , lancheNovo.getPreco(), 0.01);		
	}
	

	@Test
	public void promocaoQuatroHamburgueresDeCarneEUmBacon(){
		ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
		ingredientes.add(Ingrediente.Alface);
		ingredientes.add(Ingrediente.HamburguerCarne);
		ingredientes.add(Ingrediente.Queijo);
		ingredientes.add(Ingrediente.HamburguerCarne);
		ingredientes.add(Ingrediente.HamburguerCarne);
		ingredientes.add(Ingrediente.HamburguerCarne);
		ingredientes.add(Ingrediente.Bacon);
		
		Double preco = Ingrediente.Alface.preco() + Ingrediente.Queijo.preco() 
					+ 4 * Ingrediente.HamburguerCarne.preco();  
		LanchePersonalizado lancheNovo = new LanchePersonalizado(ingredientes);
		
		Assert.assertEquals(preco , lancheNovo.getPreco(), 0.01);		
	}
}
