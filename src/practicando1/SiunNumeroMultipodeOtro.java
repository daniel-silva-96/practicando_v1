package practicando1;

import java.util.Scanner;

public class SiunNumeroMultipodeOtro {
    public static void main(String[] args) {
        
        //Pedir dos números y decir si uno es múltiplo del otro.
        
        int num1 , num2;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Digite primer numero: ");
        num1 = s.nextInt();
        System.out.println("Digite segundo numero: ");
        num2 = s.nextInt();
        
        if (num1 % num2 == 0) {
            System.out.println("Son multiplos entre si");
        } else {
            System.out.println("No son multiplos entre si");
        }
    }
}
