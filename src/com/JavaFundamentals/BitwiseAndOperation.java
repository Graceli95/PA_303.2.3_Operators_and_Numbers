package com.JavaFundamentals;

public class BitwiseAndOperation3 {
    public static void main(String[] args) {
        int x = 7;
        int y = 17;
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(y));
//       I predict the result of the bitwise and operation on x and y is 1
        System.out.println(x&y);
        int z = x & y;
        System.out.println(Integer.toBinaryString(z));
    }
}
