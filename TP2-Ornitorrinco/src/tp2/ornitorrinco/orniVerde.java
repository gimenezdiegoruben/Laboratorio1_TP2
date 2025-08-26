package tp2.ornitorrinco;

import java.util.Scanner;

/** GRUPO 6 **/
/* Hecho Por Tomas Migliozzi */
public class orniVerde extends papaCastor implements mamaPata {

    private String nombre;

    public orniVerde(String nombre, double velocidad) {
        super(velocidad);
        this.nombre = nombre;
    }

    @Override
    public void tocarOrgano(Scanner sc) {
        System.out.println("Do-Re-Mi...");
        System.out.println("Presione enter para continuar");
        sc.nextLine();
        System.out.println("Fa-Sol-La-Si");
    }

    public void tocarGuitorgan(Scanner sc) {
        super.tocarGuitarra();
        tocarOrgano(sc);
        System.out.println("Cuak, Cuak...");

    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void nadar() {
        super.nadar();
    }
}
