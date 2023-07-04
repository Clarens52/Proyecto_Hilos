
package proyecto_hilos;

import java.text.SimpleDateFormat;
import java.util.Date;


class Hilos_1 extends Thread{
    @Override
    public void run(){
        System.out.println("Inicio de Hilo 1");
        int n;
        int contador=0;
        for (n=1;n<=5;n++){
            if (n <= 5) {
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date Fecha_Hora = new Date();
                System.out.println("Hilo 1: " + formatter.format(Fecha_Hora));
            } 
        }
        System.out.println("Fin de Hilo 1");
        System.out.println("");
        
    } 
}

class Hilos_2 extends Thread{
    @Override
    public void run(){
        System.out.println("Inicio de Hilo 2");
        int n;
        int contador=0;
        for (n=1;n<=5;n++){
            if (n <= 5) {
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date Fecha_Hora = new Date();
                System.out.println("Hilo 2: " + formatter.format(Fecha_Hora));
            } 
        }
        System.out.println("Fin de Hilo 2");
        System.out.println("");
    } 
}

class Hilos_3 extends Thread{
    @Override
    public void run(){
        System.out.println("Inicio de Hilo 3");
        int n;
        int contador=0;
        for (n=1;n<=5;n++){
            if (n <= 5) {
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date Fecha_Hora = new Date();
                System.out.println("Hilo 3: " + formatter.format(Fecha_Hora));
            } 
        }
        System.out.print("Fin de Hilo 3");
        System.out.println("");
    } 
}

class Hilos_4 extends Thread{
    @Override
    public void run(){
        System.out.println("Inicio de Hilo 4");
        int n;
        int contador=0;
        for (n=1;n<=5;n++){
            if (n <= 5) {
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date Fecha_Hora = new Date();
                System.out.println("Hilo 4: " + formatter.format(Fecha_Hora));
            } 
        }
        System.out.print("Fin de Hilo 4");
        System.out.println("");
    } 
}


public class Proyecto_Hilos {

    
    public static void main(String[] args) {
        
        Hilos_1 objeto1 = new Hilos_1();
        objeto1.start();
        try {Thread.sleep(1000);} catch (InterruptedException ex) {}
        Hilos_2 objeto2 = new Hilos_2();
        objeto2.start();
        try {Thread.sleep(1000);} catch (InterruptedException ex) {}
        Hilos_3 objeto3 = new Hilos_3();
        objeto3.start();
        try {Thread.sleep(1000);} catch (InterruptedException ex) {}
        Hilos_4 objeto4 = new Hilos_4();
        objeto4.start();
        
    }
    
}
