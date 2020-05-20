/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue02_serienschaltung;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paul4
 */
public class TestSerienschaltung {
    public static void main(String[] args) {
            final Serienschaltung serienschaltung = new Serienschaltung();                

                    
        try {
            System.out.println("1: " + serienschaltung);
            serienschaltung.addWiderstand(-10);
        } catch (Exception ex) {
            System.out.println("Fehler");
            System.out.println(ex.getMessage());
            if (ex instanceof InvalidResistorValueException) {
                double v = ((InvalidResistorValueException)ex).getInvalidValue();
            }
            throw new TestFailedException(ex);
        }
            System.out.println("2: " + serienschaltung);        
            serienschaltung.setStrom(0.5);        
            System.out.println("3: " + serienschaltung);        
        try {        
            serienschaltung.addWiderstand(-15);
        } catch (Exception ex) {
            System.out.println("Fehler");
            System.out.println(ex.getMessage());
        }
            System.out.println("4: " + serienschaltung);        
        try {        
            serienschaltung.addWiderstand(20);
        } catch (Exception ex) {
            System.out.println("Fehler");
            System.out.println(ex.getMessage());
        }
            System.out.println("5: " + serienschaltung);                
            serienschaltung.setStrom(1);        
            System.out.println("6: " + serienschaltung);
    }
    
    public static class TestFailedException extends RuntimeException {

        public TestFailedException(Throwable cause) {
            super(cause);
        }
        
    }
}
