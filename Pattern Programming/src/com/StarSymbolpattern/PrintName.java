package com.StarSymbolpattern;
import java.util.Scanner;

public class PrintName {
    public static String getRow(char ch, int i) {
        String row = "";
        switch (ch) {
            case 'A':
                for (int j = 0; j < 7; j++)
                    row += (i == 0 && j != 0 && j != 6) || (i == 3) || (j == 0 && i != 0) || (j == 6 && i != 0) ? "*" : " ";
                break;
            case 'B':
                for (int j = 0; j < 7; j++)
                    row += (j == 0 || (i == 0 && j < 6) || (i == 3 && j < 6) || (i == 6 && j < 6) || (j == 6 && i != 0 && i != 3 && i != 6)) ? "*" : " ";
                break;
            case 'C':
                for (int j = 0; j < 7; j++)
                    row += (i == 0 && j > 0) || (i == 6 && j > 0) || (j == 0 && i > 0 && i < 6) ? "*" : " ";
                break;
            case 'D':
                for (int j = 0; j < 7; j++)
                    row += (j == 0) || (j == 6 && i != 0 && i != 6) || (i == 0 && j < 6) || (i == 6 && j < 6) ? "*" : " ";
                break;
            case 'E':
                for (int j = 0; j < 7; j++)
                    row += (j == 0) || (i == 0) || (i == 3) || (i == 6) ? "*" : " ";
                break;
            case 'F':
                for (int j = 0; j < 7; j++)
                    row += (j == 0) || (i == 0) || (i == 3) ? "*" : " ";
                break;
            case 'G':
                for (int j = 0; j < 7; j++)
                    row += (i == 0 && j > 0) || (i == 6 && j > 0) || (j == 0 && i > 0 && i < 6) || (i >= 3 && j == 6) || (i == 3 && j >= 4) ? "*" : " ";
                break;
            case 'H':
                for (int j = 0; j < 7; j++)
                    row += (j == 0) || (j == 6) || (i == 3) ? "*" : " ";
                break;
            case 'I':
                for (int j = 0; j < 7; j++)
                    row += (i == 0 || i == 6 || j == 3) ? "*" : " ";
                break;
            case 'J':
                for (int j = 0; j < 7; j++)
                    row += (i == 0) || (j == 3 && i < 6) || (i == 6 && j < 3) || (j == 0 && i > 4) ? "*" : " ";
                break;
            case 'K':
                for (int j = 0; j < 7; j++)
                    row += (j == 0) || (i + j == 6 && i >= 3) || (i - j == 0 && i < 4) ? "*" : " ";
                break;
            case 'L':
                for (int j = 0; j < 7; j++)
                    row += (j == 0 || i == 6) ? "*" : " ";
                break;
            case 'M':
                for (int j = 0; j < 7; j++)
                    row += (j == 0 || j == 6 || (i == j && i < 4) || (i + j == 6 && i < 4)) ? "*" : " ";
                break;
            case 'N':
                for (int j = 0; j < 7; j++)
                    row += (j == 0 || j == 6 || i == j) ? "*" : " ";
                break;
            case 'O':
                for (int j = 0; j < 7; j++)
                    row += (i == 0 && j > 0 && j < 6) || (i == 6 && j > 0 && j < 6) || (j == 0 && i > 0 && i < 6) || (j == 6 && i > 0 && i < 6) ? "*" : " ";
                break;
            case 'P':
                for (int j = 0; j < 7; j++)
                    row += (j == 0) || (i == 0 && j < 6) || (i == 3 && j < 6) || (j == 6 && i < 3 && i != 0) ? "*" : " ";
                break;
            case 'Q':
                for (int j = 0; j < 7; j++)
                    row += (i == 0 && j > 0 && j < 6) || (i == 6 && j > 0 && j < 6) || (j == 0 && i > 0 && i < 6) || (j == 6 && i > 0 && i < 6) || (i - j == 1 && i > 3) ? "*" : " ";
                break;
            case 'R':
                for (int j = 0; j < 7; j++)
                    row += (j == 0 || (i == 0 && j < 6) || (i == 3 && j < 6) || (j == 6 && i < 3 && i != 0) || (i - j == 3)) ? "*" : " ";
                break;
            case 'S':
                for (int j = 0; j < 7; j++)
                    row += (i == 0 && j > 0) || (i == 3 && j > 0 && j < 6) || (i == 6 && j < 6) || (j == 0 && i < 3 && i > 0) || (j == 6 && i > 3 && i < 6) ? "*" : " ";
                break;
            case 'T':
                for (int j = 0; j < 7; j++)
                    row += (i == 0 || j == 3) ? "*" : " ";
                break;
            case 'U':
                for (int j = 0; j < 7; j++)
                    row += (j == 0 && i < 6) || (j == 6 && i < 6) || (i == 6 && j > 0 && j < 6) ? "*" : " ";
                break;
            case 'V':
                for (int j = 0; j < 7; j++)
                    row += (j == i && i < 4) || (i + j == 6 && i < 4) || (i >= 4 && ((j == 2 && i == 5) || (j == 4 && i == 5) || (j == 3 && i == 6))) ? "*" : " ";
                break;
            case 'W':
                for (int j = 0; j < 7; j++)
                    row += (j == 0 || j == 6 || (i == j && i >= 3) || (i + j == 6 && i >= 3)) ? "*" : " ";
                break;
            case 'X':
                for (int j = 0; j < 7; j++)
                    row += (i == j) || (i + j == 6) ? "*" : " ";
                break;
            case 'Y':
                for (int j = 0; j < 7; j++)
                    row += ((i == j && i < 4) || (i + j == 6 && i < 4) || (j == 3 && i >= 4)) ? "*" : " ";
                break;
            case 'Z':
                for (int j = 0; j < 7; j++)
                    row += (i == 0 || i == 6 || i + j == 6) ? "*" : " ";
                break;
            default:
                row = "       ";
        }
        return row;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any name or word: ");
        String name = sc.nextLine().toUpperCase();
        sc.close();

        for (int i = 0; i < 7; i++) {
            for (int k = 0; k < name.length(); k++) {
                System.out.print(getRow(name.charAt(k), i) + "  ");
            }
            System.out.println();
        }
    }
}

