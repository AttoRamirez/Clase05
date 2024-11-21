package funcions;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    exampleRandom();

     Scanner scanner = new Scanner(System.in);
        System.out.println("=== Ejemplos de Métodos de la Clase Math ===");
        
        // 1- Métodos básicos de la clase Math
        metodosBasicos();
        
        // 2- Métodos trigonométricos
        metodosTrigonometricos();
        
        // 3- Logaritmos y exponenciales
        logaritmosYExponenciales();
        
        // 4- Constantes importantes
        constantesImportantes();
        
        // 5- Otros métodos
        otrosMetodos();
        

}

    private static void otrosMetodos() {
        System.out.println("\n5. Otros métodos");
        System.out.println("Hipotenusa de 3 y 4: " + Math.hypot(3, 4)); // Calcula la hipotenusa
        System.out.println("Signo de -10: " + Math.signum(-10)); // Devuelve el signo (-1, 0, 1)
        System.out.println("Copiar signo de 5 a -10: " + Math.copySign(5, -10)); // Copia el signo
        System.out.println("Resto IEEE de 10 y 3: " + Math.IEEEremainder(10, 3)); // Calcula el resto según IEEE
    }

    private static void constantesImportantes() {
        System.out.println("\n4. Constantes importantes");
        System.out.println("Valor de PI: " + Math.PI); // Valor de la constante PI
        System.out.println("Valor de e: " + Math.E); // Valor de la constante e
    }

    private static void logaritmosYExponenciales() {
        System.out.println("\n3. Logaritmos y exponenciales");
        System.out.println("Logaritmo natural de e: " + Math.log(Math.E)); // Devuelve el logaritmo natural
        System.out.println("Logaritmo base 10 de 100: " + Math.log10(100)); // Devuelve el logaritmo base 10
        System.out.println("Exponencial de 1: " + Math.exp(1)); // Devuelve e^1
    }

    private static void metodosTrigonometricos() {
        System.out.println("\n2. Métodos trigonométricos");
        System.out.println("Seno de PI/2: " + Math.sin(Math.PI / 2)); // Devuelve el seno de PI/2
        System.out.println("Coseno de 0: " + Math.cos(0)); // Devuelve el coseno de 0
        System.out.println("Tangente de PI/4: " + Math.tan(Math.PI / 4)); // Devuelve la tangente de PI/4
        System.out.println("Arco seno de 1: " + Math.asin(1)); // Devuelve el arco seno de 1
        System.out.println("Arco coseno de 1: " + Math.acos(1)); // Devuelve el arco coseno de 1
        System.out.println("Arco tangente de 1: " + Math.atan(1)); // Devuelve el arco tangente de 1
        System.out.println("Convertir a radianes (180°): " + Math.toRadians(180)); // Convierte grados a radianes
        System.out.println("Convertir a grados (PI radianes): " + Math.toDegrees(Math.PI)); // Convierte radianes a grados
    }

    private static void metodosBasicos() {
        System.out.println("1. Métodos básicos");
        System.out.println("Valor absoluto: " + Math.abs(-5)); // Devuelve el valor absoluto
        System.out.println("Máximo: " + Math.max(10, 20)); // Devuelve el máximo entre dos números
        System.out.println("Mínimo: " + Math.min(10, 20)); // Devuelve el mínimo entre dos números
        System.out.println("Potencia: " + Math.pow(2, 3)); // Calcula 2 elevado a la 3
        System.out.println("Raíz cuadrada: " + Math.sqrt(16)); // Calcula la raíz cuadrada
        System.out.println("Raíz cúbica: " + Math.cbrt(27)); // Calcula la raíz cúbica
        System.out.println("Redondear: " + Math.round(5.4)); // Redondea al entero más cercano
        System.out.println("Techo (ceil): " + Math.ceil(5.1)); // Redondea al entero mayor
        System.out.println("Piso (floor): " + Math.floor(5.9)); // Redondea al entero menor
        System.out.println("Número aleatorio: " + Math.random()); // Genera un número aleatorio entre 0.0 y 1.0
    }
    
    private static void exampleRandom() {
        var random = new Random();

        for (int i= 0; i < 10; i++){
        System.out.println(random.nextInt(10));
        }
    }
}
