package com.company;
import java.util.*;
import java.io.*;
import java.util.Scanner;

// Eric Chisholm //
// Lab Assignment//
// Question 1 //
public class Main {

    public static void main(String[] args)
            throws FileNotFoundException {
        File myFile = new File("number.txt");
        Scanner inputFile = new Scanner(myFile);
        Array(inputFile);
    }

    public static void Array(Scanner input) {
        List list = new ArrayList();
        while(input.hasNextInt()){
            list.add(input.nextInt());
        }
        System.out.print("numbers: " + list);
    }
}
