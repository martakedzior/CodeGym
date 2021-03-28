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
public class Level2Lesson06Przyklad2 {
public static void main(String[] args)
  {
    Student jola = new Student();
    jola.imie = "Jola";
    jola.wiek = 21;

    Student ela = new Student();
    ela.imie = "Ela";
    ela.wiek = 15;

    System.out.println("Jola ma " + jola.wiek);
    System.out.println("Ela ma " + ela.wiek);

    Student a = jola, b = ela;

    int c = a.wiek;
    a.wiek = b.wiek;
    b.wiek = c;

    System.out.println("Jola ma " + jola.wiek);
    System.out.println("Ela ma " + ela.wiek);
  }





  static class Student
  {
    String imie;
    int wiek;
  }    
}
