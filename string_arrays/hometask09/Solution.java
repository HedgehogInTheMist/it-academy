package string_arrays.hometask09;

/* Допустим, что существует метод isSubstring, проверяющий, является ли одно слово подстрокой другого.
 * Для двух строк, s1 и s2, напишите код проверки, получена ли строка s2 циклическим сдвигом s1,
 * используя только один вызов метода isSubstring (пример: слово waterbottle получено циклическим сдвигом erbottlewat).
 */

public class Solution {
	public static void main(String[] args) {
		String s1 = "erbottlewat";
		String s2 = "waterbottle";
		char[] chars = s1.toCharArray();
		String temp1 = "", temp2 = "";
		System.out.println(s1);
		for(int i = 0; i < chars.length; i++) {
			temp1 = s1.substring(i, s1.length() - 1);
			temp2 = s1.substring(s1.length() - i, s1.length());
				//if(temp1.equals(s2)) {
			//s1 = temp2 + temp1;
			System.out.println(temp2 + temp1);
				//}
	}
		
	}
}
