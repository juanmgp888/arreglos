package es.jmg;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContarParesTest {

    @Test
    public void testCrearArregloYRellenarlo() {
    // requiere: import static org.junit.jupiter.api.Assertions.assertArrayEquals;

            // Crear una instancia de la clase ContarPares
            ContarPares ContarPares = new ContarPares();
    
            // Crear el arreglo esperado
            int[] arregloEsperado = {23, 33, 423, 1, 33, 4, 5, 6, 32, 12};
    
            // Llamar al método a probar
            int[] arregloResultado = ContarPares.crearArregloYRellenarlo();
    
            // Verificar que el arreglo devuelto es igual al arreglo esperado
            assertArrayEquals(arregloEsperado, arregloResultado, "Los arreglos no son iguales");
    }

    @Test
    public void testRellenarArregloConAleatorios(){
        
        ContarPares ContarPares = new ContarPares();
        
        // El test debe verificar:
        // Que el tamaño del arreglo devuelto sea igual al tamaño solicitado.
        // Todos los valores del arreglo estén en el rango de [0-10].
        
        // Llamamos al método con un valor de prueba. Tamaño = 8.
        int[] arregloEsperado = ContarPares.rellenarArregloConAleatorios(8); // Tamaño del arreglo 
        // Comprobaremos su length.
        assertEquals(8,arregloEsperado.length);
    }

    @Test
    public void testContarNumerosParesEnArreglo(){
        ContarPares ContarPares = new ContarPares();

        byte[] arregloVacio = {};
        assertEquals(0, ContarPares.contarNumerosParesEnArreglo(arregloVacio), "El arreglo vacío no debe contener números pares");
        
        byte[] arregloPrueba = {3,4,8,12,5}; // No lo puedo poner directamente como argumento, por eso lo meto en una variable
        byte arregloEsperado = ContarPares.contarNumerosParesEnArreglo(arregloPrueba);
        // arregloEsperado es algo así como la variable que guarda el valor del return del método original (el .java que no es de test)

        assertEquals(3, arregloEsperado,"Efectivamente, hay dos números pares en el arreglo de prueba");

    }
}
