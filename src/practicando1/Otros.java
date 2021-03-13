package practicando1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Otros {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int num_fact, codigo_fact, cant_litr, cont_fact = 0, cant_lT = 0;
        float precio_litr, fact_total = 0, cant_fact;
        
        System.out.println("Introducir cantidad de facturas: ");
        num_fact = s.nextInt();
        
        for (int i = 1; i <= num_fact; i++) {
            System.out.println("Ingresar codigo factura " + i + " : ");
            codigo_fact = s.nextInt();
            
            System.out.println("Cantidad de litros vendidos de factura " + i + " : ");
            cant_litr = s.nextInt();
            
            precio_litr = 50;
            cant_fact = precio_litr * cant_litr;
            fact_total = fact_total + cant_fact;
            
            cant_lT = cant_lT + cant_litr;
            
            if (cant_fact > 600) {
                cont_fact = cont_fact + 1;
            }
            
        }
        System.out.println("Facturacion total: " + fact_total);
        System.out.println("Cantidad de articulos vendidos: " + cant_lT);
        System.out.println("Facturas de mas de 600$ : " + cont_fact);
    }
}