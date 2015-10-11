//Lesson Three HomeTaskThree;
package ThirdLesson.hometask03;

/**
* Implement three cases of array intialization.
* 
*/
public class Solution {
	
	public static void main(String[] args) {
		System.out.println("1 pre-defined array \n2 fill array from keyboard \n3 array filled randomly \nChoose your variant (1,2 or 3. For quitting type q): ");
		ArrayInitialization arrayInitialization = new ArrayInitialization();
		arrayInitialization.initArray();
	}
}
