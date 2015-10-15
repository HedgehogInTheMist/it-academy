package string_arrays.hometask08;

import java.util.Random;

public class ArrayInitialization {
	
	public int[][] arrayInit(int n, int m) {
		Random random = new Random();
		int [][] arrayWithZeros= new int[n][m];
		for (int i = 0; i < arrayWithZeros.length; i++) {
			for (int j = 0; j < arrayWithZeros[0].length; j++) {
				arrayWithZeros[i][j] = random.nextInt(10);
			}
		}
		return arrayWithZeros;
	}
}
