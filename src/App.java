import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        showMenu(scanner);
        
        scanner.close();

    }

    private static void showMenu(Scanner scanner) {
       int opcion;
        do {

            System.out.println("===========================");
            System.out.println("Menú clase 5");
            System.out.println("---------------------------");
            System.out.println("1. Prueba ciclo While");
            System.out.println("2. Prueba ciclo do-While");
            System.out.println("3. Prueba ciclo for");
            System.out.println("0. Salir aplicacion");
            System.out.print("Ingresa una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); //limpiar buffer, gastar el enter

            switch (opcion) {
                case 1:
                    WhileTest();
                    break;
                case 2:
                    doWhileTest();
                    break;
                case 3:
                    forTest();
                    break;
                case 0:
                System.out.println("Hasta Luego");
                    break;
                default:
                    System.err.println("Ingrese una opcion valida");
                    break;
            }
            if (opcion != 0){
            pressEnter(scanner);
            }
        } while (opcion != 0);
    }

    public static void pressEnter(Scanner scanner) {
    System.out.println("Presione ENTER para continuar");
    scanner.nextLine();
}

    private static void forTest() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);

        }
        System.out.println("You Win");
    }

    private static void doWhileTest() {
        var counter = 0;
        do {
            System.out.println(counter);
            counter--;
        } while (counter > 0);
        System.out.println("!!Boom!!");
    }

    public static void WhileTest() {
        var counter = 0;
        while (counter <= 10) {
            System.out.println(counter);
            counter++;
        }
    }

}