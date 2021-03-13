package practicando1;

import java.util.Scanner;

public class Ecuacion2Grado {
    public static void main(String[] args) {
        
        double a, b, c;
        double x1, x2, d;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese primer coheficiente (a): ");
        a = s.nextDouble();
        System.out.println("Ingrese segundo coheficiente (b): ");
        b = s.nextDouble();
        System.out.println("Ingrese tercer coheficiente (c): ");
        c = s.nextDouble();
        
        d = ((b*b) - 4*a*c);
        
        if (d < 0) {
            System.out.println("No existe coherencia");
        } else {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("La solucion es: " + x1);
            System.out.println("La solucion es: " + x2);
        }
    }
}
