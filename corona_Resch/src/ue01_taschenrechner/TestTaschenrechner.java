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
/*
import java.util.Scanner;
import ue01_taschenrechner.Taschenrechner;
        
public class TestTaschenenrechner {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Wert a:" );
        double a = sc.nextDouble();
        
        System.out.print("Wert b: ");
        double b = sc.nextDouble();
        
        Taschenrechner taschenrechner = new Taschenrechner(a, b);
        System.out.format(" Addition: %.2lf \n" + getAdditionsResult());
        System.out.format(" Subtraktion: %.2lf \n" + getSubtractionResult());
        System.out.format(" Multiplikation: %.2lf \n" + getMultiplicationResult());
        System.out.format(" Division: %.2lf \n" + getDivisionResult());
    }
}
*/
import java.util.Scanner;

public class TestTaschenrechner {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       System.out.print("Wert a: ");
       double a = sc.nextDouble();

       System.out.print("Wert b: ");
       double b = sc.nextDouble();

       Taschenrechner taschenrechner = new Taschenrechner(a, b);
       System.out.format("  Addtion:        " + taschenrechner.getAdditionsResult()+ "\n");
       System.out.format("  Subtraktion:    " + taschenrechner.getSubtractionResult()+ "\n");
       System.out.format("  Mutliplikation: " + taschenrechner.getMultiplicationResult() + "\n");
       System.out.format("  Division:       " +taschenrechner.getDivisionResult() + "\n");
    }
}
