/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue02_serienschaltung;

/**
 *
 * @author paul4
 */
public class TestSerienschaltung {
    public static void main(String[] args) {
        try {
            final Serienschaltung serienschaltung = new Serienschaltung();                

            System.out.println("1: " + serienschaltung);        
            serienschaltung.addWiderstand(10);        
            System.out.println("2: " + serienschaltung);        
            serienschaltung.setStrom(0.5);        
            System.out.println("3: " + serienschaltung);        
            serienschaltung.addWiderstand(15);        
            System.out.println("4: " + serienschaltung);        
            serienschaltung.addWiderstand(20);        
            System.out.println("5: " + serienschaltung);                
            serienschaltung.setStrom(1);        
            System.out.println("6: " + serienschaltung);
        } catch (Exception ex) {
        
        }
    }
}
