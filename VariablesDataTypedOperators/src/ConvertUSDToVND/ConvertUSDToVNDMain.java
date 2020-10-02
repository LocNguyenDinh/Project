package ConvertUSDToVND;

import java.util.Scanner;

public class ConvertUSDToVNDMain {

    public static void main(String[] args) {
        int rate = 23000;
        int usdValue;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input USD: ");
        usdValue = scanner.nextInt();
        System.out.println("Convert: " + usdValue + "USD=" + (rate * usdValue) + "VND");

    }
}
