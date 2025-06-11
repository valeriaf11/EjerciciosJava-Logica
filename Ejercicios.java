import java.util.Scanner;

public class Ejercicios {
    //En la parte mas alta se declaran los argumentos y variables
    int calificacion = 4; //calificacion de un estudiantes

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        //voy a crear una instancia para poder acceder a la variable
        //calificacion
        Ejercicios ejercicioUno = new Ejercicios();

        System.out.println(ejercicioUno.calificacion);
        //aqui ya que conozco el numero, puedo hacer una evaluacion
        //de tipo if-else (si-lo contrario)

        if (ejercicioUno.calificacion <= 5) {
            System.out.println("Estas reprobado");
        }else{
            System.out.println("Estas aprobado, sigue asi");
        }
    }
}
