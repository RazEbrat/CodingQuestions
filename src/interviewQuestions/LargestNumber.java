package interviewQuestions;

public class LargestNumber {

	public static void main(String[] args) {

		// declare a single dimension array of type int
		int[] num = { 2, 78, 25, 44, 56, 10, 78 };

		// find the largest, second largest, smallest, second smallest, sum and average
		// in the give array

		int largest = num[0];
		int secondLargest = num[0];

		int smallest = num[0];
		int secondSmallest = Integer.MAX_VALUE;

		int sum = 0;
		double average = 0;

		for (int i = 0; i < num.length; i++) {

			if (num[i] > largest) {
				largest = num[i];
			}
			if (num[i] > secondLargest && num[i] < largest) {
				secondLargest = num[i];
			}
			if (num[i] < smallest) {
				smallest = num[i];
			}
			if (num[i] < secondSmallest && num[i] > smallest) {
				secondSmallest = num[i];
			}
			sum += num[i];
			average = (double) sum / num.length;
		}
		System.out.println("the largest number is " + largest);
		System.out.println("the second largest number is " + secondLargest);
		System.out.println("the  smallest number is " + smallest);
		System.out.println("the  scond smallest number is " + secondSmallest);
		System.out.println("the sum of the array is " + sum);
		System.out.println("the average of the array is " + average);

	}

}
