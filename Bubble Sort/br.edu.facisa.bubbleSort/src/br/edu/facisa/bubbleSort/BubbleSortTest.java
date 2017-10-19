package br.edu.facisa.bubbleSort;

import org.junit.Assert;
import org.junit.Test;




public class BubbleSortTest {

	
	@Test
	public void testOrdenação() {
		int array[] = {2,1,5,3,4};
		
		BubbleSort bubble = new BubbleSort(array, 5);
		bubble.ordenacao();
		
		int arrayfinal[] = {1,2,3,4,5};
		
		Assert.assertArrayEquals(arrayfinal, bubble.getArrayInterno());
		
	}
	
	@Test
	public void testOrdenação1() {
		int array[] = {5,1,5,3,2};
		
		BubbleSort bubble = new BubbleSort(array, 5);
		bubble.ordenacao();
		
		int arrayfinal[] = {1,2,3,5,5};
		
		Assert.assertArrayEquals(arrayfinal, bubble.getArrayInterno());
		
	}
	@Test
	public void testOrdenação2() {
		int array[] = {5,1,5,3,7};
		
		BubbleSort bubble = new BubbleSort(array, 5);
		bubble.ordenacao();
		
		int arrayfinal[] = {1,3,5,5,7};
		
		Assert.assertArrayEquals(arrayfinal, bubble.getArrayInterno());
		
	}

}
