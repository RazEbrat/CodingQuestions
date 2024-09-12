package interviewQuestions;

public class MultipleIfStatements {

	/*
	 * If statements are executed independent of one another; each one will run.
	 * Else if statements only execute if the previous if fails.
	 */

	public static void main(String[] args) {

		int x = 0;

		if (x == 0) {
			System.out.println("x is zero");
		}
		if (x >= 0) {
			System.out.println("x is great than and equal to zero");
		}
		if (x <= 0) {
			System.out.println("x is less than and equal to zero");
		}

		if (x == 0) {
			System.out.println("x is zero");
		} else if (x >= 0) {
			System.out.println("x is great than and equal to zero");
		} else {
			System.out.println("x is les than and equal to zero");
		}
		
		//Ternary Operator
		int firstNum = 10;
		int secNum = 20;
		
		int miniNum= (firstNum>secNum) ? secNum: firstNum;
		System.out.println(miniNum);
		
		//if-else statement 
		if (firstNum>secNum) 
			System.out.println(secNum);
		 else 
			System.out.println(firstNum);
		
	}
}
