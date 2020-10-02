package Palindrome;

public class PalindromeTest {
    public static int reverse(int number) {
        String input = Integer.toString(number);
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1.reverse();
        String reverse = input1.toString();
        int result = Integer.parseInt(reverse);
        return result;
    }

    public static boolean isPalindrome(int number) {
        boolean result = false;
        if (number == reverse(number)) result = true;
        return result;

    }

    public static void main(String[] args) {
        int[] numbers = new int[]{456, 11121101, 1001001};
        for (int number : numbers) {
            System.out.println("Number " + number + " is Palindrome: " + isPalindrome(number));
        }

    }
}
