package smallestValue;

import java.util.Scanner;

public class smallestValue {

    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Input size: ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Size should not exceed 30");
            }

        } while (size > 30);
        array = new int[size];

    }
}
