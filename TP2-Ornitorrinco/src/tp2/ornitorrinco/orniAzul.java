/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.ornitorrinco;

import java.util.Comparator;

/** GRUPO 6 **/
public class orniAzul extends papaCastor implements mamaPata {
    
    private final String color = "Azul";
    private int propulsionKmS;

    public orniAzul(int propulsionKmS) {
        this.propulsionKmS = propulsionKmS;
    }

    public int getPropulsionKmS() {
        return propulsionKmS;
    }

    public void setPropulsionKmS(int propulsionKmS) {
        this.propulsionKmS = propulsionKmS;
    }
    
    public double getVelocidadEfectivaKmH() {
        // Convertimos km/s -> km/h para sumar coherentemente
        return getVelocidadKmH() + (propulsionKmS * 3600.0);
    }

    @Override
    public void nadar() {
        double v = getVelocidadEfectivaKmH();
        System.out.printf("OrniAzul nadando con propulsión: %.2f km/h%n", v);
    }
    
    public static Comparator<orniAzul> porPropulsionAsc = new Comparator<orniAzul>() {
        @Override
        public int compare(orniAzul o1, orniAzul o2) {
            // Si la propulsión del primero es menor, devuelve negativo
            if (o1.getPropulsionKmS() < o2.getPropulsionKmS()) {
                return -1;
            }
            // Si es mayor, devuelve positivo
            else if (o1.getPropulsionKmS() > o2.getPropulsionKmS()) {
                return 1;
            }
            // Si son iguales, devuelve 0
            else {
                return 0;
            }
        }
    };

    @Override
    public String toString() {
        return "OrniAzul" + 
                "---------------" + 
                "\nColor: " + color + 
                "\nPropulsion Km/s: " + propulsionKmS;
    }
    
}
