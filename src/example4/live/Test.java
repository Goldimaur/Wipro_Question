/*   Created by IntelliJ IDEA.
 *   Author: Goldi Maurya
 *   Date: 27-05-2021
 *   Time: 10:44
 *   File: Test.java
 */

package example4.live;

import example4.music.Playable;
import example4.music.string.Veena;
import example4.music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        Veena veena = new Veena();
        Saxophone saxophone = new Saxophone();
        Playable playableVenna, playableSaxophone;
        /*c. Place the above instances in a variable of type Playable and then call play().*/
        playableVenna = new Veena();
        playableSaxophone = new Saxophone();

        veena.play();
        /*a. Create an instance of Veena and call play() method*/
        saxophone.play();
        /*b. Create an instance of Saxophone and call play() method*/

        playableVenna.play();
        /*c. Place the above instances in a variable of type Playable and then call play().*/
        playableSaxophone.play();
    }
}