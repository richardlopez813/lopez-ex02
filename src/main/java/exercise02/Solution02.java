/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Lopez
 */

/*
    1. Input Scanner
    2. Ask for input string
    3. Scan for string
    4. Output string with amount of characters
 */

package exercise02;

import java.util.Scanner;

public class Solution02 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("What is the input string? " );
        String string = in.nextLine();

        System.out.print(string + " has " + string.length() + " characters");
    }
}
