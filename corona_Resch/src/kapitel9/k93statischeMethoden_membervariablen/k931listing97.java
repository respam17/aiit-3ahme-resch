/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapitel9.k93statischeMethoden_membervariablen;

/**
 *
 * @author paul4
 */
public class k931listing97 {
    static private int objcnt = 0;
 
   public k931listing97()
   {
     ++objcnt;
   }
 
   public void finalize()
   {
     --objcnt;
   }
 
   public static void main(String[] args)
   {
     k931listing97 auto1;
     k931listing97 auto2 = new k931listing97();
     System.out.println(
       "Anzahl Testauto-Objekte: " + k931listing97.objcnt
     );
   }
}
