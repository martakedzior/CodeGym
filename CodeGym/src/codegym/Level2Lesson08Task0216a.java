/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codegym;

/**
 *
 * @author Marta
 */
public class Level2Lesson08Task0216a {
    public static int min(int a, int b, int c) {
        int m1 = a < b ? a : b;
        int m2 = m1 < c ? m1 : c;

        return m2;
    }


    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
    
}
