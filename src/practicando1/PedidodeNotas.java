package practicando1;

import javax.swing.JOptionPane;

public class PedidodeNotas {
    public static void main(String[] args) {
        
        String nota;
        
        nota = JOptionPane.showInputDialog(null,"Ingresar nota");
        
        switch (nota){
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                JOptionPane.showMessageDialog(null, "Insuficiente");
                break;
            case "6":
                JOptionPane.showMessageDialog(null, "Suficiente");
                break;
            case "7":
                JOptionPane.showMessageDialog(null, "Bien");
                break;
            case "8":
            case "9":
                JOptionPane.showMessageDialog(null, "Notable");
                break;
            case "10":
                JOptionPane.showMessageDialog(null, "Sobresaliente");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Nota ingresada debe estar entre 0 - 10");
                main(args);
                return;
        }
    }
}
