import java.util.Scanner;

public class SelectionSort {

	static int[] selectionSort(int[] inputArray) {
		int arraySize = inputArray.length;
		int tempIndex = 0;
		int temp;
		for(int i = 0 ; i < arraySize; i++) {
			tempIndex =  i;
			for(int j = i+1; j<arraySize; j++) {
				if(inputArray[j] < inputArray[tempIndex]) {
					tempIndex = j;
				}
			}
			temp = inputArray[i];
			inputArray[i] = inputArray[tempIndex];
			inputArray[tempIndex] = temp;
		}
		return inputArray;
	}

	static void printArray(int[] sortedArray) {
		System.out.println("SortedArray :");
		for(int i=0;i<sortedArray.length;i++) {
			System.out.print(sortedArray[i] + " ");

		}
	}

	public static void main(String[] args) {
		int[] input = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array to sort:");
		for(int i = 0; i < 5 ; i++) {
			input[i] = sc.nextInt();
		}
		int[] sorted = selectionSort(input);
		printArray(sorted);
	}
}
