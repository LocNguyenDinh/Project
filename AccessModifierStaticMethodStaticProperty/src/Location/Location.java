package Location;

import java.util.Scanner;

public class Location {
    private int row;
    private int column;
    private double[][] a;

    public Location() {

    }

    public Location(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public double[][] inputLocation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input row: ");
        row = sc.nextInt();
        System.out.println("Input column: ");
        column = sc.nextInt();
        a = new double[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("a[" + i + "][" + j + "]= ");
                a[i][j] = sc.nextDouble();
            }
        }
        return a;

    }

    public void locateLargest(double[][] a) {
        double max = a[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (a[i][j] > max) {
                    double temp = a[i][j];
                    a[i][j] = max;
                    max = temp;
                }
            }
        }
        System.out.println("Location Largest:" + max);
    }

}
