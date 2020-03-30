/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue01_taschenrechner;

/**
 *
 * @author paul4
 */
public class Taschenrechner  {
   public double a;
   public double b;

   public Taschenrechner (double a, double b) {
       this.a = a;
       this.b = b;
   }

   public double getAdditionsResult() { 
       double ar = a + b;
       return ar;
   }

   public double getSubtractionResult() { 
       double sr = a - b;
       return sr;
   }

   public double getMultiplicationResult() { 
       double mr = a * b;
       return mr;
   }

   public double getDivisionResult() { 
       double dr = a / b;
       return dr;
   }
}

