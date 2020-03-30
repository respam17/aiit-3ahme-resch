/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapitel7.k74sonstigeAnweisungen;

/**
 *
 * @author paul4
 */

/*
public class k741listing79 {
    public static void main(String[] args) {
        assert args.length >= 2; 
        int i1 = Integer.parseInt(args[0]);
        int i2 = Integer.parseInt(args[1]);
        assert i2 != 0 : "Teilen durch 0 nicht moeglich"; 
        System.out.println(i1 + "/" + i2 + "=" + (i1/i2));
    }
}
*/

public class k741listing79 {
    public static void main(String[] args) {
        double[] zahlen = {1, 2};
        
        assert zahlen.length >= 2 : "Zwei Zahlen benötigt";
        
        double z1 = zahlen[0];
        double z2 = zahlen[1];
        
        assert z2 != 0 : "Division durch 0 nicht möglich";
        
        System.out.println(z1 + "/" + z2 + "=" +(z1/z2));
    }
}