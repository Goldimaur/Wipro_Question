/*   Created by IntelliJ IDEA.
 *   Author: Goldi Maurya
 *   Date: 27-05-2021
 *   Time: 10:51
 *   File: Person.java
 */

package exapmple5;

public class Person {
        public static void main(String[] args) throws InvalidAgeException {
            String name = args[0];

            int age = Integer.parseInt(args[1]);

            if (age < 18 || age >= 60)
                throw new InvalidAgeException();

            System.out.println("Name: " + name + " Age: " + age);
        }

  }