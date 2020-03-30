/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapitel8.k82klassen_objekte;

/**
 *
 * @author paul4
 */

//Programm verstanden und selbst geschrieben
class Auto
 {
   public String hersteller;
   public String bezeichnung;
   public int baujahr;
   public int erstzulassung;
   public int leistung;
   public double preis;
 }

public class k821
{
    public static void main (String[] args) {
        Auto erstesAuto = new Auto();
        erstesAuto.hersteller = "Mercedes";
        erstesAuto.bezeichnung = "G63";
        erstesAuto.baujahr = 2019;
        erstesAuto.erstzulassung = 2019;
        erstesAuto.leistung = 700;
        erstesAuto.preis = 257000.99;

        System.out.println("Erstes Auto");
        System.out.println("Hersteller "+erstesAuto.hersteller);
        System.out.println("Bezeichnung "+erstesAuto.bezeichnung);
        System.out.println("Baujahr "+erstesAuto.baujahr);
        System.out.println("Leistung "+erstesAuto.leistung);
        System.out.println("Erstzulassung "+erstesAuto.erstzulassung);
        System.out.println("Preis "+erstesAuto.preis);
        System.out.println("Alter in Jahre: " +(2020 - erstesAuto.erstzulassung));
    } 
}
