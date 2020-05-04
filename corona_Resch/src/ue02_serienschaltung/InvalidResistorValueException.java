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
public class InvalidResistorValueException extends Exception {
    private final double invalidValue;
    public InvalidResistorValueException (double invalidValue) {
        super("Widerstandswert falsch " + invalidValue);
        this.invalidValue = invalidValue;
    }
    
    public double getInvalidValue () {
        return invalidValue;
    }
}
