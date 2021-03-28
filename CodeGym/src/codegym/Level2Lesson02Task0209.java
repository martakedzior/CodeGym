/* 
Max, Bella i Azor

Utwórz 3 obiekty Pies.
Zachowaj każdą instancję w oddzielnej zmiennej.
Nadaj im imiona: „Max”, „Bella” i „Azor”.
Wymagania:

    •    Program nie powinien wyświetlać tekstu na ekranie.
    •    Metoda main powinna mieć tylko trzy zmienne Pies.
    •    Zmiennym należy natychmiast przypisać wartości.
    •    Każdy Pies musi mieć przypisane imię.
    •    Klasa Pies musi mieć jedną zmienną o nazwie imie.
    •    Klasa Pies nie powinna zawierać metod.
*/
package codegym;

/**
 *
 * @author Marta
 */
public class Level2Lesson02Task0209 {
    public static void main(String[] args) {
        Pies pies1 = new Pies();
        pies1.imie = "Max";

        Pies pies2 = new Pies();
        pies2.imie = "Bella";
        
        Pies pies3 = new Pies();
        pies3.imie = "Azor";
    }

    public static class Pies {
        public String imie;
    }
}    
