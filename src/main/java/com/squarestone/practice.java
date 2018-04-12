/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

package com.squarestone;

import java.util.Scanner;

class TestClass {
    public static void main(String args[]) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner s = new Scanner(System.in);
        System.out.println("Num?");
        int num = s.nextInt();

        Scanner s2 = new Scanner(System.in);
        System.out.println("Name?");
        String name = s2.nextLine();                 // Reading input from STDIN

        if (num >= 0 && num <= 10) {
            System.out.println(num * 2);
        }

        if (name.length() >= 1 && name.length() <= 15) {
            System.out.println(name);    // Writing output to STDOUT
        }
    }

}

