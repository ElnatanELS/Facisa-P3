package br.edu.facisa.bubbleSort;

public class BubbleSort {

	int tamanho;
	int[] arrayInterno = new int[5];

	public BubbleSort(int[] array, int tamanho) {

		this.arrayInterno = array;
		this.tamanho = tamanho;
	}

	public void ordenacao() {
		for (int j = 0; j < arrayInterno.length; j++) {
			int quard = 0;
			for (int i = 0; i < arrayInterno.length - 1 - j; i++) {
				if (arrayInterno[i] > arrayInterno[i + 1]) {
					quard = arrayInterno[i + 1];
					arrayInterno[i + 1] = arrayInterno[i];
					arrayInterno[i] = quard;
				}
			}
		}

	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public void setArrayInterno(int[] arrayInterno) {
		this.arrayInterno = arrayInterno;
	}

	public int getTamanho() {
		return tamanho;
	}

	public int[] getArrayInterno() {
		return arrayInterno;
	}
}
