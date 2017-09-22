package br.edu.facisa.p3.si.dequeEnc;

import org.junit.Assert;
import org.junit.Test;

public class TesteDequeEncadedo {

	@Test
	public void testInserirInicio() {
		
		DequeEncadeada d = new DequeEncadeada();
		d.inserirInicio("a");
		d.inserirInicio("b");
		d.inserirInicio("c");
		
		Assert.assertEquals("c", d.inicio.getDado());
		
		
	}
	@Test
	public void testRemoverInicio() {
		
		DequeEncadeada d = new DequeEncadeada();
		d.inserirInicio("a");
		d.removerInicio();
		
		Assert.assertEquals(null, d.inicio);
		
		
	}
	@Test
	public void testRemoverInicio1() {
		
		DequeEncadeada d = new DequeEncadeada();
		d.removerInicio();
		
		Assert.assertEquals(null, d.inicio);
		
		
	}
	
	@Test
	public void testPosicaoFinal() {
		
		DequeEncadeada d = new DequeEncadeada();
		d.inserirInicio("c");
		d.inserirInicio("b");
		d.inserirInicio("a");
		
		
		Assert.assertEquals("c", d.getPosicaoFinal().getDado());
		
		
	} 
	@Test
	public void testPosicaoInicial() {
		
		DequeEncadeada d = new DequeEncadeada();
		d.inserirInicio("c");
		d.inserirInicio("b");
		d.inserirInicio("a");
		
		
		Assert.assertEquals("a", d.getPosicaoInicial().getDado());
		
		
	} 
	@Test
	public void testTamanho() {
		
		DequeEncadeada d = new DequeEncadeada();
		d.inserirInicio("c");
		d.inserirInicio("b");
		d.inserirInicio("a");
		
		
		Assert.assertEquals(3, d.tamanho());
		
		
	} 
	@Test
	public void testInserirFinal() {
		
		DequeEncadeada d = new DequeEncadeada();
		d.inserirInicio("c");
		d.inserirFinal("b");
		
		Assert.assertEquals("b", d.getPosicaoFinal().getDado());
		
		
	} 
	@Test
	public void testInserirFinal1() {
		
		DequeEncadeada d = new DequeEncadeada();
		d.inserirInicio("c");
		d.inserirFinal("b");
		d.inserirFinal("a");
		
		Assert.assertEquals("a", d.getPosicaoFinal().getDado());
		
		
	} 
	@Test
	public void testRemoverFinal() {
		
		DequeEncadeada d = new DequeEncadeada();
		d.inserirInicio("c");
		d.inserirInicio("b");
		d.inserirFinal("a");
		d.removerFinal();
		
		Assert.assertEquals("c", d.getPosicaoFinal().getDado());
		
		
	} 
	@Test
	public void testTamanho1() {
		
		DequeEncadeada d = new DequeEncadeada();
		d.inserirInicio("c");
		d.inserirInicio("b");
		d.inserirFinal("a");
		d.removerFinal();
		
		Assert.assertEquals(2, d.tamanho());
		
		
	} 

}
