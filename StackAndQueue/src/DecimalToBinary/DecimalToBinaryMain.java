package DecimalToBinary;

import java.util.Stack;

public class DecimalToBinaryMain {
    private static void DecToBin(int dec) {
        Stack stack = new Stack();
        String t = "";
        int rem;
        while (dec > 0) {
            rem = dec % 2;
            dec = dec / 2;
            stack.push(rem);
        }
        int n = stack.size();
        for (int i = 0; i < n; i++) {
            System.out.print(stack.pop());
        }
    }

    public static void main(String[] args) {
        int[] decimal = new int[]{12, 15, 17, 22, 1000, 2000};
        for (int dec : decimal) {
            System.out.print("Decimal To Binary " + dec + " :");
            DecToBin(dec);
            System.out.println();
        }

    }
}
