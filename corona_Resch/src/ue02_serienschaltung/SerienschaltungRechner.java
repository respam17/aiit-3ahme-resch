/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue02_serienschaltung;

import java.util.Scanner;


/**
 *
 * @author paul4
 */
public class SerienschaltungRechner {
    public static void main(String[] args) {
        
        final Serienschaltung serienschaltung = new Serienschaltung();
        
        try {
            System.out.println("Strom/A: ");
            final double strom = new Scanner(System.in).nextDouble();
            serienschaltung.setStrom(strom);
        } catch (Exception ex) {
            System.exit(1);
        }
        

        while (true) {
            System.out.print("Widerstand/\u2126: ");
            double r = new Scanner(System.in).nextDouble();
            try {
                serienschaltung.addWiderstand(r);
            } catch (InvalidResistorValueException ex) {
                System.out.println("Ergebnis: ");
                System.out.println(serienschaltung);
                System.exit(0);
            }
        }
    }
    
}
