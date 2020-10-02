package SumDigits;

import java.util.Scanner;

public class SumDigitsTest {
    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        long n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n(integer): ");
        n = sc.nextLong();
        System.out.println("Sum digits of " + n + " :" + sumDigits(n));


    }
}
