package br.edu.facisa.SelectionSort;

import org.junit.Assert;
import org.junit.Test;

public class SelectionSortTest {

	@Test
	public void testOrdenacao() {

		int array[] = { 5, 3, 6, 1, 4, 2};

		SelectionSort selection = new SelectionSort(array);
		selection.ordenacao();

		int arrayfinal[] = { 1, 2, 3, 4, 5, 6 };
		Assert.assertArrayEquals(arrayfinal, selection.getArrayInterno());
	}
	@Test
	public void testOrdenacao1() {
		
		int array[] = { 5, 7, 6, 10, 4, 1};
		
		SelectionSort selection = new SelectionSort(array);
		selection.ordenacao();
		
		int arrayfinal[] = { 1, 4, 5, 6, 7, 10 };
		Assert.assertArrayEquals(arrayfinal, selection.getArrayInterno());
	}

}
