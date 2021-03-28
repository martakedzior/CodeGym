/*
W metodzie main utwórz obiekt Mezczyzna i zapisz referencję do niego w zmiennej mezczyzna.
Utwórz również obiekt Kobieta i zapisz referencję do niego w zmiennej kobieta.

Wskazówka: Aby utworzyć obiekt Kobieta i referencję do tego obiektu przypisać do zmiennej kobieta, użyj poniższej konstrukcji:
TypZmiennej nazwaZmiennej = new TypTworzonegoObiektu();
Zapisz referencję do wcześniej utworzonego obiektu Kobieta w mezczyzna.partnerka.
Zapisz referencję do wcześniej utworzonego obiektu Mezczyzna w kobieta.partner (Wskazówka: kobieta.partner = mezczyzna).
 */
package codegym;

/**
 *
 * @author Marta
 */
public class Level2Lesson02Task0204 {
    public static void main(String[] args) {
        Kobieta kobieta = new Kobieta();
        Mezczyzna mezczyzna = new Mezczyzna();
        kobieta.partner = mezczyzna;
        mezczyzna.partnerka = kobieta;
    }

    public static class Mezczyzna {
        public int wiek;
        public int wzrost;
        public Kobieta partnerka;
    }

    public static class Kobieta {
        public int wiek;
        public int wzrost;
        public Mezczyzna partner;
    }    
}
