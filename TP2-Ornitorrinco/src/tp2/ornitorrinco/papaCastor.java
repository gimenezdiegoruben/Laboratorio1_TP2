package tp2.ornitorrinco;

import java.util.Random;

/** GRUPO 6 **/
public class papaCastor {
    
    private String longitudCola = "Ancha y plana";
    private double Velocidad;

    public papaCastor(double velocidad) {
        this.Velocidad = velocidad;
    }

    public String getLongitudCola() {
        return longitudCola;
    }

    public void setLongitudCola(String longitudCola) {
        this.longitudCola = longitudCola;
    }

    public double getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(double Velocidad) {
        this.Velocidad = Velocidad;
    }

    public void nadar() {
        System.out.println("El papa castor nada a una velocidad de " + Velocidad + " km");
    }

    public void tocarGuitarra() {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int cuerda = random.nextInt(6) + 1;
            System.out.println("toca cuerda " + cuerda);
        }

    }

}
