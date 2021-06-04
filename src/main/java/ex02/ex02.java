/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex02;

import java.util.Scanner;

public class ex02 {
    public static void main (String[] args){
        System.out.print("What is the input string? ");
        Scanner input = new Scanner(System.in);
        String name = input.next();

        int length = name.length();

        System.out.println(name + " has " + length + " characters.");
    }
}
