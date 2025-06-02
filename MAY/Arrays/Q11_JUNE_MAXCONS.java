// Java program to find the maximum number of consecutive 1s or 0s
//https://www.geeksforgeeks.org/maximum-consecutive-ones-or-zeros-in-a-binary-array/
public class Q11_JUNE_MAXCONS {
    static int maxConsecutiveCount(int[] arr) {
        int n = arr.length;
        if (n == 0)
            return 0; // edge case

        int maxCount = 0, count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++; //agar same values hae toh count badaoo
            } else {
                maxCount = Math.max(maxCount, count);
                count = 1; //varna set kro count ko 1 se
            }
        }

        return Math.max(maxCount, count);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1 };
        System.out.println(maxConsecutiveCount(arr));
    }
}