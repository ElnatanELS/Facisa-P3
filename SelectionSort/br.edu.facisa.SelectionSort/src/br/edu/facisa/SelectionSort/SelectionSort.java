package br.edu.facisa.SelectionSort;


public class SelectionSort {

	int tamanho;
	int[] arrayInterno = new int[tamanho];

	public SelectionSort(int[] array) {
		this.arrayInterno = array;
		this.tamanho = array.length;
	}

	public void ordenacao() {
		for (int i = 0; i < arrayInterno.length; i++) {
			int maior = arrayInterno[0];
			int pos = 0;
			for (int j = 0; j < arrayInterno.length - i; j++) {
				if (maior < arrayInterno[j]) {
					maior = arrayInterno[j];
					pos = j;

				}
			}
			arrayInterno[pos] = arrayInterno[arrayInterno.length -1 - i];
			arrayInterno[arrayInterno.length -1 - i] = maior;
					
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
