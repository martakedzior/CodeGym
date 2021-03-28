/* 
Mniejsza z dwóch liczb
*/
package codegym;

/**
 *
 * @author Marta
 */
public class Level2Lesson08Task0214 {
    public static int min(int a, int b) {
        int min_number;
        if (a < b)
            min_number = a;
        else
            min_number = b;

        return min_number;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }    
}
