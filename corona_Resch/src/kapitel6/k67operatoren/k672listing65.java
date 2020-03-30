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
um das gewünste Ergebniss zu erhalte, muss man beim Teilausdruck '3 + 4' daruaf auchten ihn in klammern zu setzen
es kommt in diesem Fall '34' anstatt '7' als Ergebniss heraus
public class k672listing64 {
    public static void main(String[] args) {
        // Die +-Operatoren werden von innen nach außen und von
        // links nach rechts ausgewertet     
        System.out.println("3 + 4 = " + 3 + 4);
    }
}
*/
public class k672listing65 { //dies ist das korrigierte Beispiel
    public static void main(String[] args) {
        // Die +-Operatoren werden von innen nach außen und von
        // links nach rechts ausgewertet     
        System.out.println("3 + 4 = " + (3 + 4));
    }
}
