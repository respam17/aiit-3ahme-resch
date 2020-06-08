/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klassendiagramme_koerper;

import java.util.Locale;

/**
 *
 * @author paul4
 */
public class Wuerfel extends Koerper{
    
    private double a;

    public Wuerfel(double a, double dichte) throws IllegalArgumentException {
        super(dichte);
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double oberflaeche() {
        return 6 * a * a;
    }

    @Override
    public double volumen() {
        return a * a * a;
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH, "{(\"a\":%e,\"dichte\":%e}", a, dichte);
    }
}
