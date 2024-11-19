package com.JavaFundamentals;

public class LeftShiftOperator {
    public static void main(String[] args) {
        int y = 2;
        System.out.println("initial value (binary): " +  Integer.toBinaryString(y));
        y = y << 1;
        // I predict the decimal result will be 4
        System.out.println("Result (decimal, after shift): " + y);
        // I predict the binary result will be 100
        System.out.println("Result (binary, after shift): " + Integer.toBinaryString(y));

        int[] testValues = {9, 17, 88};

        for (int value : testValues) {
//            assign value to x
            int x = value;
            System.out.println("initial value(decimal): " + x);
            System.out.println("initial value(binary): " + Integer.toBinaryString(x));
            // Predict results for left shift by 1
// Left shift by 1 doubles the number in decimal
            int predictedDecimal = x * 2;
//            append '0' in binary
            String predictedBinary = Integer.toBinaryString(predictedDecimal) + "0";
            // I predict the result is 18
            // System.out.println("//Predicated decimal (after shift) is: " + predictedDecimal);
            System.out.println("Predicated binary (after shift) is: " + predictedBinary);
//            perform the left shift
            x = x<< 1;
//            print the actual results
            System.out.println("Actual value(decimal, after shift): " + x);
            System.out.println("Actual value(binary, after shift): " + Integer.toBinaryString(x));




        }
    }
}
