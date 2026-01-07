import java.util.*;

public class Main56 {
	public static void main(String[] args) {
		int[] arr = { 10, 5, 8, 20, 3, 15 };
		Arrays.sort(arr);
		System.out.println("Sorted Array : " + Arrays.toString(arr));
		int SecondSmallest = arr[1];
		int SecondLargest = arr[arr.length - 2];
		System.out.println("Second Smallest : " + SecondSmallest);
		System.out.println("Second Largest : " + SecondLargest);
	}
}
