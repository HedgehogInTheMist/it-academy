package ThirdLesson.hometask04;

public class ArrayInit {
	
	public int[] initArray() {
		int[] array = new int[15];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100);
		}
		return array;
	}
}
