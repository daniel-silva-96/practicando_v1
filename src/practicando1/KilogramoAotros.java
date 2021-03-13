package practicando1;

import javax.swing.JOptionPane;

public class KilogramoAotros {
    public static void main(String[] args) {
        
        int kg, opcion;  
        double calculo;
        
        kg = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite cantidad de kilos a convertir: "));
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "UNIDADES DE MEDIDA PARA CONVERTIR\n\n"
        + "1. Tonelada\n"
        + "2. Gramos\n"
        + "3. Milogramos\n"
        + "4. Microgramo\n"
        + "5. Libra\n"
        + "6. Onza\n"
        + "7. Salir"));
        
        switch(opcion){
            case 1:
                calculo = kg * 0.001;
                JOptionPane.showMessageDialog(null, + kg + " kilogramo(s), su peso en toneladas es: " + calculo + " tonelada(s)");
                break;
            case 2:
                calculo = kg * 1000;
                JOptionPane.showMessageDialog(null, + kg + " kilogramo(s), su peso en gramos es: " + calculo + " gramo(s)");
                break;
            case 3:
                calculo = kg * 1000000;
                JOptionPane.showMessageDialog(null, + kg + " kilogramo(s), su peso en miligramos es: " + calculo + " miligramo(s)");
                break;
            case 4:
                calculo = kg * 1000000000;
                JOptionPane.showMessageDialog(null, + kg + " kilogramo(s), su peso en microgramos es: " + calculo + " microgramo(s)");
                break;
            case 5:
                calculo = kg * 2.20462;
                JOptionPane.showMessageDialog(null, + kg + " kilogramo(s), su peso en libras es: " + calculo + " libra(s)");
                break;
            case 6:
                calculo = kg * 35.274;
                JOptionPane.showMessageDialog(null, + kg + " kilogramo(s), su peso en Onzas es: " + calculo + " Onza(s)");
                break;
            case 7:
                System.exit(0);
            default:
                JOptionPane.showMessageDialog(null, "ERROR: NO HAY OPCION SOLICITADA");
                main(args);
        }
    }
}
