package es.jmg;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

    // Creo instancia de la clase
    Arreglos varArreglo01 = new Arreglos();    
    // Tipo y variable para almacenar el resultado. Llamada al método.
    int[] resultado01 = varArreglo01.crearArregloYRellenarlo();
    int[] resultado02 = varArreglo01.rellenarArregloConAleatorios(6);

    // No funciona:
    // byte resultado03 = varArreglo01.contarNumerosParesEnArreglo({3,4,8,12,5});
    // He escogido tipo byte por probar algo distinto al int y porque los números son pequeños.
    // Los arreglos deben ser pasados como una variable o creados correctamente con: new tipo
    byte resultado03 = varArreglo01.contarNumerosParesEnArreglo(new byte[] {3,4,8,12,5});


    System.out.println("Arreglo01: "+Arrays.toString(resultado01));
    System.out.println("Arreglo02: "+Arrays.toString(resultado02));
    System.out.println("Arreglo03. Cantidad de números pares pasados en el arreglo: "+resultado03);

    // Otra forma de ver los resultados es poner puntos de ruptura y depurar el código. 
    // Con los tests, también. 
    }
}
