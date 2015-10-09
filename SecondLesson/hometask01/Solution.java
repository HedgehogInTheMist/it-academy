package SecondLesson.hometask01;
/**
 * Lesson Two HomeTaskOne;
 * <br>Creates variable type String with any text (not too short).
 * Further displays amount of symbols in the string
 * next divide string in two equal halfs and displays obtained strings on the screen. 
 * 
 * @author Hedgehog
 *
 */
public class Solution {

	public static void main(String[] args) {

				String longString = "Создайте переменную типа String c любым текстом (не сильно короткое)."
						+ " Далее выведите на экран количество символов в данной строке. Далее разделите строку пополам"
						+ " (если ровно поделить не выходит то +-1 не страшно), в результате у вас должно быть 2-е новых "
						+ " переменных типа String с частями из изначальной строки. Полученные строки выведите на экран.";							
				System.out.println("Source string: " + longString + "\n"); 
				System.out.println("Amount of symbols in the source string: " + longString.length() + "\n"); //Calculating quantity of symbols in the source string
				System.out.println("First part of the source string: " + longString.substring(0, longString.length()/2) + "\n");	//Divide source string in two halfs
				System.out.println("Second part of the source string: " + longString.substring(longString.length()/2, longString.length()));				

	}

}
