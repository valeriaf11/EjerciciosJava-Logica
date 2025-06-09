import java.util.Scanner; // Importamos Scanner para leer datos desde el teclado

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creamos un objeto Scanner para leer la entrada del usuario

        // Pedimos al usuario que ingrese un número del 1 al 10
        System.out.print("Número (1-10): ");
        int n = sc.nextInt(); // Leemos el número ingresado y lo guardamos en la variable 'n'

        // Imprimimos un encabezado para la tabla
        System.out.println("\nTabla del " + n + ":");

        // Bucle para imprimir la tabla de multiplicar del número
        for (int i = 1; i <= 10; i++) {
            // En cada vuelta, se imprime: n x i = resultado
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}

