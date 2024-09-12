package interviewQuestions;

public class MaxNum {

	public static void returnMaxVal(int x, int y, int z) {
		if (x > y && x > z) {
			System.out.println("the largest number is: " + x);
		} else if (y > z) {
			System.out.println("the largest number is: " + y);
		} else {
			System.out.println("the largest number is: " + z);
		}
	}

	public static int returnMaxVal(int v, int x, int y, int z) {
		int maxVal = v;

		if (x > maxVal) {
			maxVal = x;
		} if (y > maxVal) {
			maxVal = y;
		} if (z > maxVal) {
			maxVal = z;
		}
		return maxVal;

	}
	
	public static boolean equalNums (int a, int b) {
		if (a == b) 
			return true;
		else 
			return false;
	}

	public static void main(String[] args) {
		returnMaxVal(10, 20, 15);
		int maxValue = returnMaxVal(50, 20, 15, 45);
		System.out.println(maxValue);
		
		int a = 10;
		int b = 10; 
		boolean result = equalNums (a,b);
		System.out.println("the answer is: " + result);

	}
}
