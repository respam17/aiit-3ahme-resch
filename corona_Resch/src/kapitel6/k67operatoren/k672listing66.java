/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapitel6.k67operatoren;

/**
 *
 * @author paul4
 */

/*
ACHTUNG!!!
"Die Operatoren == und != können auch auf Objekte, also auf Referenztypen, angewendet werden.
In diesem Fall ist zu beachten, dass dabei lediglich die Gleichheit oder Ungleichheit der Referenz getestet wird.
Es wird also überprüft, ob die Objektzeiger auf ein und dasselbe Objekt zeigen, und nicht, ob die Objekte inhaltlich übereinstimmen."
*/
public class k672listing66 {
    public static void main(String[] args) {
        String a = "hallo";
        String b = "hallo";
        System.out.println("a == b liefert " + (a == b));
        System.out.println("a != b liefert " + (a != b));
    }
}
