/* 
Skąd pochodzi Osoba?

Zadeklaruj w klasie Osoba następujące zmienne: String imie, int wiek, int waga, int pieniadze.
W metodzie main utwórz obiekt klasy Osoba i umieść referencję do niego w zmiennej osoba.

Wskazówka: Aby utworzyć obiekt Osoba i referencję do tego obiektu przypisać do zmiennej osoba, użyj poniższej konstrukcji:

TypZmiennej nazwaZmiennej = new TypTworzonegoObiektu();

*/

package codegym;

/**
 *
 * @author Marta
 */
public class Level2Lesson02Task0202 {
    public static void main(String[] args) {
        Osoba osoba = new Osoba();
    }

    public static class Osoba {
        String imie;
        int wiek;
        int waga;
        int pieniadze;
    }    
}
