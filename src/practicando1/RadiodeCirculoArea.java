package practicando1;

import java.util.Scanner;

public class RadiodeCirculoArea {
    public static void main(String[] args) {
        
        // Pedir el radio de un círculo y calcular su área. A=PI*r^2.
        
        double a, r;
        
        Scanner s = new Scanner (System.in);
        System.out.println("Digitar radio: ");
        r = s.nextDouble();
        
        a = Math.PI *(Math.pow(r, 2));   // valor de pi  , valor de exponentes pow.
        System.out.println("El area de una circunferencia de radio " + r + " es: " + a);
    }
}
