package pattern;

import java.util.Scanner;

public class pattern123 {
    public static void printPattern(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            if (numRows % 2 == 0) {
                // For even numRows, print 1 to i for all rows
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
            } else {
                // For odd numRows, print 1 to i for the first half, and 1 to i for the second half
                if (i <= (numRows + 1) / 2) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j + " ");
                    }
                } else {
                    for (int j = 1; j <= numRows - i + 1; j++) {
                        System.out.print(j + " ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        printPattern(numRows);
    }
}
