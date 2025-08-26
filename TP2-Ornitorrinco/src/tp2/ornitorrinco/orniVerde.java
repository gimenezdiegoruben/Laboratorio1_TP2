package tp2.ornitorrinco;
import java.util.Scanner;

/** GRUPO 6 **/
/* Hecho Por Tomas Migliozzi */

public class orniVerde extends papaCastor implements mamaPata{
    private String nombre;

    public OrniVerde(String nombre,double cola , double velocidad) {
        super(cola, velocidad);
        this.nombre = nombre;
    }
    
    public void tocarOrgano(Scanner sc){
        System.out.println("Do-Re-Mi...");
        System.out.println("Presione cualquier enter para continuar");
        sc.nextLine();
        System.out.println("Fa-Sol-La-Si");
    }
    
    public void tocarGuitorgan(Scanner sc){
        super.tocarGuitarra();
        tocarOrgano(sc);
        System.out.println("cuac cuaac....");

    }

    public String getNombre() {
        return nombre;
    }
    
    @Override
        public void nadar(){
        super.nadar();
    }
}
