package br.edu.facisa.p3.si.dequeEnc;

public class DequeEncadeada {
	
	protected NoDequeEncadeada inicio;
	
	public DequeEncadeada() {

		this.inicio = null;
	
	}
	
	public void inserirInicio(String valor) {
		
		if (this.inicio == null) {
			this.inicio = new NoDequeEncadeada(valor);
		} else {
			NoDequeEncadeada novoDeque =  new NoDequeEncadeada(valor);
			novoDeque.setProximo(this.inicio);
			this.inicio = novoDeque;
		}
		
	}
	
	public void removerInicio() {

		if (this.inicio != null) {
			this.inicio = this.inicio.getProximo(); 
		} else {
			this.inicio = null;
			
		}
		
	}
	
	public void inserirFinal(String valor) {
		
		NoDequeEncadeada finalDeque = new NoDequeEncadeada(valor);
		NoDequeEncadeada possicaoFinal = getPosicaoFinal();
		possicaoFinal.setProximo(finalDeque);
		
		
	}
	public void removerFinal() {
		
		NoDequeEncadeada dequeInicio = this.inicio;
		NoDequeEncadeada possicaoFinal = getPosicaoFinal();
		while (dequeInicio.getProximo() != possicaoFinal ) {
			dequeInicio = dequeInicio.getProximo();
		}
		dequeInicio.setProximo(null);
		
	}
	
	public NoDequeEncadeada getPosicaoFinal() {

		NoDequeEncadeada dequeInicio = this.inicio;
		while (dequeInicio.getProximo() != null) {
			dequeInicio = dequeInicio.getProximo();
		}
		return dequeInicio;
	}
	public int tamanho() {
		int cont = 1;
		NoDequeEncadeada dequeInicio = this.inicio;
		while (dequeInicio.getProximo() != null) {
			dequeInicio = dequeInicio.getProximo();
			cont++;
		}
		return cont;
	}
	
	
	public NoDequeEncadeada getPosicaoInicial() {
		return this.inicio;
		
	}

}
