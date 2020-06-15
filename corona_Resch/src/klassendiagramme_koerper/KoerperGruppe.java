/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klassendiagramme_koerper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 *
 * @author paul4
 */
public class KoerperGruppe{
    private final List<Koerper> koerperListe = new ArrayList<>();
    private double dichte;
    
    public KoerperGruppe () {
        
    }
    
    public KoerperGruppe (Collection<Koerper> koerperListe, double dichte) {
        this.koerperListe.addAll(koerperListe);
        this.dichte = dichte;
        for (Koerper k : this.koerperListe) {
            k.setDichte(dichte);
        }
    }

    public int size() {
        return koerperListe.size();
    }

    public boolean contains(Koerper k) {
        return koerperListe.contains(k);
    }

    public boolean add(Koerper k) {
        return koerperListe.add(k);
    }

    public boolean remove(Koerper k) {
        return koerperListe.remove(k);
    }

    public double getDichte() {
        return dichte;
    }

    public void setDichte(double dichte) {
        this.dichte = dichte;
        for (Koerper k : this.koerperListe) {
            k.setDichte(dichte);
        }
    }

    public List<Koerper> getKoerperListe() {
        return koerperListe;
    }
    
    public Koerper[] toArray() {
        Koerper [] rv = new Koerper [koerperListe.size()];
        koerperListe.toArray(rv);
        return rv;
    }
    
    public double gesamtMasse () {
        double rv = 0.0;
        for (Koerper k : koerperListe) {
            rv += k.masse();
        }
        return rv;
    }
    
    public double gesamtVolumen () {
        double rv = 0.0;
        for (Koerper k : koerperListe) {
            rv += k.volumen();
        }
        return rv;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(100);
        sb.append("[\n");
        boolean firstLine = true;
        for (Koerper k : koerperListe) {
            if (firstLine) {
                firstLine = false;
            } else {
                sb.append(",\n");
            }
            sb.append("        ").append(k.toString());
        }
        sb.append("\n]");
        return sb.toString();
    }
    
    
}
