package practicando1;

import java.util.Scanner;

public class MostrarCifrasalReves {
    public static void main(String[] args) {
        
        //Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.
        
        int num;
        int dm = 0;
        int um = 0;
        int c = 0;
        int d = 0;
        int u = 0;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresar numero entre 0 y 99 999: ");
        num = s.nextInt();
        
        // unidad
        u = num % 10;
        num = num / 10;
        // decenas
        d = num % 10;
        num = num / 10;
        // centenas
        c = num % 10;
        num = num / 10;
        // unidades de millar
        um = num % 10;
        num = num / 10;
        // decenas de millar
        dm = num;
        // lo imprimimos al revés:
        System.out.println (u + " " + d + " " + c + " " + um + " " + dm);
    }
}
