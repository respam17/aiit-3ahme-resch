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

//Programm großteils verstanden
/*
? 'instanceof Number'
? '((Number)anzahl[i].doubleValue()'
*/
public class k834
 {

   public static void Menge(Object... anzahl)
   {
     double menge = 0;
     double summeDerMengen = 0;
     for (int i = 0; i < anzahl.length; ++i) {
        if (anzahl[i] instanceof Number) {
            menge += ((Number)anzahl[i]).doubleValue();
        } else {
            System.out.println(anzahl[i] + ": " + menge);
            summeDerMengen += menge;
            menge = 0;
        }
      }
   }

   public static void Tankvorgaenge(Object... args)
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
       Menge(
        15.30, 20.01, 19.90, "Menge"
       );

       Tankvorgaenge(
       17.90, 22.3, 21.30, "Gezahlt",
       -10, "Gutschein"
     );
   }
 }
