package practicando1;

import javax.swing.JOptionPane;

public class SimularCalculadora {
    public static void main(String[] args) {
        
        int num1, num2, suma, resta, multi, div;
        char operaciones;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese primer numero"));
        
        operaciones = JOptionPane.showInputDialog(null, "Ingresar operacion \n\n"
        + "'s'. Digitar (s o S) para suma\n"
        + "'r'. Digitar (r o R) para resta\n"
        + "'p'. Digitar (p, P o m, M) para multiplicacion\n"
        + "'d'. Digitar (d o D) para dividir").charAt(0);
        
        switch (operaciones){
            case 's':
            case 'S':
                suma = num1 + num2;
                JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + suma);
                break;
                
            case 'r':
            case 'R':
                resta = num1 - num2;
                JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + resta);
                break;
                
            case 'p':
            case 'P':
            case 'm':
            case 'M':
                multi = num1 * num2;
                JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: " + multi);
                break;
                
            case 'd':
            case 'D':
                div = num1 / num2;
                JOptionPane.showMessageDialog(null, "El resultado de la division es: " + div);
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "ERROR: NO HAY EXPRESION O NUMEROS INGRESADOS EQUIVOCADOS");
        }
    }
}
