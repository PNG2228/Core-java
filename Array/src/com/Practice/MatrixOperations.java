package com.Practice;
import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns of first matrix: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        System.out.print("Enter rows and columns of second matrix: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        if (r1 == r2 && c1 == c2) {
            int[][] sum = new int[r1][c1];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    sum[i][j] = A[i][j] + B[i][j];
                }
            }
            System.out.println("\nMatrix Addition Result:");
            printMatrix(sum);
        } else {
            System.out.println("\nMatrix addition not possible! Dimensions must be same.");
        }

        if (c1 == r2) {
            int[][] product = new int[r1][c2];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        product[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            System.out.println("\nMatrix Multiplication Result:");
            printMatrix(product);
        } else {
            System.out.println("\nMatrix multiplication not possible! Columns of A must equal rows of B.");
        }

        sc.close();
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
