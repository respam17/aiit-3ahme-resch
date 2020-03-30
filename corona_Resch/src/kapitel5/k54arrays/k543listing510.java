/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapitel5.k54arrays;

/**
 *
 * @author paul4
 */
public class k543listing510 {
     public static void main(String[] args) {
     int[][] a = { {0},
                   {1,2},
                   {3,4,5},
                   {6,7,8,9}
                  };
     for (int i=0; i<a.length; ++i) {
       for (int j=0; j<a[i].length; ++j) {
         System.out.print(a[i][j]);
       }
       System.out.println();
     }
   }
}
