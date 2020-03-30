/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapitel6.k68vorrangregeln;

/**
 *
 * @author paul4
 */
public class k68listing68 {
    public static void main(String[] args) {
        int i = 55;
        int j = 97;
        //if (i & 15 < j & 15) {        KLAMMERSETZUNG!!
        if ((i & 15) < (j & 15)) {      //korrigiert
        System.out.println("LowByte(55) < LowByte(97)");
        } else {
        System.out.println("LowByte(55) >= LowByte(97)");
        }
    }
}
