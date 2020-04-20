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

/*
public class Serienschaltung {
    private double strom;
    private double spannung;
    private double[] widerstandsFeld;

    public Serienschaltung(double strom, double spannung, double[] widerstand) {
        this.strom = strom;
        this.spannung = spannung;
        this.widerstandsFeld = widerstand;
    }

    Serienschaltung() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void updateSpannung() {
    {
        if (widerstandsFeld == null) {
            spannung = 0;
        } else {
            for (int i = 0; i < widerstandsFeld.length; i++) {
                spannung += strom*widerstandsFeld[i];
            }
        }
    }
    }
    
    public void addWiderstand(double widerstandInOhm) {
        
    }

    public double getStrom() {
       return 0; 
    }

    public void setStrom(double strom) {
        this.strom = strom;
        updateSpannung();
    } 

    public double getSpannung() {
        return 0;
    }

    @Override
    public String toString() {
        return "Serienschaltung{" + "strom=" + strom + ", spannung=" + spannung + ", widerstand=" + widerstandsFeld + '}';
    }
    
}
*/

public class Serienschaltung {

    private double strom;
    private double spannung;
    private double[] widerstandFeld;

    private void updateSpannung() {
        if (widerstandFeld == null) {
            spannung = 0;
        } else {
            for (int i = 0; i < widerstandFeld.length; i++) {
                spannung += strom * widerstandFeld[i];
            }
        }
    }

    public void addWiderstand(double widerstandInOhm) {
        if (widerstandFeld == null) {
            widerstandFeld = new double[1];
            widerstandFeld[0] = widerstandInOhm;
        } else {
            double tmp[];
            tmp = new double[widerstandFeld.length];
            System.arraycopy(widerstandFeld, 0, tmp, 0, widerstandFeld.length);
            widerstandFeld = new double[widerstandFeld.length + 1];
            System.arraycopy(tmp, 0, widerstandFeld, 0, widerstandFeld.length);
            widerstandFeld[widerstandFeld.length] = widerstandInOhm;
        }
        updateSpannung();
    }

    public double getStrom() {

        return 0;
    }

    public void setStrom(double strom) {
        this.strom = strom;
        updateSpannung();
    }

    public double getSpannung() {

        return 0;
    }

    @Override
    public String toString() {
        return "Serienschaltung{" + "strom=" + strom + ", spannung=" + spannung + ", widerstand=" + widerstandFeld + '}';
    }

}
