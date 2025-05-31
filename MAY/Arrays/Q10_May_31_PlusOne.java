public class Q10_May_31_PlusOne {
    public static int[] plusOne(int digits[]) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, we can simply increment and return
            if (digits[i] < 9) {
                digits[i]++; // No carry required
                return digits; // return early
            }
            // If the digit is 9, set it to 0 and continue to handle carry
            digits[i] = 0;
            // Carry will be handled in the next iteration
        }
        // If all digits were 9 (e.g., 999), we need an extra digit at the beginning
        // Create a new array with an extra slot, default initialized to 0x
        int newDigits[] = new int[n + 1];
        newDigits[0] = 1; // Set the first digit to 1 (e.g., 999 + 1 = 1000)
        return newDigits;
    }

    public static void main(String[] args) {
        int digits[] = { 1, 2, 3 };
        plusOne(digits);
        for(int num : digits){
            System.out.print(num+" ");
        }
    }
}
