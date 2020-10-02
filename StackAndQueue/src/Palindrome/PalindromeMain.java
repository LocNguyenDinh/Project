package Palindrome;

import java.util.Stack;

public class PalindromeMain {
    private static boolean checkPalindrome(String Palindrome) {
        Stack stack = new Stack();
        String s = "";
        String[] split = Palindrome.split("");
        for (int i = 0; i < Palindrome.length(); i++) {
            stack.push(split[i]);
        }
        for (int i = 0; i < Palindrome.length(); i++) {
            s += stack.pop();
        }
        if (s.equals(Palindrome) == true) return true;
        else return false;
    }

    public static void main(String[] args) {
        String[] s = new String[]{"aba", "abcd", "cddc"};
        for (String check : s) {
            System.out.println(check + " is Palindrome: " + checkPalindrome(check));
        }
    }
}
