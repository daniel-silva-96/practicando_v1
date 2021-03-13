package practicando1;

import javax.swing.JOptionPane;

public class CajeroAutomatico {
    public static void main(String[] args) {
        
        final int saldo_inicial = 1000;
        int opcion;
        float ingreso, saldo_actual, retiro, baucher;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "BIENVENIDO A SU CAJERO AUTOMATICO \n\n" 
        + "0. Ver saldo actual\n"
        + "1. Ingrese dinero a la cuenta\n"
        + "2. Retirar dinero de la cuenta\n"
        + "3. Salir"));
        
        switch (opcion){
            case 0:
                JOptionPane.showMessageDialog(null, "Su saldo actual en cuenta es de: " + saldo_inicial);
                break;
            
            case 1:
                ingreso = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite cantidad qie desea ingresar en cuenta: "));
                saldo_actual = ingreso + saldo_inicial;
                JOptionPane.showMessageDialog(null, "Su Dinero actual en cuenta es de: " + saldo_actual);
                break;
                
            case 2:
                retiro = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite cantidad que desea retirar en cuenta: "));
                
                if (retiro > saldo_inicial) {
                    JOptionPane.showMessageDialog(null, "No cuenta con saldo suficiente para este retiro");
                    main(args);
                    return;
                } else {
                    saldo_actual = saldo_inicial - retiro;
                    JOptionPane.showMessageDialog(null, "Dinero en cuenta: " + saldo_actual);
                }
                break;
                
            case 3:
                System.exit(0);
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "ERROR: Se equivoco de opcion de menu");
                main(args);
                return;
        }
    }
}
