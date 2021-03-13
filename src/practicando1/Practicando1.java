package practicando1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Practicando1 {

    public static void main(String[] args) {

        int dia, mes, anio;
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca día: ");
        dia = s.nextInt();
        System.out.print("Introduzca mes: ");
        mes = s.nextInt();
        System.out.print("Introduzca año: ");
        anio = s.nextInt();
        
        if (anio == 0 || anio < 0) {
            System.out.println("Fecha Incorrecta");
        } else if (mes == 2 && (dia >=1 && dia <= 28)) {
            System.out.println(dia + "/" + mes + "/" + anio);
            System.out.println("Fecha correcta");
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && (dia >= 1 && dia <= 30)) {
            System.out.println(dia + "/" + mes + "/" + anio);
            System.out.println("Fecha correcta");
        } else if (mes == 1 || mes == 3 || mes == 5 || mes == 8 || mes == 10 || mes == 12 && (dia >= 1 && dia <= 31)) {
            System.out.println(dia + "/" + mes + "/" + anio);
            System.out.println("Fecha correcta");
        } else {
            System.out.println("Fecha incorrecta");
        }
    }
}
