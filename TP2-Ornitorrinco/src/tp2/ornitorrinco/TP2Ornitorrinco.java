package tp2.ornitorrinco;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/** GRUPO 6 **/
public class TP2Ornitorrinco {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double velocidad;
        
        while(true){
            System.out.print("Velocidad base de Papa Castor (hasta 8 km/h): ");
            if(sc.hasNextDouble()){
                velocidad = sc.nextDouble();
                sc.nextLine();
                if(velocidad >= 0 && velocidad <= 8){
                    break;
                } else {
                    System.out.println("ERROR: la velocidad debe estar entre 0 y 8 Km/h");
                }
            } else {
                System.out.println("Numero invalido, intente de nuevo");
                sc.next();
            }
        }
        
        String nombreVerde = "Grupo6";
        orniVerde verde = new orniVerde(nombreVerde, velocidad);

        System.out.println("Creamos el OrniAzul Blue:");
        int propBlue = 0;
        
        do{
            
            System.out.println("Velocidad de Propulsion: (entre 5 y 10 Km/s)");
            
            if(sc.hasNextInt()){
                propBlue = sc.nextInt();
                sc.nextLine();
                
                if(propBlue < 5 || propBlue > 10){
                System.out.println("ERROR: la velocidad debe ser entre 5 y 10 Km/s");
                }
            } else {
                System.out.println("Numero invalido, intente de nuevo");
                sc.next();
                propBlue = -1;
            }
            
        } while(propBlue < 5 || propBlue > 10);
      
        orniAzul blue = new orniAzul(propBlue, velocidad);
    
            System.out.println("Creamos el OrniAzul Blui:");
        int propBlui = 0;
        
        do{
            
            System.out.println("Velocidad de Propulsion: (entre 5 y 10 Km/s)");
            
            if(sc.hasNextInt()){
                propBlui = sc.nextInt();
                sc.nextLine();
                
                if(propBlui < 5 || propBlui > 10){
                System.out.println("ERROR: la velocidad debe ser entre 5 y 10 Km/s");
                }
            } else {
                System.out.println("Numero invalido, intente de nuevo");
                sc.next();
                propBlui = -1;
            }
            
        } while(propBlui < 5 || propBlui > 10);
        
        orniAzul blui = new orniAzul(propBlui, velocidad);

        System.out.println("--- HABILIDADES ---");
        System.out.println("OrniVerde:");
        verde.nadar();
        verde.tocarGuitarra();
        verde.tocarOrgano(sc);
        verde.tocarGuitorgan(sc);

        System.out.println("OrniAzul Blue:");
        blue.nadar();
        blue.tocarGuitarra();

        System.out.println("OrniAzul Blui:");
        blui.nadar();
        blui.tocarGuitarra();

        System.out.println("Carga en el Array");
        try {
            Object[] hermanos = new Object[3];
            hermanos[0] = blue;
            hermanos[1] = verde;
            hermanos[2] = blui;

            System.out.println("Lista de nadadores (solo orniAzul)");
            List<orniAzul> nadadores = new ArrayList<>();
            for (Object obj : hermanos) {
                if (obj instanceof orniAzul) {
                    nadadores.add((orniAzul) obj);
                }
            }

            nadadores.sort(orniAzul.porPropulsionAsc);

            System.out.println("Nadadores ordenados por propulsion (km/s) ascendente:");
            Iterator<orniAzul> it = nadadores.iterator();
            while (it.hasNext()) {
                orniAzul o = it.next();
                System.out.println(o.toString());
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error de índice en el arreglo: " + e.getMessage());
        } finally {
            System.out.println("los ornitohermanos estan juntos al fin...");
        }

        sc.close();
        
    }
    
}
