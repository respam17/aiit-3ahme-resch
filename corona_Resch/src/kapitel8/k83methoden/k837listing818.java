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
public class k837listing818 {
     public static String getAndPrint(String s)
   {
     System.out.println(s);
     return s;
   }
 
   public static void main(String[] args)
   {
     Son son = new Son();
   }
 }
 
 class Father
 {
   private String s1 = k837listing818.getAndPrint("Father.s1");
 
   public Father()
   {
     k837listing818.getAndPrint("Father.<init>");
   }
 }
 
 class Son
 extends Father
 {
   private String s1 = k837listing818.getAndPrint("Son.s1");
 
   public Son()
   {
     k837listing818.getAndPrint("Son.<init>");
  }
}