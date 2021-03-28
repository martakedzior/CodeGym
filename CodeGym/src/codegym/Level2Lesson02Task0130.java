/* 
Nasz pierwszy konwerter!
Metoda konwertujCelsjuszaNaFahrenheita(int celsjusz) przyjmuje wartość w stopniach Celsjusza. Ta metoda powinna konwertować wartość temperatury i zwracać ją w stopniach Fahrenheita.
Wartość temperatury w stopniach Celsjusza (TC) i wartość temperatury w stopniach Fahrenheita (TF) są powiązane następującą zależnością:
TC = (TF - 32) * 5/9.

Przeanalizuj ten przykład:
Wartość 41 jest przekazywana do metody konwertujCelsjuszaNaFahrenheita.

Przykładowy wynik:
105.8
*/
package codegym;

/**
 *
 * @author Marta
 */
public class Level2Lesson02Task0130 {
    public static void main(String[] args) {
        System.out.println(konwertujCelsjuszaNaFahrenheita(41));
    }

    public static double konwertujCelsjuszaNaFahrenheita(int celsjusz) {
        double fahrenheit = celsjusz * 9/5.0 + 32;
        return fahrenheit;
    }    
}
