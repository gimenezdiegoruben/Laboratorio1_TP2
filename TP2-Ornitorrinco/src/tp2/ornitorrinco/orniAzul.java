/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.ornitorrinco;

import java.util.Comparator;
import java.util.Scanner;

/** GRUPO 6 **/
public class orniAzul extends PapaCastor implements mamaPata {

    private final String color = "Azul";
    private int propulsionKmS;

    public orniAzul(int propulsionKmS, double velocidad) {
        super(velocidad);
        this.propulsionKmS = propulsionKmS;
    }

    public int getPropulsionKmS() {
        return propulsionKmS;
    }

    public void setPropulsionKmS(int propulsionKmS) {
        this.propulsionKmS = propulsionKmS;
    }

    public double velocidadEfectivaKmH() {
        return getVelocidad() + (propulsionKmS * 3600.0);
    }

    @Override
    public void nadar() {
        double v = velocidadEfectivaKmH();
        System.out.println("OrniAzul nadando con propulsion: " + v + " km/h");
    }

    public static Comparator<orniAzul> porPropulsionAsc = new Comparator<orniAzul>() {
        @Override
        public int compare(orniAzul o1, orniAzul o2) {

            if (o1.getPropulsionKmS() < o2.getPropulsionKmS()) {
                return -1;
            } else if (o1.getPropulsionKmS() > o2.getPropulsionKmS()) {
                return 1;
            } else {
                return 0;
            }
        }
    };

    @Override
    public String toString() {
        return "---------------"
                + "\nOrniAzul"
                + "\n---------------"
                + "\nColor: " + color
                + "\nPropulsion Km/s: " + propulsionKmS;
    }

    @Override
    public void tocarOrgano(Scanner sc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
