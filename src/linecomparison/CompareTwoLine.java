package linecomparison;

import java.util.Scanner;

public class CompareTwoLine {
    int x1, y1, x2, y2;
    double lengthOne;
    double lengthTwo;

    public void lengthCalculation() {

        System.out.println("Please Enter the co-ordinates of 1st Line");
        Scanner scanner = new Scanner(System.in);
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        double length1 = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        System.out.println("length = " + length1);

        System.out.println("Please Enter the co-ordinates of 2nd Line");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        double length2 = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        System.out.println("length = " + length2);
    }

    public void equalLines(Double lineOne, Double lineTwo) {
        if (lineOne.equals(lineTwo)) {
            System.out.println(" The both lines are equal");
        } else {
            System.out.println("The both lines are not equal");
        }
    }

    public void compareToMethod(Double lineOne, Double lineTwo) {
        int comparisonOfTwoLines = lineOne.compareTo(lineTwo);
        if (comparisonOfTwoLines > 0) {
            System.out.println("line one  is greater than Length of line two");
        } else if (comparisonOfTwoLines < 0) {
            System.out.println("line one is less than Length of line two");
        } else {
            System.out.println("line one is equal to Length of line two");
        }
    }

    void printEqualAndCompareMethod() {
        equalLines(lengthOne, lengthTwo);
        compareToMethod(lengthOne, lengthTwo);
    }
}
