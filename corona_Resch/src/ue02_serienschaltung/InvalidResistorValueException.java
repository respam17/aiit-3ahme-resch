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
public class InvalidResistorValueException {
    double invalidValue;
    double[] widerstand;

    public InvalidResistorValueException (int widerstand) throws IllegalArgumentException {
         if (widerstand < 0) {
             throw new IllegalArgumentException("widerstandsFeld darf nicht kleiner 0 sein");
         }
         if (widerstand > 10000000) {
             throw new IllegalArgumentException("widerstandsFeld darf nicht kleiner 10M Ohm sein");
         }
    }
}
