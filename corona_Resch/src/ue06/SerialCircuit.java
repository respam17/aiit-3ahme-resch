/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author paul4
 */
public class SerialCircuit {
    
    private final List<Component> list = new ArrayList();
    private final double current;
    
    public SerialCircuit (Collection<Component> list, double current) {
        this.list.addAll(list);
        this.current = current;
        for (Component c : this.list) {
            c.setCurrent(current);
        }
    }
}
