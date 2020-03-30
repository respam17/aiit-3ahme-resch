/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapitel5.k56typkonvertierungen;

/**
 *
 * @author paul4
 */
public class k562listing513 {
    public static void main(String[] args) {
        for (int i = 0; i < 256; ++i) {
       System.out.print("i=" + i);
       byte b = ByteKit.fromUnsignedInt(i);
       System.out.print(" b=" + ByteKit.toBitString(b));
       char c = ByteKit.toChar(b);
       System.out.print(" c=" + (c >= 32 ? c : '.'));
       System.out.println();
    }
  }
}
