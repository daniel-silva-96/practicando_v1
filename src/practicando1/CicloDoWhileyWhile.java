package practicando1;

import java.util.Scanner;

public class CicloDoWhileyWhile {
    public static void main(String[] args) {
        
        //Ejercicio1 while
        /*Se requiere un algoritmo para obtener la suma de diez cantidades mediante
        la utilización de un ciclo “Mientras”. Realice el diagrama de flujo, el
        pseudocódigo y el diagrama N/S para representarlo.
        Con base en lo que se requiere determinar se puede*/
        
        /*int contador = 1;
        double valor_sumar = 0, suma_valores = 0;
        
        while (contador <= 10) {
            Scanner s = new Scanner(System.in);
            System.out.println("Ingrese valor a sumar");
            valor_sumar = s.nextDouble();
            suma_valores = suma_valores + valor_sumar;
            contador ++;
        }
        System.out.println("La suma de los 10 valores es: " + suma_valores);*/
        
        
        //Ejercicio 1 do while
        
        /*Se requiere un algoritmo para obtener la suma de diez cantidades mediante
        la utilización de un ciclo Repite. Realice el diagrama de flujo, el pseudocódigo
        y diagrama N/S para representarlo.
        La solución de este problema mediante el ciclo Repite, que también
        es conocido como ciclo Repeat en los diferentes lenguajes de programación,
        se puede establecer mediante el diagrama de flujo 4.2.
        Las variables que se requieren son las que se muestran en la tabla 4.1 (el
        ejemplo anterior y el presente son el mismo, lo que cambia es el planteamiento
        de solución del problema en lo que respecta al tipo de ciclo por utilizar).
        El diagrama de flujo 4.2 muestra la solución correspondiente mediante
        la utilización de este tipo de ciclo.*/
        
        /*int c = 1;
        double valor_sumar = 0, suma_valores = 0;
        
        do {            
            Scanner s = new Scanner(System.in);
            System.out.println("Ingrese valor a sumar");
            valor_sumar = s.nextDouble();
            suma_valores = suma_valores + valor_sumar;
            c++;
        } while (c <= 10);
        System.out.println("La suma de los numeros es: " + suma_valores);*/
        
        //Ejercicio 1 for
        
        /*Se requiere un algoritmo para obtener la suma de diez cantidades mediante
        la utilización de un ciclo Desde. Realice el diagrama de flujo, el pseudocódigo
        y el diagrama N/S para representarlo.
        El ciclo Desde también es conocido como ciclo For en los diferentes
        lenguajes de programación. Se utilizarán las mismas variables mostradas
        en la tabla 4.1. El diagrama de flujo 4.3 muestra la solución correspondiente
        utilizando el ciclo Desde.*/
        
        /*double valor_sumar = 0, suma_valores = 0;
        
        for (int c = 1; c <= 10; c++) {
            Scanner s = new Scanner(System.in);
            System.out.println("Ingresar los 10 primero numeros a sumar: ");
            valor_sumar = s.nextDouble();
            
            suma_valores = suma_valores + valor_sumar;
        }
        System.out.println("La suma de los valores es : " + suma_valores);*/
        
        //Ejercicio 2
        
        /*Se requiere un algoritmo para obtener la edad promedio de un grupo de N
        alumnos. Realice el diagrama de flujo, el pseudocódigo y el diagrama N/S
        para representarlo, utilizando los tres tipos de estructuras de ciclo.
        La tabla 4.2 muestra las variables que se van a utilizar para la solución
        del problema, sin importar qué estructura de ciclo se utilice; por
        consiguiente, es la misma para los tres tipos de ciclo para los que se dará
        la solución.*/
        
        //while
        /*int c = 1, edad, suma = 0, num_alum;
        double promedio = 0;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresar cantidad de alumnos: ");
        num_alum = s.nextInt();
        
        while (c <= num_alum) {    
            System.out.println("Ingresar edad de alumno de 10 años a 20 años: ");
            edad = s.nextInt();
            if (edad >= 10 && edad <= 20) {
                suma = suma + edad;
                promedio = suma / num_alum;
            } else {
                System.out.println("Edades no estan en el rango");
            }
            c++;
        }
        System.out.println("La edad promedio de los alumnos es: " + promedio);*/
        
        //do while
        /*int c = 1, edad, suma = 0, num_alum;
        double promedio = 0;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese cantidad de alumnos: ");
        num_alum = s.nextInt();
        
        do {
            System.out.println("Ingrese edad de alumnos: ");
            edad = s.nextInt();
            
            suma = suma + edad;
            promedio = suma / num_alum; 
            
            c++;
            
        } while (c <= num_alum);
        System.out.println("El promedio de edad de los " + num_alum + " alumnos es de: " + promedio);*/
        
        //for
        /*int edad, suma = 0, num_alum;
        double promedio = 0;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresar numero de alumnos: ");
        num_alum = s.nextInt();
        
        for (int c = 1; c <= num_alum; c++) {
            System.out.println("Ingrese edad de los " + num_alum + " alumnos: ");
            edad = s.nextInt();
            
            suma = suma + edad;
            promedio = suma / num_alum;
        }
        System.out.println("El promedio de los " + num_alum + " alumnos es: " + promedio);*/
        
        
        //Ejercicio 3
        
        /*Se requiere un algoritmo para obtener la estatura promedio de un grupo
        de personas, cuyo número de miembros se desconoce, el ciclo debe
        efectuarse siempre y cuando se tenga una estatura registrada. Realice el
        diagrama de flujo, el pseudocódigo y el diagrama N/S para representarlo,
        utilizando el ciclo apropiado.
        Como se puede ver, para resolver este problema no se puede utilizar
        el ciclo Desde, ya que no se tiene el número de personas exacto, que es lo
        que en un momento determinaría el número de veces que el proceso que
        se encuentra dentro del ciclo se ejecute, para este caso es necesario contar
        al menos con la estatura de una persona (para que tenga caso realizar el
        proceso del ciclo). Por otro lado, si se utiliza el ciclo Repite, se ejecutará
        por lo menos una vez y hasta que se le proporcione una estatura menor
        o igual a cero, por tal motivo no es muy conveniente utilizarlo, ya que se
        debe tener al menos una estatura para realizar lo que se pretende con el
        algoritmo.
        El ciclo que es apropiado para utilizar en la solución de este problema
        es Mientras, ya que este ciclo se realiza siempre y cuando se cuente con
        una estatura mayor a cero, de una manera natural sin forzar el proceso en
        ningún momento, y en caso de que no se tenga estatura registrada el promedio
        es cero, y se debe indicar que no existe ninguna estatura registrada.
        La tabla 4.3 muestra las variables que se van a utilizar para la solución
        de este problema. La representación del algoritmo para este problema
        se presenta mediante el diagrama de flujo 4.7, el pseudocódigo 4.7 y el
        diagrama N/S 4.7, en los cuales se utiliza el ciclo Mientras.*/
        
        //WHILE
        
        /*int c = 0, num_pers;
        double estatura = 0, estat_prome = 0, suma_estat = 0;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresar cantidad de personas: ");
        num_pers = s.nextInt();
        
        while (c < num_pers) {     
            
            System.out.println("Ingresar estatura de las personas: ");
            estatura = s.nextDouble();
            
            if (estatura > 0) {
                suma_estat = suma_estat + estatura;
                estat_prome = suma_estat / num_pers;
                c++;
            }
            
        }
        if (num_pers == 0) {
                System.out.println("No hay estatura");
        } else {
                estat_prome = suma_estat / num_pers;
        }
        System.out.println("La estatura promedio es: " + estat_prome);*/
        
        
        
        //DO-WHILE
        /*int c = 0, num_pers;
        double estatura = 0, estat_prome = 0, suma_estat = 0;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese numero de personas: ");
        num_pers = s.nextInt();

        do {
            System.out.println("Ingrese estatura");
            estatura = s.nextDouble();
            
            if (estatura > 0) {
                
                suma_estat = suma_estat + estatura;
                estat_prome = suma_estat / num_pers;
                c++;
            }
            
        } while (c < num_pers);
        if (num_pers == 0) {
            System.out.println("No hay estatura");
        } else {
            estat_prome = suma_estat / num_pers;
        }
        System.out.println("La estatura promedio es: " + estat_prome);*/
        
        
        //FOR
        /*int num_pers;
        double estatura = 0, estat_prome = 0, suma_estat = 0;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresar numero de personas: ");
        num_pers = s.nextInt();
        
        for (int c = 0; c < num_pers; c++) {
            if (estatura > 0) {
                System.out.println("Ingresar estaturas: ");
                estatura = s.nextDouble();
                
                suma_estat = suma_estat + estatura;
                estat_prome = suma_estat / num_pers;
            }
            
        }
        if (num_pers == 0) {
            System.out.println("No hay estatura");
        }
        System.out.println("La estatura promedio: " + estat_prome);*/
        
        
        
        // Ejercicio 4
        
        /*Se requiere un algoritmo para determinar, de N cantidades, cuántas son
        menores o iguales a cero y cuántas mayores a cero. Realice el diagrama de
        flujo, el pseudocódigo y el diagrama N/S para representarlo, utilizando el
        ciclo apropiado.*/
        
        
        //WHILE
        int c = 1, num, num_p, can_ne = 0, can_po = 0, can_cero = 0;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresar cantidad numeros a evaluar: ");
        num = s.nextInt();
        
        while (c <= num) {
            System.out.println("Ingresar numeros: ");
            num_p = s.nextInt();
            
            if (num > 0) {
                can_po = can_po + 1;
            } else if (num < 0) {
                can_ne = can_ne + 1;
            } else if (num == 0) {
                can_cero = can_cero + 1;
            } 
            c++;
        }
        System.out.println("Los numeros cero son: " + can_cero);
        System.out.println("Los numeros negativos son: " + can_ne);
        System.out.println("Los numeros positivos son: " + can_po);
    }
}
