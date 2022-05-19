package linecomparison;

import java.util.Objects;
import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program!!");
        int x1, y1, x2, y2;
        System.out.println("Please Enter the co-ordinates of 1st Line");
        Scanner scanner = new Scanner(System.in);
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        double length1 = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        System.out.println("length = " + length1);

        System.out.println("Please Enter the co-ordinates of 2st Line");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        double length2 = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        System.out.println("length = " + length2);
        if (Objects.equals(length1, length2)) {
            System.out.println("length of lines are equal");
        } else {
            System.out.println("length of lines are not equal");
        }
    }
}

