/**

  File name: Average3.java

  This program does the following:
    Prompts the user to enter three integers,
    then calculates and prints the average of the three numbers.

  Author: Lew Rakocy
  email address: LRakocy@devrycols.edu
  Date: 2/14/99
  Last changed: Updated for 4th edition by Brian Durney, November 2004

*/

import java.util.*;

 public class Average3
{
    public static void main(String[] args)
    {
		Scanner keyboard = new Scanner(System.in);
        int firstInteger;
        int secondInteger;
        int thirdInteger;

        // Use double - average may have a fractional part
        double average = 0;

        System.out.println("Enter the first integer.");
        firstInteger = keyboard.nextInt();
        average = average + firstInteger; // intermediate sum

        System.out.println("Enter the second integer.");
        secondInteger = keyboard.nextInt();
        average = average + secondInteger; // intermediate sum

        System.out.println("Enter the third integer.");
        thirdInteger = keyboard.nextInt();
        average = average + thirdInteger; // intermediate sum

        average = average/3; // All 3 have been added - calculate the average
        System.out.println("The average of " + firstInteger + ", "
                            + secondInteger + ", and "
                            + thirdInteger + " = " + average);
    }
}

