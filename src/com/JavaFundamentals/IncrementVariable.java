package com.JavaFundamentals;

/**
 * Write a program that demonstrates at least three ways to increment a variable by 1 and does this multiple times. Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, and then print it again.
 */
public class IncrementVariable {
    public static void main(String[] args) {
        int a = 10;
        a++;
        System.out.println(a);
        a = a+1;
        System.out.println(a);
        ++a;
        System.out.println(a);
        a +=1;
        System.out.println(a);


    }
}
