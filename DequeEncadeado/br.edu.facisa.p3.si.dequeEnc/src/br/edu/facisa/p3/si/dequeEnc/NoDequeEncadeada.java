package br.edu.facisa.p3.si.dequeEnc;

public class NoDequeEncadeada {

	private String dado;

	protected NoDequeEncadeada proximo;

	public NoDequeEncadeada(String dado) {

		this.dado = dado;
		this.proximo = null;

	}
	
	public void setProximo(NoDequeEncadeada proximo) {
		this.proximo = proximo;
	}
	
	public NoDequeEncadeada getProximo() {
		return proximo;
	}

	public String getDado() {
		return dado;
	}

	public void setDado(String dado) {
		this.dado = dado;
	}
	
	
}
