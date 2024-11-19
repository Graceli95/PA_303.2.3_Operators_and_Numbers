package com.JavaFundamentals;

public class RightShiftOperator2 {
    public static void main(String[] args) {
        int testValue[] = {150, 225, 1555, 32456};
        for (int value : testValue) {
            int x = value;
//            initial decimal value
            System.out.println("The initial value is " + x);
//            initial binary
        System.out.println("The initial binary is " + Integer.toBinaryString(x));
//       predict results for right shift by 2
//       right shift by 2 means divides the number by 4 (integer division)
//       binary prediction: remove the last two bits of the binary representation
            int predictedDecimal = x / 4;
            String predictedBinary = Integer.toBinaryString(x).substring(0,Integer.toBinaryString(x).length()-2);
            System.out.println("Predicted decimal (after shift) is: " + predictedDecimal);
            System.out.println("Predicted binary (after shift) is: " + predictedBinary);
//            perform the right shift
            x = x>>2;
//       print the actual results
            System.out.println("Actual value (decimal, after shift): " + x);
            System.out.println("Actual binary (after shift) is: " + Integer.toBinaryString(x));
        }


    }
}
