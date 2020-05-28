/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klassendiagramme_koerper;

/**
 *
 * @author paul4
 */
public class Quader extends Koerper {
    private double a;
    private double b;
    private double h;

    public Quader(double a, double b, double h, double dichte) {
        super(dichte);
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getH() {
        return h;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double oberfläche() {
        return 2*(a*b + a*h + b*h);
    }

    @Override
    public double volumen() {
        return a * b * h;
    }

    @Override
    public String toString() {
        return "Quader{" + "a=" + a + ", b=" + b + ", h=" + h + '}';
    }

}
