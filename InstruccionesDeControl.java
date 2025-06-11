public class InstruccionesDeControl {
    public static void main(String[] args) {
        // 2 if
        int a = 5;
        if (a > 0) System.out.println("Positivo");

        if (a == 5) System.out.println("Es cinco");

        // 2 if-else
        boolean llueve = false;
        if (llueve) System.out.println("Lleva paraguas");
        else System.out.println("No necesita paraguas");

        String nombre = "Valeria";
        if (nombre.equals("Valeria")) System.out.println("Hola Valeria");
        else System.out.println("Quién eres?");

        // 1 for
        for (int i = 1; i <= 3; i++) System.out.print(i + " ");

        // 1 do-while
        int x = 0;
        do {
            System.out.print("Hola ");
            x++;
        } while (x < 2);

        // 1 break
        for (int i = 10; i > 0; i--) {
            if (i == 7) {
                System.out.print("Break!");
                break;
            }
            System.out.print(i + " ");
        }
    }
}

