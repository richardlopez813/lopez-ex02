package exercise02;

import java.util.Scanner;

public class Solution02 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String args[]){
        System.out.print("What is the input string? " );
        String string = in.nextLine();

        System.out.print(string + " has " + string.length() + " characters");
    }
}
