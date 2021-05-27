/*   Created by IntelliJ IDEA.
 *   Author: Goldi Maurya
 *   Date: 27-05-2021
 *   Time: 10:59
 *   File: InvalidAgeException.java
 */

package exapmple5;

public class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        super();
        System.out.println("Invalid age");
    }
}