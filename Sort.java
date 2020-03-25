/*
Author: Mitchell Noun
Email: mnoun@student.bridgew.edu
Class: Compsci 152-003
Date: 3-4-20
Purpose: This class will be used in lab 6 to sort the read numbers
 */
package com.company;


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


public class Sort
{

    public static void main(String[] args)
    {

        int[] array1 = {3, 7, 4, 10, 1 };
        int length = array1.length;

        //Print unsorted array
        for (int i = 0; i < length; i++)
        {
            System.out.println(array1[i]);
        }

        System.out.println();

        for (int i = 0; i < length-1; i++)
        {
            // Find the minimum element in unsorted array
            int min = i;
            for (int j = i+1; j < length; j++)
                if (array1[j] < array1[min])
                    min = j;

            // Swap the found minimum with the first element
            int temp = array1[min];
            array1[min] = array1[i];
            array1[i] = temp;

        }

        //Print sorted array
        for (int a = 0; a < length; a++)
        {
            System.out.println(array1[a]);
        }
    }
}

