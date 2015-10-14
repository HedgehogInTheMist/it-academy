package ThirdLesson.hometask11;

import java.util.Random;
/**
 * Implements matrix initialization
 * @author Hedgehog
 *
 */
public class MatrixInitialization {
	public int[][] arrayInit(int dimention) {
		int[][] matrix = new int [dimention][dimention];
		Random random = new Random();
		for (int i = 0; i < dimention; i++) {
			for (int j = 0; j < dimention; j++) {
				matrix[i][j] = random.nextInt(10);
			}
		}
			return matrix;
	}
}
