/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapitel8.k83methoden;

/**
 *
 * @author paul4
 */
/*Programm großteils verstanden
/
? 'instanceof Number'
? '((Number)anzahl[i].doubleValue()'
*/
public class k834listing812 {
      public static void registrierKasse(Object... args)
   {
     double zwischensumme = 0;
     double gesamtsumme   = 0;
     for (int i = 0; i < args.length; ++i) {
       if (args[i] instanceof Number) {
         zwischensumme += ((Number)args[i]).doubleValue();
       } else {
         System.out.println(args[i] + ": " + zwischensumme);
         gesamtsumme += zwischensumme;
         zwischensumme = 0;
       }
     }
     System.out.println("Gesamtsumme: " + gesamtsumme);
   }
 
   public static void main(String[] args)
   {
     registrierKasse(
       1.45, 0.79, 19.90, "Preis",
       -3.00, 1.50, "Pfand",
       -10, "Gutschein"
     );
   }
}
