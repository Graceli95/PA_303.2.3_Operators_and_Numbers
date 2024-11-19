package com.JavaFundamentals;
//Write a program that declares two integer variables: x, and y, and then assigns 5 to x and 8 to y. Create another variable sum and assign the value of ++x added to y, and print the result. Notice the value of the sum (should be 14). Now change the increment operator to postfix (x++) and re-run the program. Notice what the value of the sum is. The first configuration incremented x, and then calculated the sum, while the second configuration calculated the sum, and then incremented x.
public class PrefixAndPostfix {
    public static void main(String[] args) {
        int x = 5;
        int y = 8;
//        ++x is to increment x by 1 first,then add y,,,,prefix
        int z = ++x + y;
        System.out.println(z);

        x = 5;
//        add y first, then set to a ( means a becomes x+y), finally x+1,,, postfix
        int a = x++ + y;
        System.out.println(a);

    }
}
