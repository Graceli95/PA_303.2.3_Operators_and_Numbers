package com.JavaFundamentals;

public class BitwiseOrOperation {
    public static void main(String[] args) {
        int x = 7;
        int y = 17;
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(y));
//        I predict the result of the bitwise or operation on x and y is 23
//        print the binary
        System.out.println(Integer.toBinaryString(x | y));
//        print the decimal value
        int z = (x | y);
        System.out.println(z);
    }
}
