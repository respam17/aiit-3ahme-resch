/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapitel7.k73schleifen;

/**
 *
 * @author paul4
 */
public class k733listing76 {
      public static void main(String[] args)
   {
     int[][] data = new int[10][10];
 
     //Multiplikationstafel erstellen
     for (int i = 1; i <= 10; ++i) {
       for (int j = 1; j <= 10; ++j) {
         data[i - 1][j - 1] = i * j;
       }
     }
 
     //Produkt größer 43 suchen 
   loop1:
     for (int i = 1; i <= 10; ++i) {
       for (int j = 1; j <= 10; ++j) {
         if (data[i - 1][j - 1] > 43) {
           System.out.println(i + "*" + j + "=" + (i*j));
           break loop1;
         }
       } 
     } 
   }
}
