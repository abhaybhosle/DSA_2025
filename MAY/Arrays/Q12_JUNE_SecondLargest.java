
import java.util.*;

public class Q12_JUNE_SecondLargest {
    // brute force
    public static int secondLargestNum(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != arr[n - 1]) {
                return arr[i];
            }
        }
        return -1;
    }

    // Approach 2
    public static int secondLargestNum1(int arr[]) {
        int n = arr.length;
        int largest = -1;
        int secondlargest = -1;
        //Two pass solution
        // Finding the largest number
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[i + 1]) {
                largest = arr[i];
            }
        }

        // Finding the second largest
        for (int i = 0; i < n; i++) {
            if (arr[i] > secondlargest && arr[i] != largest) { // shd != first largest number
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }

    public static int secondLargestNum2(int arr[]) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        if (n < 2) {
            return -1;
        }
        // Optimized in single pass
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i] != largest && arr[i] > secondlargest) {
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 35, 1, 10, 34, 35, 1 };
        int res = secondLargestNum2(arr);
        System.out.println(res);
    }
}
