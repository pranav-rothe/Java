package array;

public class SecondLargestElement {

	public static void main(String[] args) {
		int[] arr = {12, 35, 1, 10, 34, 1};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : arr) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number < largest) {
                secondLargest = number;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Array doesn't have a second largest element.");
        } else {
            System.out.println("Second largest element is: " + secondLargest);
        }

	}

}
