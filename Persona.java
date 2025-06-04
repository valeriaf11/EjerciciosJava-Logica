public class Persona {
    //Todas las personas pueden hacer muchas cosas, las personas tienen nombre, edad
    //etc, asi que vamos a simular algunas actividades mediante metodos.

    //Una buena practica es declarar viariables en la parte mas alta del codigo

    int edad = 20;

    void mayorDeEdad() {
        if (edad >= 18) {
            System.out.println("Eres un mayor de edad");
        }else{
            System.out.println("Eres un adolescente");
        }
    }

    void descansar(boolean estaCansado) {
        if(estaCansado){
            System.out.println("Vete a dormir");
        } else {
            System.out.println("Sigue practicando codigo...:3");
        }
    }
}