package tp2.ornitorrinco;

import java.util.Random;

/** GRUPO 6 **/

public class PapaCastor {
    
    private String longitudCola = "Ancha y plana";
    private double velocidad;

    public PapaCastor(double velocidad) {
        this.velocidad = velocidad;
    }

    public String getLongitudCola() {
        return longitudCola;
    }

    public void setLongitudCola(String longitudCola) {
        this.longitudCola = longitudCola;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double Velocidad) {
        this.velocidad = Velocidad;
    }

    public void nadar() {
        System.out.println("El papa castor nada a una velocidad de " + velocidad + " km/h con su cola de " + longitudCola);
    }

    public void tocarGuitarra() {
        Random random = new Random();
        System.out.println("Papa castor toca la guitarra:");
        for (int i = 0; i < 3; i++) {
            int cuerda = random.nextInt(6) + 1;
            System.out.println("toca cuerda " + cuerda);
        }
    }
}
