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
public class Level2Lesson02Task0213 {
    public static void main(String[] args) {
        Kot kot = new Kot();
        Pies pies = new Pies();
        Ryba ryba = new Ryba();
        Kobieta kobieta = new Kobieta();
        kot.wlasciciel = kobieta;
        pies.wlasciciel = kobieta;
        ryba.wlasciciel = kobieta;
           
    }

    public static class Kot {
        public Kobieta wlasciciel;
    }

    public static class Pies {
        public Kobieta wlasciciel;
    }

    public static class Ryba {
        public Kobieta wlasciciel;
    }

    public static class Kobieta {
    }    
}
