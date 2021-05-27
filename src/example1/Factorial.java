package example1;

import java.util.Scanner;

/*   Created by IntelliJ IDEA.
 *   Author: Goldi Maurya
 *   Date: 24-03-2021
 *   Time: 13:20
 *   File: example1.Factorial.java
 */
// Write a program to print factorial of N ( without using any loop)
public class Factorial {
        static int factorial(int number) {
            if(number==1||number==0)
                return 1;
            else
                return(number*factorial(number-1));
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Limit For Factorial");
            int number = scanner.nextInt();
            System.out.println(factorial(number));
            scanner.close();
        }
    }